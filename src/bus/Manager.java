/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import static bus.Bus.trip;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

/**
 *
 * @author Shehab eldeen
 */
public class Manager extends Person {
      HashMap Pass = new HashMap();
      TripList object = new TripList();
    //  Trip tr = new Trip();
     // Trip x = new Trip();
      
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
    public static boolean Write(Trip tri,String FilePath,boolean appendType) throws IOException
    {
        PrintWriter Writter = null;
        try {
            Writter = new PrintWriter(new FileWriter(new File(FilePath),appendType));
                    
                    Writter.printf(tri.getDestination());
                    Writter.printf(" ");
                    Writter.print(tri.getDays());
                    Writter.printf(" ");
                    Writter.printf(tri.getWay());
                    Writter.printf(" ");
                    Writter.printf(tri.geteKind());
                    Writter.printf(" ");
                    Writter.printf(tri.getStops());
                    Writter.printf(" ");
                    Writter.println(tri.getVeh());
                    
                    
                    return true;
        }
        catch(IOException e){
            System.err.println(e);
        }
        finally{
            Writter.close();
        }
          return false;
        
        
        
    }
    public void cancel(Trip token) throws FileNotFoundException, IOException{
       
        for (int x=0;x<trip.size();x++)
        {
            if(trip.get(x)==token)
            {
                trip.remove(x);  
                
            }
          
        
    }
       
                Write(trip.get(0),"E:\\shehab\\programming\\Bus Station\\Bus\\trips.txt" , false);
                for (int i =1;i<trip.size();i++)
                {
                     Write(trip.get(0),"E:\\shehab\\programming\\Bus Station\\Bus\\trips.txt" , true);
                }
    
    
    
}
    
    public boolean add(Trip x) throws IOException{
        trip.add(x);
        return Write(x,"E:\\shehab\\programming\\Bus Station\\Bus\\trips.txt",true);
        
    }
    
    
    public boolean assign(Driver dr,Trip tripp)
    {
        if( dr.Availability(dr.Name)==true)
        {
            tripp.setDriver(dr.Name);
            return true;
            
        }
        else 
            return false;
       
    }
}
