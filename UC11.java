import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UC11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ==============================
        // 🔹 PRINT HEADER
        // ==============================
        System.out.println("==========================================");
        System.out.println(" UC11 - Validate Train ID & Cargo Codes ");
        System.out.println("==========================================\n");

        // ==============================
        // 🔹 TAKE INPUT
        // ==============================
        System.out.print("Enter Train ID: ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = sc.nextLine();

        // ==============================
        // 🔹 DEFINE REGEX PATTERNS
        // ==============================
        String trainRegex = "TRN-\\d{4}";
        String cargoRegex = "PET-[A-Z]{2}";

        Pattern trainPattern = Pattern.compile(trainRegex);
        Pattern cargoPattern = Pattern.compile(cargoRegex);

        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // ==============================
        // 🔹 VALIDATION
        // ==============================
        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();

        // ==============================
        // 🔹 OUTPUT RESULT
        // ==============================
        System.out.println("\nValidation Results:");

        if (isTrainValid) {
            System.out.println("Train ID is VALID");
        } else {
            System.out.println("Train ID is INVALID");
        }

        if (isCargoValid) {
            System.out.println("Cargo Code is VALID");
        } else {
            System.out.println("Cargo Code is INVALID");
        }

        System.out.println("\nUC11 validation completed...");
    }
}
