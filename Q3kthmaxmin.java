import java.util.*;
public class Q3kthmaxmin {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int min=0,max=0;
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value of K:");
        int k=sc.nextInt();
        //Sorting
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = 0;
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }     
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Value of kth maximum element"+arr[size-k]);
        System.out.println("Value kth minimum element"+arr[k-1]);
    }
}
