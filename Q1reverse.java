import java.lang.reflect.Array;

/*import java.util.Scanner;

public class Q1reverse {
    public static void main(String[] args){
        //reverse an array
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();

        }
        //reverse loop
        for(int i=size-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
public class Q1reverse{
    public static void main(String[] args) {
        int[] arr={3,6,4,5,2,9,23};
        revarr(arr);
    }
    static void revarr(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        

    }
}*/
public class Q1reverse{
public static void main(String[] args) {
    int[] arr={18,12,9,14,77,50};
    int k=77;
    System.out.println(search(arr,k));
}
static int search(int[] arr, int target){
    if(arr.length==0){
        return -1;
    }
    for(int i=0;i<arr.length;i++){
        int e=arr[i];
        if(e==target){
            return i;
        }
    }
}
}
