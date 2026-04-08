import java.util.ArrayList;
import java.util.List;

public class UC10 {
    public static void main(String[] args) {

        // Step 1: Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        // ==============================
        // 🔹 PRINT HEADER
        // ==============================
        System.out.println("======================================");
        System.out.println("   UC10 - Count Total Seats in Train  ");
        System.out.println("======================================\n");

        // ==============================
        // 🔹 PRINT BOGIES
        // ==============================
        System.out.println("Bogies in Train:");

        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        // ==============================
        // 🔹 CALCULATE TOTAL (UC10)
        // ==============================
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        // ==============================
        // 🔹 PRINT RESULT
        // ==============================
        System.out.println("\nTotal Seating Capacity of Train: " + totalSeats);

        System.out.println("\nUC10 aggregation completed...");
    }
}