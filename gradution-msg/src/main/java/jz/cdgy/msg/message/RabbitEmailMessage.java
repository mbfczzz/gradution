package jz.cdgy.msg.message;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;

import java.io.IOException;


public interface RabbitEmailMessage {
    void handlEmailSend(Message message,Channel channel) throws IOException;
}
