package com.cn.vo;

/**
 * Created by A on 2017/8/3.
 */
public class AuthVo {

    private String username;
    /**
     * 认证状态
     */
    private String status;
    /**
     * 认证次数
     */
    private Integer authCount;
    /**
     * 认证时间
     */
    private String authDate;

    private String telephone;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getAuthCount() {
        return authCount;
    }

    public void setAuthCount(Integer authCount) {
        this.authCount = authCount;
    }

    public String getAuthDate() {
        return authDate;
    }

    public void setAuthDate(String authDate) {
        this.authDate = authDate;
    }
}
