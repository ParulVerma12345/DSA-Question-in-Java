import java.util.Scanner;

 class AlternateElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Alternate elements are:");

        for(int i = 0; i < n; i = i + 2) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
