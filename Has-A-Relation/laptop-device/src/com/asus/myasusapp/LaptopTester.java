package com.asus.myasusapp;

import com.asus.myasusapp.harddisk.HardDisk;
import com.asus.myasusapp.laptop.Laptops;

public class LaptopTester {

    public static void main(String[] args){

        Laptops laptop = new Laptops();
        HardDisk hardDisk = new HardDisk();

        laptop.hardDisks = hardDisk;
    }
}
