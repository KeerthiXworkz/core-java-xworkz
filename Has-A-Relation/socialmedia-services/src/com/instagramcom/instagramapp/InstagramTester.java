package com.instagramcom.instagramapp;

import com.instagramcom.instagramapp.influencers.Influencers;
import com.instagramcom.instagramapp.instagram.Instagram;

public class InstagramTester {

    public static void main(String[] args){

        Instagram instagram = new Instagram();
        Influencers influencer = new Influencers();

        instagram.influencers = influencer;
    }
}
