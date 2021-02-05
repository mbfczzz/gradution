package jz.cdgy.msg.Service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import jz.cdgy.common.config.SpringContextUtil;
import jz.cdgy.mbg.mapper.MsgMapper;
import jz.cdgy.mbg.pojo.Msg;
import jz.cdgy.msg.Dto.MsgDto;
import jz.cdgy.msg.Email.ToEmail;
import jz.cdgy.msg.Service.NotifyService;
import jz.cdgy.mbg.mapper.MsgModelMapper;
import jz.cdgy.mbg.mapper.UserMapper;
import jz.cdgy.mbg.pojo.MsgModel;
import jz.cdgy.mbg.pojo.User;
import jz.cdgy.msg.mapper.NotifyMapper;
import jz.cdgy.msg.model.Email;
import jz.cdgy.msg.util.AssertsUtil;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import java.util.Date;
import java.util.List;

@Service
public class NotifyServiceImpl implements NotifyService {

    @Autowired
    private MsgModelMapper msgModelMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private MsgMapper msgMapper;

    @Autowired
    private NotifyMapper notifyMapper;

    @Override
    public <T> void SendEmail(List<Integer> id,Class<T> clazz) throws MessagingException {
        QueryWrapper<MsgModel> queryWrapper = new QueryWrapper();
        queryWrapper.eq("way_id",1);
        queryWrapper.eq("is_use",1);
        User user = userMapper.selectByPrimaryKey(id.get(0));
        MsgModel msgModel = msgModelMapper.selectOne(queryWrapper);
        Email email = new Email();
        email.setTitle(user.getUsername()+msgModel.getTitle());
        email.setSubject(user.getUsername()+msgModel.getMsgContent());
        email.setTargets(new String[]{"a317242393@163.com"});
        ToEmail send = (ToEmail) SpringContextUtil.getBean(clazz);
        send.sendEmail(email);
        Msg msg = new Msg();
        msg.setModelId(msgModel.getId());
        msg.setMsgSource(1);
        msg.setSendTime(new Date());
        msg.setSendPeople("系统自动发送");
        msg.setSendSubject(1);
        msg.setMsgTitle(email.getTitle());
        msg.setMsgContent(email.getSubject());
        msg.setSendWay(msgModel.getWayId());
        AssertsUtil.isTrue(msgMapper.insertSelective(msg)!=0,"消息发送失败!");
    }

    @Override
    public void activeSendEmail(List<Integer> ids, Integer mid) {

    }

    @Override
    public List<MsgDto> getAllNotify(Integer page,Integer limit,MsgDto msgDto) {
        PageHelper.startPage(page,limit);
        return notifyMapper.getAllNotify(msgDto);
    }
}
