package com.shop.miniso.entity;

import java.sql.Date;

public class User {

    private int uId;
    private String uLoginName;
    private String uphone;
    private String uAccount;
    private String uLoginPwd;
    private int uSex;
    private String uAddress;
    private String uEmail;
    private int uStateId;
    private Date uCreateDate;

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuLoginName() {
        return uLoginName;
    }

    public void setuLoginName(String uLoginName) {
        this.uLoginName = uLoginName;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    public String getuAccount() {
        return uAccount;
    }

    public void setuAccount(String uAccount) {
        this.uAccount = uAccount;
    }

    public String getuLoginPwd() {
        return uLoginPwd;
    }

    public void setuLoginPwd(String uLoginPwd) {
        this.uLoginPwd = uLoginPwd;
    }

    public int getuSex() {
        return uSex;
    }

    public void setuSex(int uSex) {
        this.uSex = uSex;
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public int getuStateId() {
        return uStateId;
    }

    public void setuStateId(int uStateId) {
        this.uStateId = uStateId;
    }

    public Date getuCreateDate() {
        return uCreateDate;
    }

    public void setuCreateDate(Date uCreateDate) {
        this.uCreateDate = uCreateDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", uLoginName='" + uLoginName + '\'' +
                ", uphone='" + uphone + '\'' +
                ", uAccount='" + uAccount + '\'' +
                ", uLoginPwd='" + uLoginPwd + '\'' +
                ", uSex=" + uSex +
                ", uAddress='" + uAddress + '\'' +
                ", uEmail='" + uEmail + '\'' +
                ", uStateId=" + uStateId +
                ", uCreateDate=" + uCreateDate +
                '}';
    }
}
