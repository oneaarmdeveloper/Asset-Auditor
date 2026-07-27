import java.math.BigDecimal;
import java.math.RoundingMode;

public class Auditor {
    public static void main(String[] args) {
        System.out.println("=== IT ASSET COMPLIANCE AUDIT STARTED ===");

        Asset[] inventory = {
                new Asset("IT-LPT-001", "LAPTOP", 14, true, "1200.00"),
                new Asset("IT-SRV-042", "SERVER", 14, true, "1200.00"),
                new Asset("IT-MON-112", "MONITOR", 14, true, "1200.00"),
                new Asset("IT-LPT-003", "LAPTOP", 14, true, "1200.00")
        };

        BigDecimal totalDepreciation = BigDecimal.ZERO;

        for (Asset item : inventory) {
            if (item != null && !item.isCompliant) {
                System.out.println("[ALERT] Non-compliant asset detected: " + item.assetId);
            }

            String category = switch (item.type) {
                case "LAPTOP" -> "End-User Device";
                case "SERVER" -> "Critical Infrastructure";
                case "MONITOR" -> "Peripheral";
                default -> "Unclassified";
            };

            BigDecimal monthlyDepreciation = item.value.divide(
                    new BigDecimal(item.ageMonths), 2, RoundingMode.HALF_UP
            );

            totalDepreciation = totalDepreciation.add(monthlyDepreciation);


            System.out.printf(" Processed: %-12s | %-22s | Age: %2d mo | Depreciation: %6.2f €/mo%n",
                    item.assetId, category, item.ageMonths, monthlyDepreciation);
        }

        System.out.println("\n=== AUDIT COMPLETE ===");
        System.out.println("Total Monthly Depreciation tracked: " + totalDepreciation + " €");
    }
}