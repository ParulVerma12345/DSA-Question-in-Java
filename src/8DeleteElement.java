import java.util.Scanner;

class DeleteElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to delete: ");
        int element = sc.nextInt();

        int position = -1;

        // Find the element
        for(int i = 0; i < n; i++) {
            if(arr[i] == element) {
                position = i;
                break;
            }
        }

        if(position == -1) {
            System.out.println("Element not found.");
        } else {

            // Shift elements to the left
            for(int i = position; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }

            System.out.println("Array after deletion:");

            for(int i = 0; i < n - 1; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
