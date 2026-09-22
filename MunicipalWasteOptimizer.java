import java.util.Scanner;
public class MunicipalWasteOptimizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.println("=== MUNICIPAL WASTE COLLECTION OPTIMIZER ===");
    System.out.println("Smart City & Route Optimization System\n");
    System.out.println("--- Enter Live Data from Waste Bins ---");
    
    int bin1Id = 101;
    String bin1Location = "Ameerpet Junction";
    System.out.print("Enter fill level for " + bin1Location + " (0-100%): ");
    int bin1Fill = scanner.nextInt();

    int bin2Id = 102;
    String bin2Location = "SR Nagar Main Road";
    System.out.print("Enter fill level for " + bin2Location + " (0-100%): ");
    int bin2Fill = scanner.nextInt();

    int bin3Id = 103;
    String bin3Location = "Balkampet Market";
    System.out.print("Enter fill level for " + bin3Location + " (0-100%): ");
    int bin3Fill = scanner.nextInt();

    
    System.out.println("\n--- All Mapped Bins ---");
    System.out.println("Bin ID: " + bin1Id + " | Location: " + bin1Location + " | Fill Level: " + bin1Fill + "%");
    System.out.println("Bin ID: " + bin2Id + " | Location: " + bin2Location + " | Fill Level: " + bin2Fill + "%");
    System.out.println("Bin ID: " + bin3Id + " | Location: " + bin3Location + " | Fill Level: " + bin3Fill + "%");

    
    System.out.println("\n--- Bins Ranked by Urgency (Priority Pickup) ---");
    
    if (bin1Fill >= 75) {
        System.out.println("[URGENT] Bin " + bin1Id + " at " + bin1Location + " is " + bin1Fill + "% full.");
    } else {
        System.out.println("[NORMAL] Bin " + bin1Id + " at " + bin1Location + " is " + bin1Fill + "% full.");
    }

    if (bin2Fill >= 75) {
        System.out.println("[URGENT] Bin " + bin2Id + " at " + bin2Location + " is " + bin2Fill + "% full.");
    } else {
        System.out.println("[NORMAL] Bin " + bin2Id + " at " + bin2Location + " is " + bin2Fill + "% full.");
    }

    if (bin3Fill >= 75) {
        System.out.println("[URGENT] Bin " + bin3Id + " at " + bin3Location + " is " + bin3Fill + "% full.");
    } else {
        System.out.println("[NORMAL] Bin " + bin3Id + " at " + bin3Location + " is " + bin3Fill + "% full.");
    }

    
    int vehicleId = 1;
    int maxCapacity = 2;
    int currentLoad = 0;

    System.out.println("\n--- Optimized Collection Route for Vehicle ID: " + vehicleId + " ---");
    System.out.println("Vehicle Capacity: Max " + maxCapacity + " bins before depot trip.\n");

    System.out.println("Dispatching route based on highest urgency:");

    if (bin3Fill >= 75 && currentLoad < maxCapacity) {
        currentLoad++;
        System.out.println(" -> Stop " + currentLoad + ": Collected Bin " + bin3Id + " (" + bin3Location + ")");
    }

    if (bin1Fill >= 75 && currentLoad < maxCapacity) {
        currentLoad++;
        System.out.println(" Stop " + currentLoad + ": Collected Bin " + bin1Id + " (" + bin1Location + ")");
    }

    if (bin2Fill >= 75 && currentLoad < maxCapacity) {
        currentLoad++;
        System.out.println(" -> Stop " + currentLoad + ": Collected Bin " + bin2Id + " (" + bin2Location + ")");
    }

    System.out.println("\nRoute execution complete! Vehicle returning to depot.");
}
}