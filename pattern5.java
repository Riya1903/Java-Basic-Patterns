public class pattern5 {
    public static void Hollowrectangle(int totalrow,int totalcol)
    {//outer loop 
     for(int i=1; i<=totalrow; i++)
     {
         //inner loop
        for(int j=1; j<=totalcol; j++)
        {
         if(i==1||i==totalrow||j==1||j==totalcol)
         {
            System.out.print("*");
         }
         else{
            System.out.print(" ");
         }
        }
        System.out.println();
     }
     }
     public static void main(String args[])
     {
         Hollowrectangle(5,4);
     }
 }
 

