package com.countrymanagements.countryapp;

import com.countrymanagements.countryapp.country.Country;
import com.countrymanagements.countryapp.pharma.Pharmas;

public class CountryPharmaTester {

    public static void main(String[] args){

        Country country = new Country();
        Pharmas pharma = new Pharmas();

        country.pharmas =pharma;
    }
}
