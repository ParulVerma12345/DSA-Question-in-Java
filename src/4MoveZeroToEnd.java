import java.util.Scanner;
public class MoveZeroToEnd {
    public static void  main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter array element:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[]result=new int[n];
        int index=0;
        //copy all non-zero elements
        for (int i=0;i<n;i++){
            if(arr[i]!=0){
                result[index]=arr[i];
                index++;
            }
        }
        //fill remaining positions with 0
        while(index<n){
            result[index]=0;
            index++;
        }
        //Print result
        System.out.println("Array after moving zeros to end:");
        for(int i=0;i<n;i++){
            System.out.println(result[i]+" ");

        }
        sc.close();
    }

}
