import java.util.LinkedList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC4 - Maintain Ordered Bogie IDs");
        System.out.println("=====================================\n");

        // Create LinkedList to maintain train order
        LinkedList<String> trainConsist = new LinkedList<>();

        // ---- ADD bogies ----
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // ---- INSERT Pantry Car at position 2 ----
        trainConsist.add(2, "Pantry");

        System.out.println("\nAfter Adding Pantry Car at position 2:");
        System.out.println(trainConsist);

        // ---- REMOVE first and last bogie ----
        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(trainConsist);

        // ---- FINAL OUTPUT ----
        System.out.println("\nFinal Ordered Train Consist:");
        System.out.println(trainConsist);

        System.out.println("\nUC4 operations completed successfully...");
    }
}