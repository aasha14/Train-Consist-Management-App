import java.util.*;
import java.util.stream.Collectors;

public class UC9 {
    public static void main(String[] args) {
        // 1️⃣ Create list of bogies (reuse the same Bogie class)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 90));
        bogies.add(new Bogie("AC Chair", 40));

        // 2️⃣ Group bogies by type (name)
        Map<String, List<Bogie>> grouped = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        // 3️⃣ Display grouped bogies
        System.out.println("Grouped Bogies by Type:");
        grouped.forEach((type, list) -> {
            System.out.println(type + ":");
            list.forEach(b -> System.out.println("  " + b));
        });
    }
}