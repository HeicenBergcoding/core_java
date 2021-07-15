package com.company.serilizationdemo;

import java.io.Serializable;

public class Product implements Serializable {
    private Integer productId;
    private String productName;
    private Double productPrice;

    public Product(){

    }
    public Product(Integer productId,String productName,Double productPrice){
        this.productId=productId;
        this.productName=productName;
        this.productPrice=productPrice;
    }

    public Integer getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }
}
