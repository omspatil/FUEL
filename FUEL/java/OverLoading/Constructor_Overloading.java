package OverLoading;
public class Constructor_Overloading {
    Constructor_Overloading(int a){
        System.out.println(10);
    }
    Constructor_Overloading(){
        System.out.println("NO paramter");
    }
        public static void main(String[] args) {
        Constructor_Overloading ob=new Constructor_Overloading(45);
    }
}
