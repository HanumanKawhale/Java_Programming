//Program to display sorting number Ascending order input from user
import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many number:");
        int iNo=sc.nextInt();

        int arr[]=new int[iNo];

        for(int i=0;i<iNo;i++){
            
            System.out.println("your index "+i+" :"  );
            arr[i]=sc.nextInt();
        }
         //bubble sort
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){

                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }

    }
}
