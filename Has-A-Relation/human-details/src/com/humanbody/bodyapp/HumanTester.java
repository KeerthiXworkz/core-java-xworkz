package com.humanbody.bodyapp;

import com.humanbody.bodyapp.heart.Heart;
import com.humanbody.bodyapp.human.Human;

public class HumanTester {

    public static void main(String[] args){

        Human human = new Human();
        Heart heart = new Heart();

        human.hearts = heart;
    }
}
