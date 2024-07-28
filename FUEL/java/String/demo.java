package String;

public class demo {
    public static void main(String[] args) {

        String s1 = new String("Om");
        System.out.println(s1);
        System.out.println(s1.toString());
        System.out.println(s1.hashCode());
        String s2 = new String("Om");
        String s3 = new String("Om");
        System.out.println(s2.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s3));

    }

}