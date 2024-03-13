public class pattern10 {
    public static void butterfly(int n)
    {//outer loop 
        //1st half
     for(int i=1; i<=n; i++)
     {
         //inner loop
         //star
        for(int j=1; j<=i; j++)
        {
         System.out.print("*");
        }
        //spaces
        for(int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++)
        {
            System.out.print("*");
        }
        System.out.println();
     }
     //2nd half
    for(int i=n; i>=1; i--)
     {
         //inner loop
         //star
        for(int j=1; j<=i; j++)
        {
         System.out.print("*");
        }
        //spaces
        for(int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }
        //star
        for(int j=1; j<=i; j++)
        {
            System.out.print("*");
        }
        System.out.println();
     }
    }
     public static void main(String args[])
     {
        //butterfly pattern 
        butterfly(5);
     }
 }
 

