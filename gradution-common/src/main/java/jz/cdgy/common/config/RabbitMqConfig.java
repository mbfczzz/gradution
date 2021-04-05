package jz.cdgy.common.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.amqp.SimpleRabbitListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class RabbitMqConfig {
    @Value("${gradution-msg-websocket-queue-name}")
    private  String websocketQueueName;
    @Value("${gradution-log-queue-name}")
    private  String queueName;
    @Value("${gradution-register-queue-name}")
    private  String registerQueueName;
    @Value("${gradution-log-exchange-name}")
    private  String exchange;
    @Value("${gradution-register-exchange-name}")
    private  String registerExchange;
    @Value("${gradution-msg-websocket-exchange-name}")
    private  String websocketExchange;
    @Value("${gradution-log-bind-key}")
    private  String key;
    @Value("${gradution-register-bind-key}")
    private  String registerKey;
    @Value("${gradution-msg-websocket-bind-key}")
    private  String websocketKey;

    @Autowired
    private CachingConnectionFactory connectionFactory;

    @Autowired
    private SimpleRabbitListenerContainerFactoryConfigurer factoryConfigurer;

    @Bean
    public MessageConverter messageConverter() {
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public RabbitTemplate rabbitTemplate(){
        connectionFactory.setPublisherConfirmType(CachingConnectionFactory.ConfirmType.CORRELATED);
        connectionFactory.setPublisherReturns(true);
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMandatory(true);
        rabbitTemplate.setMessageConverter(messageConverter());
        rabbitTemplate.setConfirmCallback(new RabbitTemplate.ConfirmCallback() {
            @Override
            public void confirm(CorrelationData correlationData, boolean ack, String cause) {
                log.info("消息发送成功:correlationData({}),ack({}),cause({})", correlationData, ack, cause);
            }
        });
        rabbitTemplate.setReturnCallback(new RabbitTemplate.ReturnCallback() {
            @Override
            public void returnedMessage(Message message, int replyCode, String replyText, String exchange, String routingKey) {
                log.info("消息发送ReturnCallback:{0},{1},{2},{3},{4},{5}", message,
                        replyCode,
                        replyText,
                        exchange,
                        routingKey);
            }
        });
        return rabbitTemplate;
    }

    //单一消费者
    public SimpleRabbitListenerContainerFactory listenerContainer() {
        SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
        /* setConnectionFactory：设置spring-amqp的ConnectionFactory。 */
        factory.setConnectionFactory(connectionFactory);
        /* 消息序列化类型 */
        factory.setMessageConverter(messageConverter());
        /* setConcurrentConsumers：设置每个MessageListenerContainer将会创建的Consumer的最小数量，默认是1个。 */
        factory.setConcurrentConsumers(1);
        factory.setMaxConcurrentConsumers(1);
        /* setPrefetchCount：设置每次请求发送给每个Consumer的消息数量。 */
        factory.setPrefetchCount(1);
        /* 是否设置Channel的事务。 */
        factory.setChannelTransacted(false);
        /* setTxSize：设置事务当中可以处理的消息数量。 */
        factory.setBatchSize(1);
        /* 设置当rabbitmq收到nack/reject确认信息时的处理方式，设为true，扔回queue头部，设为false，丢弃。 */
        factory.setDefaultRequeueRejected(true);
        /* factory.setErrorHandler();：实现ErrorHandler接口设置进去，所有未catch的异常都会由ErrorHandler处理。  */
        factory.setAcknowledgeMode(AcknowledgeMode.MANUAL);
        return factory;

    }

    @Bean
    public Queue logQueue(){
        return  new Queue(queueName,true);
    }

    @Bean
    public Queue registerQueue(){
        return  new Queue(registerQueueName,true);
    }
    @Bean
    public Queue websocketQueue(){
        return  new Queue(websocketQueueName,true);
    }

    @Bean
    public DirectExchange directExchange(){
        return  new DirectExchange(exchange,true,false);
    }

    @Bean
    public DirectExchange registerDirectExchange(){
        return  new DirectExchange(registerExchange,true,false);
    }

    @Bean
    public DirectExchange webSocketDirectExchange(){
        return  new DirectExchange(websocketExchange,true,false);
    }

    @Bean
    public Binding binding(){
        return BindingBuilder.bind(logQueue()).to(directExchange()).with(key);
    }

    @Bean
    public Binding registerBinding(){
        return BindingBuilder.bind(registerQueue()).to(registerDirectExchange()).with(registerKey);
    }

    @Bean
    public Binding websocketBinding(){
        return BindingBuilder.bind(websocketQueue()).to(webSocketDirectExchange()).with(websocketKey);
    }
}
