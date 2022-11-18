package org.example.model;

import org.example.WhateverException;
import org.example.domain.model.CityUtils;
import org.example.domain.model.Trip;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TripTest {

    @Test
    void givenTheTripWhenOriginAndDestinationAreTheSameThenThrowAnException(){
        Assertions.assertThrows(WhateverException.class, ()->{
           Trip.builder()
                    .origin(CityUtils.CHICAGO)
                    .destination(CityUtils.CHICAGO)
                    .build();
        });
    }

    @Test
    void givenTheDriverIsTheCustomerThenThrowAnException(){

    }
}
