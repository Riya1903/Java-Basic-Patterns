public class pattern4 {
    public static void printcharacter(int n)
    {//outer loop 
        char ch='A';
     for(int i=1; i<=n; i++)
     {
         //inner loop
        for(int j=1; j<=i; j++)
        {
         System.out.print(ch);
         ch++;
        }
        System.out.println();
     }
     }
     public static void main(String args[])
     {
         printcharacter(5);
     }
 }
 

