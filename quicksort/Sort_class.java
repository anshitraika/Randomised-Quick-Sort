
package quicksort;

import java.util.Random;



class Sort_class{ 
    int z=0,count=0;
    int pivot_arr[]=new int[Quicksort.n];   //array to store pivot element and leaf nodes
    BST ob_BST=new BST();    
    void quicksort(int arr[],int p,int q){
        if(p==q){
            pivot_arr[z]= arr[p]; z++;
        }
        if(p<q){
            count++;
            int pi= partition(arr,p,q);
            System.out.println("-----------------------");
            System.out.println("Pivot Element="+arr[pi]);
            System.out.println(" Sub-Array 1:");
            pivot_arr[z]=arr[pi]; z++;          
            for(int i=p;i<=(pi-1);i++)
                System.out.print(" "+ arr[i]);
            System.out.println("");
            System.out.println(" Sub-Array 2:");
            for(int i=(pi+1);i<=q;i++)
                System.out.print(" "+ arr[i]); 
            System.out.println("");
            System.out.println("-----------------------");
            quicksort(arr,p ,pi-1);
            quicksort(arr,pi+1, q); 
        }
       
    }
    void display(){
        for(int i=0;i<pivot_arr.length;i++)
            System.out.print(" "+pivot_arr[i]);
        System.out.println("\n---------------------------------------");
        System.out.println("Converting the above array into B.S.T with Inorder Traversal as:-");
        for(int i=0;i<pivot_arr.length;i++)
              ob_BST.insert(pivot_arr[i]);  //inserting elements into BST
        ob_BST.inorder();   // Inorder traversal of BST
        System.out.println("\nThe inorder traversal gives the result same as that of the sorted array by quick sort");
        System.out.println("Number of iteration := "+count);
    }
    
    int partition(int arr[],int p,int q){
        Random rand=new Random();
        int r,s,t,i;
        int arr_s[]=new int[arr.length];
        int arr_t[]=new int[arr.length];
        while(true){
            t=s=0;
            for(i=0;i<arr.length;i++){
                arr_s[i]=999;
                arr_t[i]=999;
            }
             r= rand.nextInt(q-p)+p;
             for(i=p;i<=q;i++){
                 if(arr[i]<=arr[r] && i!=r){
                     arr_s[s]=arr[i];
                     s++;                    
                 }
                 else{
                    if(arr[i]>arr[r] && i!=r){ 
                     arr_t[t]=arr[i];
                     t++;}
                 }
             }
             if(s>=((q-p)/4) && t>=((q-p)/4))
                 break;
            
         }    
        
        arr[s+p]=arr[r];
        for(i=p;i<p+s;i++)
            arr[i]=arr_s[i-p];
        for(i=p+s+1;i<=(t+p+s);i++)
            arr[i]=arr_t[i-(p+s+1)];
        return(s+p);
    }
    
}