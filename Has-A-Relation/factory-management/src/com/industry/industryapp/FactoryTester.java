package com.industry.industryapp;

import com.industry.industryapp.factory.Factory;
import com.industry.industryapp.machines.Machines;

public class FactoryTester {

    public static void main(String []args){

        Factory factory = new Factory();
        Machines machine = new Machines();

         factory.machines = machine;
    }
}
