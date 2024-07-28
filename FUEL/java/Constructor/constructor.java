package Constructor;
/*import java.io.*;
public class constructor 
{

	constructor() 
    
    { System.out.println("Default constructor");
 }
	public static void main(String[] args)
	{
		constructor hello = new constructor();
	}
}
*/

import java.io.*;
class Mul {
    int a;
    int b;
    int c;
    Mul(int a, int b) {
        this.a = a;
        this.b = b;
        c = a * b;
        System.out.println(c);

    } 
}
class GFG {
    public static void main(String[] args) {
        Mul multiply = new Mul(10, 20); 
    }
}
