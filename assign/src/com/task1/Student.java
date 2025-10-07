package com.task1;

public class Student {
    private int studentId;
    private String studentName;
    private int marks1, marks2, marks3;
    private float feePerMonth;
    private boolean isEligibleForScholarship;

    public Student(int id, String name, int m1, int m2, int m3, float fee, boolean scholarship) {
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

// Make com.task1.TestMain non-public
class TestMain {
    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "Alice", 70, 85, 90, 5000, true),
                new Student(2, "Bob", 65, 70, 75, 3000, false),
                new Student(3, "Charlie", 90, 95, 85, 4000, true)
        };

        Student top = students[0];
        Student minFee = students[0];
        for (Student s : students) {
            if (s.getTotalMarks() > top.getTotalMarks()) top = s;
            if (s.getFeePerMonth() < minFee.getFeePerMonth()) minFee = s;
        }

        System.out.println("Highest marks: " + top.getStudentName());
        System.out.println("Least fee: " + minFee.getStudentName() + ", Fee: " + minFee.getFeePerMonth());

        System.out.println("\n--- com.task1.Student Details ---");
        for (Student s : students) {
            System.out.println("Name: " + s.getStudentName() +
                    ", Total: " + s.getTotalMarks() +
                    ", Avg: " + s.getAverage() +
                    ", Result: " + s.getResult() +
                    ", Scholarship: " + s.isEligibleForScholarship());
        }
    }
}