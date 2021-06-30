package com.company.miniprojrectproducts;

public class Product {
    String productName;
    long productId;
    double price;
    String description;
    Category category;

    public Product(String productName,long productId,double price,String description,Category category){
        this.productName=productName;
        this.productId=productId;
        this.price=price;
        this.description=description;
        this.category=category;
    }
}
