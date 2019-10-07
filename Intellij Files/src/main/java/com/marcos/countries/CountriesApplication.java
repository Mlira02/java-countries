package com.marcos.countries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CountriesApplication
{
    static CountryList mainCountryList;
    public static void main(String[] args)
    {
        mainCountryList = new CountryList();
        SpringApplication.run(CountriesApplication.class, args);
    }

}