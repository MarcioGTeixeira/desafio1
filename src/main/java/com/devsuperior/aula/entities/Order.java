package com.devsuperior.aula.entities;

public class Order {
    private  Integer code;
    private  Double basic;
    private double discount;

    public Order(Integer code, Double basic, double discount) {
        this.code = code;
        this.basic = basic;
        this.discount = discount;
    }

    public Integer getCode() {
        return code;
    }

    public Double getBasic() {
        return basic;
    }

    public double getDiscount() {
        return discount;
    }
}
