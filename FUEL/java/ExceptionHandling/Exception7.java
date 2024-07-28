package ExceptionHandling;
import java.io.*;
public class Exception7 {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("demo.text");    
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    
}
 