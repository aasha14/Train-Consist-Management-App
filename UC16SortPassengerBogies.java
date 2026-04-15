import java.util.Scanner;

public class UC16SortPassengerBogies {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }

    public static void display(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();

        int[] capacities = new int[n];

        System.out.println("Enter capacities:");
        for (int i = 0; i < n; i++) {
            capacities[i] = sc.nextInt();
        }

        System.out.print("Before Sorting: ");
        display(capacities);

        bubbleSort(capacities);

        System.out.print("After Sorting: ");
        display(capacities);

        sc.close();
    }
}