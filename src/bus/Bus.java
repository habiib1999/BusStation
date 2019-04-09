/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author Shehab eldeen
 */
public class Bus {
   static public ArrayList<Trip> trip = new ArrayList<Trip>();

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        TripList thelist = new TripList();
        trip = thelist.read("E:\\shehab\\programming\\Bus Station\\Bus\\trips.txt");
        
       /* System.out.println(trip.get(0).getDestination());
        System.out.println(trip.get(0).getDays());
        System.out.println(trip.get(0).getWay());
        System.out.println(trip.get(0).getStops());
   
        System.out.println(trip.get(0).geteKind());
        System.out.println(trip.get(0).getVeh());
        
         System.out.println(trip.get(1).getDestination());
        System.out.println(trip.get(1).getDays());
        System.out.println(trip.get(1).getWay());
        System.out.println(trip.get(1).getStops());
   
        System.out.println(trip.get(1).geteKind());
        System.out.println(trip.get(1).getVeh());
        
        
         System.out.println(trip.get(2).getDestination());
        System.out.println(trip.get(2).getDays());
        System.out.println(trip.get(2).getWay());
        System.out.println(trip.get(2).getStops());
   
        System.out.println(trip.get(2).geteKind());
        System.out.println(trip.get(2).getVeh());
        
        
         System.out.println(trip.get(3).getDestination());
        System.out.println(trip.get(3).getDays());
        System.out.println(trip.get(3).getWay());
        System.out.println(trip.get(3).getStops());
   
        System.out.println(trip.get(3).geteKind());
        System.out.println(trip.get(3).getVeh());
      
        
         System.out.println(trip.get(4).getDestination());
        System.out.println(trip.get(4).getDays());
        System.out.println(trip.get(4).getWay());
        System.out.println(trip.get(4).getStops());
   
        System.out.println(trip.get(4).geteKind());
        System.out.println(trip.get(4).getVeh());*/
         
        // TODO code application logic here
    }
    
}
