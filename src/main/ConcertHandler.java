package main;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import concerts.*;
import concerts.location.*;

public class ConcertHandler {
    
    Map<String, Band>  bands  = new HashMap<>();
    Map<String, Venue> venues = new HashMap<>();
    Map<String, City>  cities = new HashMap<>();

    Map<String, Concert>  concerts  = new HashMap<>();
    Map<String, Festival> festivals = new HashMap<>();


    public ConcertHandler() {

    }



    public Concert createConcertFromInput() {
        Scanner input = new Scanner(System.in);

        System.out.println("Tour name:");
        String tour = input.nextLine();                 //input
        System.out.println("Number of bands:");
        int nbrOfBands = input.nextInt();               //input
        
        Show[] shows = new Show[nbrOfBands];
        for (int i = 0; i < shows.length; i++) {
            System.out.println("Band name: ");
            String bandName = "Orbit Culture";          //input
            
            Band band = bands.get(bandName);
            if (band == null) {
                String genre   = "Modern Metal";        //input
                String country = "Sweden";              //input
                band = new Band(bandName, genre, country);
            }

            String role = "Headliner";                  //input
            shows[i] = new Show(band, tour, role);
        }

        String dateTemp = "2025-11-21";                 //input
        Date date = new Date(dateTemp);
        
        String venueName = "Slagthuset";                //input
        Venue venue = venues.get(venueName);
        if (venue == null) {
            String cityName = "Malmö";                  //input
            
            City city = cities.get(cityName);
            if (city == null) {
                String countryName = "Sweden";          //input
                Country country = new Country(countryName);
                city = new City(cityName, country);
            }

            venue = new Venue(venueName, city);
        }

        input.close();

        
        Concert result = new Concert(date, shows, venue);

        concerts.put(tour, result);

        return result;
    }





    public Concert createConcertHardCoded() {
        String tour = "Death Above Life European Tour"; //input
        int nbrOfBands = 2;                             //input
        
        Show[] shows = new Show[nbrOfBands];
        for (int i = 0; i < shows.length; i++) {
            String bandName = "Orbit Culture";          //input
            
            Band band = bands.get(bandName);
            if (band == null) {
                String genre   = "Modern Metal";        //input
                String country = "Sweden";              //input
                band = new Band(bandName, genre, country);
            }

            String role = "Headliner";                  //input
            shows[i] = new Show(band, tour, role);
        }

        String dateTemp = "2025-11-21";                 //input
        Date date = new Date(dateTemp);
        
        String venueName = "Slagthuset";                //input
        Venue venue = venues.get(venueName);
        if (venue == null) {
            String cityName = "Malmö";                  //input
            
            City city = cities.get(cityName);
            if (city == null) {
                String countryName = "Sweden";          //input
                Country country = new Country(countryName);
                city = new City(cityName, country);
            }

            venue = new Venue(venueName, city);
        }

        
        Concert result = new Concert(date, shows, venue);

        concerts.put(tour, result);

        return result;
    }


    
}
