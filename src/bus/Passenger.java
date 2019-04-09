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
   
    
    
}
