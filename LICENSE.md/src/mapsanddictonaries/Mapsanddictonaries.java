
package mapsanddictonaries;

import java.util.HashMap;
import java.util.Map;

public class Mapsanddictonaries {

    public static void main(String[] args) {
        Map<String,String>practice = new HashMap<String,String>();
        
        practice.put("Monday", "mon");
         practice.put("Tuesday", "tue");
          practice.put("Wednesday", "wed");
           practice.put("Thursday", "thur");
        
           System.out.println(practice.toString());
           
           //removing a thing
          practice.remove("Wednesday");
          
           System.out.println(practice.toString());
    }
    
    
}
