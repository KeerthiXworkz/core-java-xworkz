package com.nationalhighway.tollapp;

import com.nationalhighway.tollapp.highways.Highways;
import com.nationalhighway.tollapp.tollgates.TollGates;

public class HighwaysTester {

    public static void main(String[] args){

        Highways highway = new Highways();
        TollGates tollgate = new TollGates();

        highway.tollGates = tollgate;
    }
}
