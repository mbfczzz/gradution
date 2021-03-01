package jz.cdgy.msg.Service.Impl;

import io.netty.channel.Channel;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import jz.cdgy.msg.Service.PushService;
import jz.cdgy.msg.config.NettyConfig;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class PushServiceImpl implements PushService {
    @Override
    public void pushMsgToOne(String userId, String msg) {
        ConcurrentHashMap<String, Channel> userChannelMap = NettyConfig.getUserChannelMap();
        Channel channel = userChannelMap.get(userId);
        channel.writeAndFlush(new TextWebSocketFrame(msg));
    }

    @Override
    public void pushMsgToAll(String msg) {
        NettyConfig.getChannelGroup().writeAndFlush(new TextWebSocketFrame(msg));
    }

    public void psuhMsgToType(List<String> ids, String msg){
         ids.forEach(s->{
             pushMsgToOne(s,msg);
         });
    }
}
