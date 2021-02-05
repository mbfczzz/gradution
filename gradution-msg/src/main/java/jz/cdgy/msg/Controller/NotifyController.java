package jz.cdgy.msg.Controller;

import jz.cdgy.common.annotion.WebLog;
import jz.cdgy.common.api.CommonResult;
import jz.cdgy.msg.Dto.MsgDto;
import jz.cdgy.msg.Service.NotifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import java.util.List;

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

}
