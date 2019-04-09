/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Shehab eldeen
 */
public class TripList {
    
    
    
    
    public ArrayList<Trip> read(String FilePath) throws FileNotFoundException
    {
    ArrayList<Trip> triplist = new ArrayList(); 
        
        Scanner info = null;
        try{
            info = new Scanner(new File(FilePath));
        }
        catch(FileNotFoundException e){
            System.err.println(e);
                     
    }
        while (info.hasNext())
        {
            Trip x = new Trip();
            String tr = info.nextLine();
            String[] arr = tr.split("@");
            x.setDestination(arr[0]);
            x.setDays(Integer.parseInt(arr[1]));
            x.setWay(arr[2]);
            x.seteKind(arr[3]);
            x.setStops(arr[4]);
            x.setVeh(arr[5]);
            triplist.add(x);
            
            
        }
        return triplist;
    }
    
    
    
    
    
}
