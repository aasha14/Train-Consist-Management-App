import java.util.*;
import java.util.stream.Collectors;

public class UC8 {
    public static void main(String[] args) {
        // 1️⃣ Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 90));
        bogies.add(new Bogie("AC Chair", 40));

        // Display all bogies
        System.out.println("All Bogies:");
        bogies.forEach(b -> System.out.println(b));

        // Filter bogies with capacity > 60
        List<Bogie> filtered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Display filtered bogies
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filtered.forEach(b -> System.out.println(b));
    }
}