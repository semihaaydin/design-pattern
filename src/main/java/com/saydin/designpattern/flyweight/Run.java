package com.saydin.designpattern.flyweight;

public class Run {

    public static void main(String[] args) {
        BillingUser billingUser=new BillingUser();
        billingUser.getAddress("1");
        User user=new User();
        user.getAdres("1");
    }


}
