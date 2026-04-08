import java.util.ArrayList;
import java.util.List;

class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String toString() {
        return type + " -> " + cargo;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC12 - Safety Compliance Check");
        System.out.println("=====================================\n");

        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Coal"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        boolean isSafe = goodsBogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum")
                );

        System.out.println("Goods Bogies:");
        for (GoodsBogie b : goodsBogies) {
            System.out.println(b);
        }

        System.out.println("\nSafety Status: " + (isSafe ? "SAFE" : "UNSAFE"));

        System.out.println("\nUC12 operations completed successfully...");
    }
}