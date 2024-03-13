public class pattern3 {
    public static void printnumberpattern(int n)
   {//outer loop 
    for(int i=1; i<=n; i++)
    {
        //inner loop
       for(int j=1; j<=i; j++)
       {
        System.out.print(j);
       }
       System.out.println();
    }
}
    public static void main(String args[])
    {
        printnumberpattern(5);
    }
}


