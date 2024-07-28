package Nested_if;
public class Login {
    public static void main(String[] args) {
        String Uname="Aditya";
        String Pass="Adi@123";
        if(Uname=="Aditya"){
            System.out.println("Uname is correct");
            if(Pass=="Adi@123"){
                System.out.println("Password is correct");
                System.out.println("Login successful");
            }
            
            else{
                System.out.println("Password is incorrect");
            }
        }
        else{
            System.out.println("Uname is incorrect");
            System.out.println("Login unsuccessful");
        }
    }
}
