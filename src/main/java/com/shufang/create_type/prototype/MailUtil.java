package com.shufang.create_type.prototype;

import java.text.MessageFormat;

/**
 * 这是一个工具类，在原型模式中可有可无
 */
public class MailUtil {

    public static void sendMail(Mail mail) {
        String content = "邮件发往{0}，邮件地址:{1},邮件内容:{2}发送邮件成功";
        System.out.println(MessageFormat.format(content,mail.getName() ,mail.getMailAddress(),mail.getContent()));
    }

    public static void saveOriginMailRecord(Mail mail){
        System.out.println("存储originMail记录，originMail：" + mail.getContent());
    }

}
