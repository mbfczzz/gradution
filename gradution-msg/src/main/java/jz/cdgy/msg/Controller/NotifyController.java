package jz.cdgy.msg.Controller;

import jz.cdgy.common.annotion.WebLog;
import jz.cdgy.common.api.CommonResult;
import jz.cdgy.mbg.pojo.Msg;
import jz.cdgy.msg.Dto.MsgDto;
import jz.cdgy.msg.Service.NotifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import java.util.List;

/**
 * @author mbfczzz
 */
@RestController
@RequestMapping("/notify")
public class NotifyController {

    @Autowired
    private NotifyService notifyService;

    @WebLog(OperationModule = "消息通知", OperationTarget = "主动发送邮件")
    @RequestMapping("/activeSendEmail")
    public CommonResult sendEmail(List<Integer> id,Integer messageId) throws MessagingException {
            notifyService.activeSendEmail(id,messageId);
            return CommonResult.SUCCESS("发送消息成功!");
    }

    @WebLog(OperationModule = "消息通知", OperationTarget = "主动发送邮件")
    @RequestMapping(value = "/getAllNotify",method = RequestMethod.POST)
    public CommonResult getAllNotify(@RequestParam(name = "page",defaultValue = "1")Integer page, @RequestParam(name = "limit",defaultValue = "10")Integer limit, MsgDto msgDto){
        return CommonResult.SUCCESS("获取全部用户成功!",notifyService.getAllNotify(page,limit,msgDto));
    }

    @WebLog(OperationModule = "发送方式", OperationTarget = "获取全部发送方式")
    @RequestMapping(value = "/getSendWay",method = RequestMethod.GET)
    public CommonResult getSendWay(){
        return CommonResult.SUCCESS("获取发送方式成功!",notifyService.getSendWay());
    }

    @WebLog(OperationModule = "消息模板", OperationTarget = "获取消息模板")
    @RequestMapping(value = "/getNotifyTemplate",method = RequestMethod.GET)
    public CommonResult getNotifyTemplate(){
        return CommonResult.SUCCESS("获取消息模板成功!",notifyService.getNotifyTemplate());
    }

    @WebLog(OperationModule = "消息模板", OperationTarget = "获取指定消息模板")
    @RequestMapping(value = "/getCurrentTemplate/{id}",method = RequestMethod.GET)
    public CommonResult  getCurrentTemplate(@PathVariable(name = "id") String id){
        return CommonResult.SUCCESS("获取消息模板成功!",notifyService.getCurrentTemplate(id));
    }

    @WebLog(OperationModule = "消息发布", OperationTarget = "发布消息")
    @RequestMapping(value = "/sendMessage",method = RequestMethod.POST)
    public CommonResult  sendMessage(@RequestBody Msg msg){
        notifyService.sendMessage(msg);
        return CommonResult.SUCCESS("消息发送成功!");
    }

}
