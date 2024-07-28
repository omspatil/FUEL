package Constructor;
public class constructor2 {
constructor2(int age ){
           this("OM");
	System.out.println("Age: "+age);
}
constructor2(double salary){
	   this(21);
	System.out.println("Salary : "+salary);
}
constructor2(String name){
   
	System.out.println("Name : "+name);
}
public static void main(String[] args) {
	constructor2 obh = new constructor2(50000.20);
	
}
}