package jz.cdgy.admin.message;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;

import java.io.IOException;
import java.util.List;


public interface RabbitLogMessage {
    void handlerLogMessage(Message message, Channel channel) throws IOException;
}
