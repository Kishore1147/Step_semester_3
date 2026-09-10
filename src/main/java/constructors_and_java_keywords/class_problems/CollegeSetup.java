package constructors_and_java_keywords.class_problems;

public class CollegeSetup {

    static String collegeName;
    static String academicYear;

    static {
        collegeName = "SRM";
        academicYear = "2026-2027";
        System.out.println("College info loaded");
    }

    String studentName;

    public CollegeSetup(String studentName) {
        this.studentName = studentName;
    }

    public void printDetails() {
        System.out.println(studentName + " | " + collegeName + " | " + academicYear);
    }

    public static void main(String[] args) {

        String[] students = {
                "Arun",
                "Priya",
                "Rahul",
                "Kavya"
        };

        for (String student : students) {
            CollegeSetup studentRecord = new CollegeSetup(student);
            studentRecord.printDetails();
        }
    }
}