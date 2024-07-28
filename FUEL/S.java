class Main
{
	public static void main(String[] args) {
        int n=3;
        for(int i=0;i<2*n-1;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || i==(2*n)-2 || i==n-1 || (i-j==1 && i>j)  )  System.out.print("*  ");
                else System.out.print("   ");

            }
            System.out.println();
        }
	}
}