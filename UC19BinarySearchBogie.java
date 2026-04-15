import java.util.Arrays;
import java.util.Scanner;

public class UC19BinarySearchBogie {

    public static boolean binarySearch(String[] arr, String key) {

        int low = 0, high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int cmp = arr[mid].compareTo(key);

            if (cmp == 0) return true;
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine();

        if (n == 0) {
            System.out.println("Empty bogie list.");
            return;
        }

        String[] bogies = new String[n];

        System.out.println("Enter bogie IDs:");
        for (int i = 0; i < n; i++) {
            bogies[i] = sc.nextLine();
        }

        Arrays.sort(bogies);

        System.out.println("Sorted: " + Arrays.toString(bogies));

        System.out.print("Enter bogie ID to search: ");
        String key = sc.nextLine();

        boolean found = binarySearch(bogies, key);

        if (found) {
            System.out.println("Bogie found.");
        } else {
            System.out.println("Bogie NOT found.");
        }

        sc.close();
    }
}