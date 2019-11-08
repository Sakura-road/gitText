package com.jk.model;

public class OrderBean {
    private Integer orderId;
    private String orderNum;
    private String orderName;
    private Long orderPrice;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Long getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Long orderPrice) {
        this.orderPrice = orderPrice;
    }

    @Override
    public String toString() {
        return "OrderBean{" +
                "orderId=" + orderId +
                ", orderNum='" + orderNum + '\'' +
                ", orderName='" + orderName + '\'' +
                ", orderPrice=" + orderPrice +
                '}';
    }

    public OrderBean() {
    }

    public OrderBean(Integer orderId, String orderNum, String orderName, Long orderPrice) {
        this.orderId = orderId;
        this.orderNum = orderNum;
        this.orderName = orderName;
        this.orderPrice = orderPrice;
    }
}
