package com.saydin.designpattern.builder;

public class Run {

    public static void main(String[] args) {
        Product product=new Product();
        Product product1=new Product.ProductBuilder().id(333L).build();
    }
}
