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

    @WebLog(OperationModule = "消息通知", OperationTarget = "获取全部消息")
    @RequestMapping(value = "/getAllNotify",method = RequestMethod.POST)
    public CommonResult getAllNotify(@RequestParam(name = "page",defaultValue = "1")Integer page, @RequestParam(name = "limit",defaultValue = "10")Integer limit, MsgDto msgDto){
        return CommonResult.SUCCESS("获取全部用户成功!",notifyService.getAllNotify(page,limit,msgDto));
    }


    @WebLog(OperationModule = "消息通知", OperationTarget = "获取审核消息")
    @RequestMapping(value = "/getAllCheckNotify",method = RequestMethod.POST)
    public CommonResult getAllCheckNotify(@RequestParam(name = "page",defaultValue = "1")Integer page, @RequestParam(name = "limit",defaultValue = "10")Integer limit, MsgDto msgDto){
        return CommonResult.SUCCESS("获取全部用户成功!",notifyService.getAllCheckNotify(page,limit,msgDto));
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
        return CommonResult.SUCCESS("消息发送成功!待审核!");
    }

    @WebLog(OperationModule = "消息列表", OperationTarget = "获取事件来源")
    @RequestMapping(value = "/getMsgSource",method = RequestMethod.GET)
    public CommonResult  getMsgSource(){
        return CommonResult.SUCCESS(notifyService.getMsgSource());
    }

    @WebLog(OperationModule = "消息列表", OperationTarget = "获取事件主体")
    @RequestMapping(value = "/getSendSubject",method = RequestMethod.GET)
    public CommonResult  getSendSubject(){
        return CommonResult.SUCCESS(notifyService.getSendSubject());
    }

    @WebLog(OperationModule = "消息列表", OperationTarget = "更新消息")
    @RequestMapping(value = "/updateMessage",method = RequestMethod.POST)
    public CommonResult  updateMessage(@RequestBody MsgDto msgDto){
        return CommonResult.SUCCESS(notifyService.updateMessage(msgDto));
    }

    @WebLog(OperationModule ="消息列表",OperationTarget = "删除消息")
    @RequestMapping(value = "/deleteMsg/{msgs}",method = RequestMethod.DELETE)
    public CommonResult deleteUser(@PathVariable(name = "msgs") List<Integer> id){
    notifyService.deleteMsg(id);
    return CommonResult.SUCCESS("删除成功!");
    }

    @WebLog(OperationModule ="消息审核",OperationTarget = "审核通过")
    @RequestMapping(value = "/checkOk/{msgs}",method = RequestMethod.PUT)
    public CommonResult checkOk(@PathVariable(name = "msgs") List<Integer> id){
        notifyService.checkOk(id);
        return CommonResult.SUCCESS("审核通过!");
    }


    @WebLog(OperationModule ="消息审核",OperationTarget = "消息驳回")
    @RequestMapping(value = "/msgReject/{msgs}",method = RequestMethod.PUT)
    public CommonResult msgReject(@PathVariable(name = "msgs") List<Integer> id){
        notifyService.msgReject(id);
        return CommonResult.SUCCESS("消息已驳回!");
    }

    @WebLog(OperationModule ="消息发布",OperationTarget = "获取用户历史消息")
    @RequestMapping(value = "/getMessageByName",method = RequestMethod.POST)
    public CommonResult getMessageByName(@RequestParam(name = "page",defaultValue = "1")Integer page, @RequestParam(name = "limit",defaultValue = "10")Integer limit,
                                         @RequestParam(name = "id")String id){
        return CommonResult.SUCCESS(notifyService.getMessageByName(page,limit,id));
    }

    @WebLog(OperationModule ="消息发布",OperationTarget = "用户获取消息")
    @RequestMapping(value = "/getMessageByUser",method = RequestMethod.POST)
    public CommonResult getMessageByUser(@RequestParam(name = "page",defaultValue = "1")Integer page, @RequestParam(name = "limit",defaultValue = "10")Integer limit,
                                         @RequestParam(name = "id")String id){
        return CommonResult.SUCCESS(notifyService.getMessageByUser(page,limit,id));
    }

    @WebLog(OperationModule ="消息发布",OperationTarget = "用户获取websocket消息")
    @RequestMapping(value = "/getMessageByCurrent/{id}",method = RequestMethod.GET)
    public CommonResult getMessageByCurrent(@PathVariable(name = "id")String mid){
        return CommonResult.SUCCESS(notifyService.getMessageByCurrent(mid));
    }

    @WebLog(OperationModule ="消息发布",OperationTarget = "消息已读")
    @RequestMapping(value = "/updateUserMessage",method = RequestMethod.PUT)
    public CommonResult updateUserMessage(@RequestParam(name = "uid") String uid,@RequestParam(name = "mid") String mid){
        notifyService.updateUserMessage(uid,mid);
        return CommonResult.SUCCESS("消息已读");
    }
}
