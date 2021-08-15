package com.company.ecommerceapp;

public class Products {
    Integer productId;
    String productName;
    Double productPrice;
    Integer categoryId;


    public Products(Integer productId,String productName,Double productPrice,Integer categoryId){
        this.productId=productId;
        this.productName=productName;
        this.productPrice=productPrice;
        this.categoryId=categoryId;
    }
}
