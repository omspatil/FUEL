package String;

public class demo1 {

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "java";
        String s3 = "Software Developer";

        System.out.println("---------------");
        System.out.println(s1.equals(s2));
        System.out.println("---------------");
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println("---------------");
        System.out.println(s2.length());
        System.out.println("---------------");
        System.out.println(s3.charAt(9));
        System.out.println("---------------");
        System.out.println(s3.indexOf('o'));
        System.out.println("---------------");
        System.out.println(s3.lastIndexOf('o'));
        System.out.println("---------------");
        System.out.println(s3.startsWith("Soft"));
        System.out.println("---------------");
        System.out.println(s3.endsWith("per"));
        System.out.println("---------------");
        System.out.println(s3.replace("e", "h"));
        System.out.println("---------------");
        System.out.println(s3.substring(4, 8));
        System.out.println("---------------");
        System.out.println(s3.substring(9));
        System.out.println("---------------");
        System.out.println(s3.toLowerCase());
        System.out.println("---------------");
        System.out.println(s3.toUpperCase());
        System.out.println("---------------");
        String s4 = "Om ";
        String s5 = "Suhas ";
        String s6 = "Patil ";
        String s7 = "Chh. Sambhaji Nagar ";
        System.out.println(s4.concat(s5).concat(s6).concat(s7));
        System.out.println("---------------");
        System.out.println(s3.contains("Dev"));
        System.out.println("---------------");
        String S = "";
        for(int i = s3.length()-1;i>=0;i--) {
        	S+=s3.charAt(i); 
         }
         System.out.println("reversed string"+  S);
    }

}
