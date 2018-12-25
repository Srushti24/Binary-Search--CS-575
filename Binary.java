

import java.util.Scanner;

public class Binary {


    public static void main(String[] args) {
        int right,left,t;
System.out.println("Enter the number of elements in the array:");
/*finding the number of elements in the array*/
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b[]=new int[a];
/*Initializing the array*/
System.out.println("Enter the elements of the array:");
/*Filling the array with elements*/
for(int i=0;i<a;i++)
{ 
    b[i]=sc.nextInt();
}
right=0;
left=a-1;
/*initializing variable right with zero and left with a-1*/


t=BinarySort(b, right, left);
/*recursion call*/
/*NOTE: my array starts with the index zero, hence if the first value is 0 it will show a match and so on*/
if(t==-1)
{
    System.out.println("Match not found");
}
else
{
    System.out.println("match found ");
}


    }
    
    public static int BinarySort(int b[],int right,int left)
    {
        while(right<=left)
        {
     int m=(left +right)/2;
     /*finding the value of middle element of the array*/
    
     
     if(b[m]==m)
     {
         System.out.println("Match found");
         System.out.println("The index match found b["+m +"]"+m);
         return m;
         /*if the array index  matches the value inside the array match is found*/
     }
     else if(b[m]<m)
     {
       return Binary.BinarySort(b,m+1,left);
       /*if the  value of middle element is less than  the m we will only consider the values after the middle element now since the elements before the middle element dont satisfy the condition of binary search*/
       
     }
     else if(b[m]>m)
     {
         return Binary.BinarySort(b,right,m-1);
          /*if the   index value of middle element is more than m we will only consider the values before the middle element now since the elements after the middle element dont satisfy the condition of binary search*/
     }

     
    }
return -1;
}
}
   
    

