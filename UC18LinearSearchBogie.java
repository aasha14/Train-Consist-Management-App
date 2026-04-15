import java.util.Scanner;

public class UC18LinearSearchBogie {

    public static boolean linearSearch(String[] arr, String key) {

        for (String bogie : arr) {
            if (bogie.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] bogies = new String[n];

        System.out.println("Enter bogie IDs:");
        for (int i = 0; i < n; i++) {
            bogies[i] = sc.nextLine();
        }

        System.out.print("Enter bogie ID to search: ");
        String key = sc.nextLine();

        boolean found = linearSearch(bogies, key);

        if (found) {
            System.out.println("Bogie found.");
        } else {
            System.out.println("Bogie NOT found.");
        }

        sc.close();
    }
}