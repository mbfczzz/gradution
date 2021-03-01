package jz.cdgy.msg.Service;

public interface PushService {
    void pushMsgToOne(String userId,String msg);

    void pushMsgToAll(String msg);
}
