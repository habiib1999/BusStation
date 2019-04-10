/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import java.util.HashMap;

/**
 *
 * @author Shehab eldeen
 */
public class Driver extends Person{
  HashMap Pass = new HashMap();
    
    /**
     *
     * @param name
     * @param age
     */
    public  Driver(String name, int age){
        super(name,age);
       
        Pass.put("ali", "000");
        
    }
    public boolean Availability(String nm){
        boolean checker;
        String available = (String) Pass.get(nm);
        if(available!=null)
        {
            return true;
        }
        else
            return false;
    }
    public boolean DriverValidation(String str , String s){
        boolean checker;
        String available = (String) Pass.get(str);
        if(available!=null)
        {
            return available.equals(s);
        }
        else
            return false;
            
}
}
