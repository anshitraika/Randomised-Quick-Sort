
package quicksort;

import java.util.Random;


class hash{
    
    int[] hash_array=new int[11];
    int i,j,x,h,f,number;
  
   int quadraticprobing(int data[]){ 
    for(i=0;i<10;i++)
       hash_array[i]=-1;
    for(i=0;i<10;i++){
            if(data[i]!=999){
                x=data[i];         
                for(j=0;j<hash_array.length;j++){
                    f=j*j;
                    h=(x+f) %(int) 11;
                    if(hash_array[h]==-1)
                      {
                        hash_array[h] = x;                       
                        break;
                      }
                }
            }
        }
    int sum=0;
    for(i=0;i<10;i++)
    { if(i%2==0)
        sum=sum+(i*hash_array[i]);   //multiplying index by array value
      else
        sum=sum-(hash_array[i]);
    }
    Random r=new Random();
    while(sum>99)                  //bringing the sum between 0-99
        sum=sum-r.nextInt(100);
    while(sum<0)
        sum=sum+r.nextInt(99);
    return sum;   
}   
}