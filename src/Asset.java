import java.math.BigDecimal;

public class Asset {
    public String assetId; // Fixed: was a comma, now a semicolon
    public String type;

    public int ageMonths;
    public boolean isCompliant;

    public BigDecimal value;

    public Asset(String assetId, String type, int ageMonths, boolean isCompliant, String initialValue) {
        this.assetId = assetId;
        this.type = type;
        this.ageMonths = ageMonths;
        this.isCompliant = isCompliant;
        this.value = new BigDecimal(initialValue);
    }
}