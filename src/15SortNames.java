
import java.util.Scanner;
import java.util.Arrays;

 class SortNames {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();   // Consume newline

        String[] names = new String[n];

        System.out.println("Enter names:");

        for(int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        // Sort the names
        Arrays.sort(names);

        System.out.println("Names after sorting:");

        for(int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }

        sc.close();
    }
}