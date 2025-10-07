package Lab1;

public class student {
    private int studentId;
    private String studentName;
    private int marks1, marks2, marks3;
    private float feePerMonth;
    private boolean isEligibleForScholarship;

    public student(int id, String name, int m1, int m2, int m3, float fee, boolean scholarship) {
        this.studentId = id;
        this.studentName = name;
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
        this.feePerMonth = fee;
        this.isEligibleForScholarship = scholarship;
    }

    public int getTotalMarks() { return marks1 + marks2 + marks3; }
    public float getAverage() { return getTotalMarks() / 3.0f; }
    public String getResult() { return (marks1 > 60 && marks2 > 60 && marks3 > 60) ? "pass" : "fail"; }
    public String getStudentName() { return studentName; }
    public float getFeePerMonth() { return feePerMonth; }
    public boolean isEligibleForScholarship() { return isEligibleForScholarship; }
}

// Make TestMain non-public
class TestMain {
    public static void main(String[] args) {
        student[] students = {
                new student(1, "Alice", 70, 85, 90, 5000, true),
                new student(2, "Bob", 65, 70, 75, 3000, false),
                new student(3, "Charlie", 90, 95, 85, 4000, true)
        };

        student top = students[0];
        student minFee = students[0];
        for (student s : students) {
            if (s.getTotalMarks() > top.getTotalMarks()) top = s;
            if (s.getFeePerMonth() < minFee.getFeePerMonth()) minFee = s;
        }

        System.out.println("Highest marks: " + top.getStudentName());
        System.out.println("Least fee: " + minFee.getStudentName() + ", Fee: " + minFee.getFeePerMonth());

        System.out.println("\n--- Student Details ---");
        for (student s : students) {
            System.out.println("Name: " + s.getStudentName() +
                    ", Total: " + s.getTotalMarks() +
                    ", Avg: " + s.getAverage() +
                    ", Result: " + s.getResult() +
                    ", Scholarship: " + s.isEligibleForScholarship());
        }
    }
}
