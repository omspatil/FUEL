package Encapsulation;

public class test3 {
    public static void main(String[] args) {
        test2 o = new test2();
        o.setId(25);
        o.setName("samarth");
        o.setSalary(25000);
        System.out.println(o.getId()+"\n" +o.getName()+"\n"+o.getSalary());
    }
}
