
package quicksort;

import java.util.Scanner;




public class Quicksort {
   public static int n=100; 
   @SuppressWarnings("empty-statement")
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        BST object_bst=new BST();
        String s="";
        String numbers[]={"9800000001","9800000002","9800000003","9800000004","9800000005","9800000006","9800000007","9800000008","9800000009","9800000010","9800000011","9800000012","9800000013","9800000014","9800000015","9800000016","9800000017","9800000018","9800000019","9800000020","9800000021","9800000022","9800000023","9800000024","9800000025","9800000026","9800000027","9800000028","9800000029","9800000030","9800000031","9800000032","9800000033","9800000034","9800000035","9800000036","9800000037","9800000038","9800000039","9800000040","9800000041","9800000042","9800000043","9800000044","9800000045","9800000046","9800000047","9800000048","9800000049","9800000050","9800000051","9800000052","9800000053","9800000054","9800000055","9800000056","9800000057","9800000058","9800000059","9800000060","9800000061","9800000062","9800000063","9800000064","9800000065","9800000066","9800000067","9800000068","9800000069","9800000070","9800000071","9800000072","9800000073","9800000074","9800000075","9800000076","9800000077","9800000078","9800000079","9800000080","9800000081","9800000082","9800000083","9800000084","9800000085","9800000086","9800000087","9800000088","9800000089","9800000090","9800000091","9800000092","9800000093","9800000094","9800000095","9800000096","9800000097","9800000098","9800000099","9800000100"};
        hash h=new hash();
        int  k=0, sum;
        int[] a=new int[10];
        int[] finalarray;      
        System.out.println("100 contacts are:");        
        Sort_class ob=new Sort_class();
        finalarray=new int[n];  //Array to store the 2 digit converted form of mobile numbers
        for(int i=0;i<n;i++){
            s=numbers[i];
          for(int j=0;j<10;j++)
            {
              a[j]= (int)s.charAt(j);}
            System.out.print(s);
          sum=h.quadraticprobing(a); //converting the number into 2 digit
          finalarray[i]=sum;
            System.out.print(" :-Equivalent 2 digit hashed value ="+ finalarray[i]+"\n");
            s="";
        }
        System.out.println("---------------------------------------");
        ob.quicksort(finalarray,0,finalarray.length-1); //calling quick sort function 
        System.out.println("Final sorted array:-");   
       for(k=0;k<finalarray.length;k++)
            System.out.print(" "+finalarray[k]);  //printing the sorted array
        System.out.println("");
        System.out.println("---------------------------------------");
        System.out.println("The Array of Pivots and leaf nodes:-");
       ob.display(); //display is a function of class sort_class
       
        
       
    } 
}   

  
