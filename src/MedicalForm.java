import java.util.Scanner;

public class MedicalForm {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Get and store the user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Get and store the user's age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Get and store the user's weight
        System.out.print("Enter your weight: ");
        float weight = scanner.nextFloat();

        // Get and store if the user is a smoker
        System.out.print("Are you a smoker (true/false)? ");
        boolean isSmoker = scanner.nextBoolean();

        // Output the information back to the user
        System.out.println("\n--- Medical Form Summary ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Smoker: " + isSmoker);

        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}
