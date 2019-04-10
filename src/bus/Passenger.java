/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package bus;
import static bus.Bus.trip;
import java.util.HashMap;

/**
 *
 * @author Shehab eldeen
 */
public class Passenger extends Person {
    
    private int id ;
     HashMap Pass = new HashMap();
    
    /**
     *
     * @param name
     * @param age
     */
    public  Passenger(String name, int age){
        super(name,age);
       
        Pass.put("abdelrahman", "1111");
        Pass.put("shehab", "2222");
        Pass.put("ashraf", "3333");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public boolean passengerValidation(String str , String s){
        boolean checker;
        String available = (String) Pass.get(str);
        if(available!=null)
        {
            return available.equals(s);
        }
        else
            return false;
        
        
    }
    public boolean Book(Trip trp){
       if (trp.availableSeats!=0)
       {
        trp.availableSeats--; 
        return true;
       }
       return false;
      
    }
    public Trip Search(String dest,int ds , String sway , String eway ,String way , String vehi)
    {
        for (int i=0;i< trip.size();i++)
        {
            if (dest.compareToIgnoreCase(trip.get(i).getDestination())==0)
            {
                if(ds==trip.get(i).getDays() && dest.compareToIgnoreCase(trip.get(i).getDestination())==0&& eway.compareToIgnoreCase(trip.get(i).geteKind())==0 && sway.compareToIgnoreCase(trip.get(i).getStops())==0 && way.compareToIgnoreCase(trip.get(i).getWay())==0 && vehi.compareToIgnoreCase(trip.get(i).getVeh())==0)
                {
                    return trip.get(i);
                    
                } 
                    
                
            }
            
        }
        for (int x=0;x< trip.size();x++)
        {
            if (dest.compareToIgnoreCase(trip.get(x).getDestination())==0)
            {
                if(ds==trip.get(x).getDays() || dest.compareToIgnoreCase(trip.get(x).getDestination())==0 || eway.compareToIgnoreCase(trip.get(x).geteKind())==0 || sway.compareToIgnoreCase(trip.get(x).getStops())==0 || way.compareToIgnoreCase(trip.get(x).getWay())==0 || vehi.compareToIgnoreCase(trip.get(x).getVeh())==0)
                {
                    return trip.get(x);
                    
                } 
                    
                
            }
            
        }
        return null;
        
        
    }
   
    
    
}
