import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    String type;
    int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void display() {
        System.out.println(type + " -> " + capacity);
    }
}

public class UC8 {

    public static void main(String[] args) {

        System.out.println("=== UC8: Filter Passenger Bogies Using Streams ===\n");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // Display all
        System.out.println("All Bogies:");
        bogies.forEach(Bogie::display);

        // Stream filter
        List<Bogie> filtered = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        // Display filtered
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filtered.forEach(Bogie::display);

        System.out.println("\nUC8 Filtering completed...");
    }
}
