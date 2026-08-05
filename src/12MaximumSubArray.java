import java.util.Scanner;
 class MaximumSubArray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int currentSum=arr[0];
        int maxSum=arr[0];
        for(int i=1;i<n;i++){
            currentSum=Math.max(arr[i],currentSum+arr[i]);
            maxSum=Math.max(maxSum,currentSum);
        }
        System.out.println("Maximum subarray Sum="+maxSum);
        sc.close();
    }
}
