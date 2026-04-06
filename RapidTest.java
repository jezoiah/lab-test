public class RapidTest extends LabTest {
    private String kitType;

    public RapidTest(int recordId, int patientId, String testName, String result, String remarks, String kitType) {
        super(recordId, patientId, testName, result, remarks);
        this.kitType = kitType;
    }

    public RapidTest(int recordId, int patientId, String testName, String result, String remarks) {
        this(recordId, patientId, testName, result, remarks, "Standard Kit");
    }

    public String getKitType() {
        return kitType;
    }

    public void setKitType(String kitType) {
        this.kitType = kitType;
    }

    @Override
    public String getCategory() {
        return "Rapid Test";
    }

    @Override
    public String toString() {
        return super.toString() + ", Kit Type: " + kitType;
    }
}