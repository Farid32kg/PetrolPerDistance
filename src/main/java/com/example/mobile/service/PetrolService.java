package com.example.mobile.service;

import org.springframework.stereotype.Service;

@Service
public class PetrolService {

    public double getPrice (double distance, double petrolLitrePEr100km, double petrolPrice){
        double result = 0.0;

        result+=distance/100*petrolLitrePEr100km;

        return  Math.round(result);
    }
}
