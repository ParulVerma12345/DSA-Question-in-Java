import java.util.Scanner;
 class PlusOne {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of digits:");
        int n=sc.nextInt();
        int[]digits=new int[n];
        System.out.println("Enter digits:");
        for(int i=0;i<n;i++){
            digits[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i++){
            if(digits[i]<9){
                digits[i]++;
                System.out.println("Array after plus one:");
                for(int j=0;j<n;j++){
                    System.out.println(digits[j]+" ");
                }
                return;
            }
            digits[i]=0;

        }
        int[]result=new int[n+1];
        result[0]=1;
        System.out.println("Array after plus one:");
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]+" ");
        }
        sc.close();
    }
}
