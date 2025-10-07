class Student:
    def __init__(self):
        self.student_id = 0
        self.student_name = ""
        self.city = ""
        self.marks1 = 0
        self.marks2 = 0
        self.marks3 = 0
        self.fee_per_month = 0.0
        self.is_eligible_for_scholarship = False

    # Methods
    def get_annual_fee(self):
        return self.fee_per_month * 12

    def get_total_marks(self):
        return self.marks1 + self.marks2 + self.marks3

    def get_average(self):
        return self.get_total_marks() / 3

    def get_result(self):
        return "pass" if self.marks1 > 60 and self.marks2 > 60 and self.marks3 > 60 else "fail"


# --- Test Script ---
s1 = Student()
s1.student_name = "Alice"
s1.marks1, s1.marks2, s1.marks3 = 85, 90, 78
s1.fee_per_month = 5000
s1.is_eligible_for_scholarship = True

s2 = Student()
s2.student_name = "Bob"
s2.marks1, s2.marks2, s2.marks3 = 70, 65, 72
s2.fee_per_month = 4500
s2.is_eligible_for_scholarship = False

s3 = Student()
s3.student_name = "Charlie"
s3.marks1, s3.marks2, s3.marks3 = 95, 92, 88
s3.fee_per_month = 5500
s3.is_eligible_for_scholarship = True

students = [s1, s2, s3]

# Highest total marks
highest = max(students, key=lambda s: s.get_total_marks())
print("Highest Marks:", highest.student_name)

# Lowest fee
lowest = min(students, key=lambda s: s.fee_per_month)
print("Lowest Fee:", lowest.student_name, "-", lowest.fee_per_month)

# Each student's details
print("\n--- Student Details ---")
for s in students:
    print(f"Name: {s.student_name}")
    print(f"Total Marks: {s.get_total_marks()}")
    print(f"Average: {s.get_average():.2f}")
    print(f"Result: {s.get_result()}")
    print(f"Scholarship: {s.is_eligible_for_scholarship}")
    print("-" * 30)