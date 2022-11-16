package org.example.model;

import org.example.WhateverException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TripTest {

    @Test
    void givenTheTripWhenOriginAndDestinationAreTheSameThenThrowAnException(){
        Assertions.assertThrows(WhateverException.class, ()->{
           Trip.builder()
                    .origin(CityUtils.CHICAGO)
                    .destination(CityUtils.CHICAGO)
                    .build();
        });
    }
}
