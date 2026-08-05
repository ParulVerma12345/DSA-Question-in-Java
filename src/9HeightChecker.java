import java.util.Scanner;
import java.util.Arrays;
 class HeightChecker {
    public static void  main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n=sc.nextInt();
        int[]heights=new int[n];
        int[]expected=new int[n];
        System.out.println("Enter heights:");
        for(int i=0;i<n;i++){
            heights[i]=sc.nextInt();
            expected[i]=heights[i];

        }
        Arrays.sort(expected);
        int count=0;
        for(int i=0;i<n;i++){
            if(heights[i]!=expected[i]){
                count++;
            }
        }
        System.out.println("Students in wrong position="+count);
        sc.close();
    }
}
