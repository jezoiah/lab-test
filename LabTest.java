public class LabTest {
    private int recordId;
    private int patientId;
    private String testName;
    private String result;
    private String remarks;

    public LabTest(int recordId, int patientId, String testName, String result, String remarks) {
        this.recordId = recordId;
        this.patientId = patientId;
        this.testName = testName;
        this.result = result;
        this.remarks = remarks;
    }

    public LabTest(int recordId, int patientId, String testName, String result) {
        this(recordId, patientId, testName, result, "None");
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getCategory() {
        return "General Laboratory Test";
    }

    public void displayInfo() {
        System.out.println(toString());
    }

    public void displayInfo(boolean showRemarks) {
        if (showRemarks) {
            System.out.println(toString());
        } else {
            System.out.println("Record ID: " + recordId + ", Patient ID: " + patientId + ", Test: " + testName + ", Category: " + getCategory() + ", Result: " + result);
        }
    }

    @Override
    public String toString() {
        return "Record ID: " + recordId + ", Patient ID: " + patientId + ", Test: " + testName + ", Category: " + getCategory() + ", Result: " + result + ", Remarks: " + remarks;}
}