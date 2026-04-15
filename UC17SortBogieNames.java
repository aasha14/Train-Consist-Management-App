import java.util.Arrays;
import java.util.Scanner;

public class UC17SortBogieNames {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] bogies = new String[n];

        System.out.println("Enter bogie names:");
        for (int i = 0; i < n; i++) {
            bogies[i] = sc.nextLine();
        }

        System.out.println("Before Sorting: " + Arrays.toString(bogies));

        Arrays.sort(bogies);

        System.out.println("After Sorting: " + Arrays.toString(bogies));

        sc.close();
    }
}