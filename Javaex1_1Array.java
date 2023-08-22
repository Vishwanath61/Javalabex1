package pkg22cseb61javaex1.Newmain5;

import java.util.*;

public class NewMain5
{
    public static void main(String[] args) 
    {
    Scanner obj = new Scanner (System.in);
    System.out.print("Enter the no. of elements of array :");
    int n = obj.nextInt();
    int element[] = new int[n];
    for(int i=0;i<n;i++)
    {
        System.out.print("a["+i+"]="); 
        element[i] = obj.nextInt();
    }
    System.out.println("Entered Array");
    for(int i=0;i<n;i++)
    {
        System.out.println("a["+i+"]="+element[i]); 
    }
        oddeven A = new oddeven();
        A.FIND(element,n);
        
    }
    
}

class oddeven 
{
   void FIND(int e[],int n)
   {   System.out.println("\nODD Numbers");
       for (int i=0;i<n;i++){
           if(e[i]%2!=0)
           {
               System.out.println(e[i]);
           }
       }
        System.out.println("EVEN Numbers");
         for (int i=0;i<n;i++){
            if(e[i]%2==0)
            {
                System.out.println(e[i]);
            }
       }
   }
}















