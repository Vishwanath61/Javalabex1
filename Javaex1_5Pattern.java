
package pkg22cseb61javaex1.Newmain3;

import java.util.*;

public class NewMain3 
{

    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n=obj.nextInt();
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
                
        }
    }
    
}
