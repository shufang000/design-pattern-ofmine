package com.shufang.create_type.prototype;

public class Mail implements Cloneable {

    /**
     * Mail是一个具体的原型类，实现Cloneable，当然也可以抽象出
     */
    private String  name;
    private String mailAddress;
    private String  content;

    public Mail(){
        System.out.println("Mail class Constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone mail object");
        return super.clone();
    }
}
