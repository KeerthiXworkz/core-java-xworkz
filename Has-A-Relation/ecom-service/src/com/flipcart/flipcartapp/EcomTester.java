package com.flipcart.flipcartapp;

import com.flipcart.flipcartapp.customers.Custmers;
import com.flipcart.flipcartapp.ecommerce.Ecom;

public class EcomTester {

    public static void main(String[] args){

        Ecom ecom = new Ecom();
        Custmers customer = new Custmers();

        ecom.customers = customer;
    }
}
