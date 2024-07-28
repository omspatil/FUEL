package Array;

public class array1 {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int sum=0,avg=0;
        for(int i=0;i<5;i++){
            sum=sum+a[i];
        }
        avg=(sum/(a.length));
        System.out.println(sum+"\n"+avg);    
    }
    
}
