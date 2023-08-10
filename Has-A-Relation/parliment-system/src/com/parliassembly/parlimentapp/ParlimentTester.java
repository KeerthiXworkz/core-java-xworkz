package com.parliassembly.parlimentapp;

import com.parliassembly.parlimentapp.ministers.Ministers;
import com.parliassembly.parlimentapp.parliments.Parliments;

public class ParlimentTester {

    public static void main(String[] args){

        Ministers minister = new Ministers();
        Parliments parliment = new Parliments();

        parliment.ministers = minister;
    }
}
