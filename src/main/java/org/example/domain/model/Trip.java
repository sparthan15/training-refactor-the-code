package org.example.domain.model;


import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class Trip {

    private String id;
    private String origin;
    private String destination;
    private Driver driver;
    private Customer customer;

    public boolean customerHasMoney(){
        return this.customer.getMoney().equals(BigDecimal.ZERO);
    }


    private Trip(){}
    public static TripBuilder builder(){
        return new TripBuilder();
    }

    public static class TripBuilder{
         private Trip trip;

         private TripBuilder(){
             this.trip = new Trip();
         }

         public TripBuilder id(String id){
             this.trip.id = id;
             return this;
         }

         public TripBuilder origin(String origin){
             this.trip.origin = origin;
             return this;
         }

         public TripBuilder destination(String destination){
             this.trip.destination = destination;
             return this;
         }

         public TripBuilder driver(Driver driver){
             this.trip.driver = driver;
             return this;
         }

         public TripBuilder customer(Customer customer){
            this.trip.customer = customer;
            return this;
         }

         public Trip build(){
             return this.trip;
         }
    }
}
