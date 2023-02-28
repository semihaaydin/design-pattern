package com.saydin.designpattern.builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Product {

    private Long id;
    private String name;
    private LocalDateTime date;

    private BigDecimal price;

    public Long getId() {
        return id;
    }

    public Product(ProductBuilder builder){
        this.id= builder.id;
        this.name= builder.name;
        this.date= builder.date;
        this.price= builder.price;

    }

    public static class ProductBuilder{ //inner class
        private Long id;
        private String name;
        private LocalDateTime date;
        private BigDecimal price;

        public ProductBuilder id(Long id) {
            this.id = id;
            return this;
        }
        public ProductBuilder name(String name) {
            this.name = name;
            return this;
        }
        public ProductBuilder date(LocalDateTime date) {
            this.date = date;
            return this;
        }
        public ProductBuilder price(BigDecimal price) {
            this.price = price;
            return this;
        }

        public Product build(){
            Product product=new Product(this);
            return product;
        }
    }



    public Product(){

    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
