public class HematologyTest extends LabTest {
    private boolean bloodTypeChecked;

    public HematologyTest(int recordId, int patientId, String testName, String result, String remarks, boolean bloodTypeChecked) {
        super(recordId, patientId, testName, result, remarks);
        this.bloodTypeChecked = bloodTypeChecked;
    }

    public HematologyTest(int recordId, int patientId, String testName, String result, String remarks) {
        this(recordId, patientId, testName, result, remarks, false);
    }

    public boolean isBloodTypeChecked() {
        return bloodTypeChecked;
    }

    public void setBloodTypeChecked(boolean bloodTypeChecked) {
        this.bloodTypeChecked = bloodTypeChecked;
    }

    @Override
    public String getCategory() {
        return "Hematology";
    }

    @Override
    public String toString() {
        return super.toString() + ", Blood Type Checked: " + bloodTypeChecked;
    }
}