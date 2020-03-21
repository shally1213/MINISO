package com.shop.miniso.entity;

public class UserAddress {

    private int uaId;
    private String uAccount;
    private String uaphone;
    private String uAddress;
    private int uaStateId;

    public int getUaId() {
        return uaId;
    }

    public void setUaId(int uaId) {
        this.uaId = uaId;
    }

    public String getuAccount() {
        return uAccount;
    }

    public void setuAccount(String uAccount) {
        this.uAccount = uAccount;
    }

    public String getUaphone() {
        return uaphone;
    }

    public void setUaphone(String uaphone) {
        this.uaphone = uaphone;
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress;
    }

    public int getUaStateId() {
        return uaStateId;
    }

    public void setUaStateId(int uaStateId) {
        this.uaStateId = uaStateId;
    }

    @Override
    public String toString() {
        return "UserAddress{" +
                "uaId=" + uaId +
                ", uAccount='" + uAccount + '\'' +
                ", uaphone='" + uaphone + '\'' +
                ", uAddress='" + uAddress + '\'' +
                ", uaStateId=" + uaStateId +
                '}';
    }
}
