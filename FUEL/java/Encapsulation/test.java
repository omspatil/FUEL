package Encapsulation;
// One way 
/*public class test {
    private int age = 20;

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        test age = new test();
        System.out.println(age.getAge());
    }
}
*/

// Second way
public class test {
    private int age = 20;
    public static void main(String[] args) {
        test test1=new test();
        System.out.println(test1.age);
    }
}

