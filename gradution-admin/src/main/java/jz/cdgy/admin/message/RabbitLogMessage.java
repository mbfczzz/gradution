package jz.cdgy.admin.message;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;

import java.io.IOException;


public interface RabbitLogMessage {
    void handlerLogMessage(Message message, Channel channel) throws IOException;
}
