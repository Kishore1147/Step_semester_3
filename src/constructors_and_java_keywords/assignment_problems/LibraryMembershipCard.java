package constructors_and_java_keywords.assignment_problems;

public class LibraryMembershipCard {

    static String libraryName;
    static String renewalMonth;

    static {
        libraryName = "SRM Central Library";
        renewalMonth = "May 2027";
        System.out.println("Library info loaded");
    }

    String studentName;

    public LibraryMembershipCard(String studentName) {
        this.studentName = studentName;
    }

    public void printDetails() {
        System.out.println(
                studentName + " | " + libraryName + " | " + renewalMonth
        );
    }

    public static void main(String[] args) {

        String[] students = {
                "Arun",
                "Priya",
                "Rahul",
                "Kavya",
                "Vikram"
        };

        for (String student : students) {
            LibraryMembershipCard card =
                    new LibraryMembershipCard(student);

            card.printDetails();
        }
    }
}