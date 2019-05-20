package Statement_Control.Exceptions;

import java.util.InvalidPropertiesFormatException;

public class NullPointer_Demo {

    public static void main(String[] args) {

        try{
            String str = null;
            System.out.println(str.charAt(2));
        }catch (NullPointerException e){
            System.out.println("Null Pointer");
        }
    
    }
}
