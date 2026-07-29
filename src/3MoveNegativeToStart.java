import java.util.Scanner;
class MoveNegativeToStart {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n=input.nextInt();
        int []arr=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0; i<n;i++){
            arr[i]=input.nextInt();
        }
        int []result=new int[n];
        int index=0;
        //Store negative numbers first
        for (int i=0;i<n;i++){
            if(arr[i]<0){
                result[index]=arr[i];
                index++;
            }
        }
        //Store remaining numbers
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                result [index]=arr[i];
                index++;
            }
        }
        System.out.println("Array after moving negative numbers to start:");
        for(int i=0;i<n;i++){
            System.out.println(result[i]+" ");
        }

    }
}
