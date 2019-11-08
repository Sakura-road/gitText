package com.jk.model;

public class UserBean {
    private Integer userId;
    private String userName;
    private Long userBalance;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(Long userBalance) {
        this.userBalance = userBalance;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userBalance=" + userBalance +
                '}';
    }

    public UserBean() {
    }

    public UserBean(Integer userId, String userName, Long userBalance) {
        this.userId = userId;
        this.userName = userName;
        this.userBalance = userBalance;
    }
}
