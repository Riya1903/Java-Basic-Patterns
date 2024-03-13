public class pattern15 {
    public static void palindromicpatternwithnumber(int n)
    {
    for(int i=1; i<=n; i++)
    {
        //spaces
       for(int j=1; j<=n-i; j++)
       {
        System.out.print(" ");
       }
       //number in dsc
       for(int j=i; j>=1; j--)
       {
           System.out.print(j);
       }
       for(int j=2;j<=i; j++)
       {
        System.out.print(j);
       }
       System.out.println();
    }
    
    }
    public static void main(String args[])
    {
        palindromicpatternwithnumber(5);
    }
}
