package com.tcs.tcsapp;

import com.tcs.tcsapp.clients.Clients;
import com.tcs.tcsapp.company.Company;

public class CompanyTester {

    public static void main(String[] args){

        Company company = new Company();
        Clients client =new Clients();

        company.clients  = client;
    }
}
