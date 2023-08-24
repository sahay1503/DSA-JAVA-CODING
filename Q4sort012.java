import java.util.*;

public class Q4sort012 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int i;
        int cnt0=0,cnt1=0,cnt2=0;
        int[] arr=new int[size];
        for( i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<size;i++){
        switch(arr[i]){
            case 0:
                cnt0++;
                break;
            case 1:
                cnt1++;
                break;
            case 2:
                 cnt2++;
                 break;
        }
    }
        i=0;

        while(cnt0>0){
            arr[i++]=0;
            cnt0--;
        }
        while(cnt1>0){
            arr[i++]=1;
            cnt1--;
        }
        while(cnt2>0){
            arr[i++]=2;
            cnt2--;
        }
        System.out.println(Arrays.toString(arr));



    }
    
}
