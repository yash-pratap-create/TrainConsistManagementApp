import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("=====================================\n");

        Set<String> trainFormation = new LinkedHashSet<>();

        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");
        trainFormation.add("Sleeper");

        System.out.println("Final Train Formation (No duplicates, order preserved):");
        System.out.println(trainFormation);

        System.out.println("\nTotal Bogies: " + trainFormation.size());

        System.out.println("\nUC5 operations completed successfully...");
    }
}