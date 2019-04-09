/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import static bus.Bus.trip;
import java.io.FileNotFoundException;
import java.util.HashMap;

/**
 *
 * @author Shehab eldeen
 */
public class Manager extends Person {
      HashMap Pass = new HashMap();
      TripList object = new TripList();
      Trip tr = new Trip();
      
    /**
     *
     * @param name
     * @param age
     */
    public  Manager(String name, int age){
        super(name,age);
       
        Pass.put("Mr.ahmed", "1234");
       
    }
    public boolean ManagerValidation(String str , String s){
        boolean checker;
        String available = (String) Pass.get(str);
        if(available!=null)
        {
            return available.equals(s);
        }
        else
            return false;
        
    
}
    public void cancel(Trip token) throws FileNotFoundException{
       
        for (int x=0;x<trip.size();x++)
        {
            if(trip.get(x)==token)
            {
                trip.remove(x);
                
            } 
            
        }
        
        
    }
    
    
    
}
