import java.util.Scanner;

public class UC20ExceptionHandlingSearch {

    public static boolean search(String[] arr, String key) {

        if (arr.length == 0) {
            throw new IllegalStateException("No bogies available.");
        }

        for (String bogie : arr) {
            if (bogie.equals(key)) return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] bogies = new String[n];

        if (n > 0) {
            System.out.println("Enter bogie IDs:");
            for (int i = 0; i < n; i++) {
                bogies[i] = sc.nextLine();
            }
        }

        System.out.print("Enter bogie ID to search: ");
        String key = sc.nextLine();

        try {
            boolean found = search(bogies, key);

            if (found) {
                System.out.println("Bogie found.");
            } else {
                System.out.println("Bogie NOT found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}