public class ChemistryTest extends LabTest {
    private boolean fastingRequired;

    public ChemistryTest(int recordId, int patientId, String testName, String result, String remarks, boolean fastingRequired) {
        super(recordId, patientId, testName, result, remarks);
        this.fastingRequired = fastingRequired;
    }

    public ChemistryTest(int recordId, int patientId, String testName,
                         String result, String remarks) {
        this(recordId, patientId, testName, result, remarks, false);
    }

    public boolean isFastingRequired() {
        return fastingRequired;
    }

    public void setFastingRequired(boolean fastingRequired) {
        this.fastingRequired = fastingRequired;
    }

    @Override
    public String getCategory() {
        return "Chemistry";
    }

    @Override
    public String toString() {
        return super.toString() + ", Fasting Required: " + fastingRequired;
    }
}