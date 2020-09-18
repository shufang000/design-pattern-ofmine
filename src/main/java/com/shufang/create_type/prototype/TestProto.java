package com.shufang.create_type.prototype;


/**
 * 输出结构如下：TODO 每次clone生成的对象的内存地址都是不一样的
 * Mail class Constructor
 * 原型是:com.shufang.create_type.prototype.Mail@610455d6
 * clone mail object
 * 邮件发往user1，邮件地址:user1@test.com.cn,邮件内容:恭喜用户user1 喜提豪车ROS一台！～发送邮件成功
 * 克隆的mail：com.shufang.create_type.prototype.Mail@511d50c0
 * clone mail object
 * 邮件发往user2，邮件地址:user2@test.com.cn,邮件内容:恭喜用户user2 喜提豪车ROS一台！～发送邮件成功
 * 克隆的mail：com.shufang.create_type.prototype.Mail@60e53b93
 * clone mail object
 * 邮件发往user3，邮件地址:user3@test.com.cn,邮件内容:恭喜用户user3 喜提豪车ROS一台！～发送邮件成功
 * 克隆的mail：com.shufang.create_type.prototype.Mail@5e2de80c
 * 存储originMail记录，originMail：初始化样本
 */
public class TestProto {
    public static void main(String[] args) throws CloneNotSupportedException {

        //声明原型类
        Mail mail = new Mail();
        mail.setContent("初始化样本");
        System.out.println("原型是:" + mail);

        for (int i = 1; i <= 3; i++) {
            Mail mailTemp = (Mail) mail.clone();

            mailTemp.setName("user" + i);
            mailTemp.setMailAddress(mailTemp.getName() + "@test.com.cn");
            mailTemp.setContent("恭喜用户" + mailTemp.getName() + " 喜提豪车ROS一台！～");

            MailUtil.sendMail(mailTemp);

            System.out.println("克隆的mail：" + mailTemp);
        }

        //保存原型
        MailUtil.saveOriginMailRecord(mail);

    }
}
