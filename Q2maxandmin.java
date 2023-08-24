/*import java.util.*;
public class Q2maxandmin {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int min=0,max=0;
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();

        }
        //if array consist only one element
        if(size==1){
            max=min=arr[0];
            System.out.println("Maximum element:"+max);
            System.out.println("Minimum element:"+min);
            
        }else{

        if(arr[0]>arr[1]){
            max=arr[0];
            min=arr[1];
        }
        else{
            max=arr[1];
            min=arr[0];
        }
        for(int i=2;i<size;i++){
            if(arr[i]>max){
                max=arr[i];}
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Maximum element:"+max);
        System.out.println("Minimum element:"+min);

    }
}
    
}*/
public class Q2maxandmin{
    public static void main(String[] args) {
        int[] arr={1,3,4,5,9,4,3};
        System.out.println(maxval(arr));
        System.out.println(minval(arr));
    }
    static int maxval(int[] arr){
            int max=arr[0];
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            return max;
    }
    static int minval(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
}
}
