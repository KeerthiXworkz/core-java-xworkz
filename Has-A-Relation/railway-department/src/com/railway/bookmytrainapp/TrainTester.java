package com.railway.bookmytrainapp;

import com.railway.bookmytrainapp.passengers.Passengers;
import com.railway.bookmytrainapp.trains.Trains;

public class TrainTester {

    public static void main(String[] args){

        Trains train = new Trains();
        Passengers passenger = new Passengers();

        train.passengers = passenger;
    }
}
