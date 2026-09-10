package oop.class_problems;

public class Course {

    String code;
    String title;
    int credits;
    int labCredits;

    public Course(String code, String title, int credits, int labCredits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.labCredits = labCredits;
    }

    public Course(String code, String title, int credits){
        this(code, title, credits, 0);
    }

    int totalCredits(){
        return credits+labCredits;
    }

    public static void main(String[] args) {

        Course theory = new Course("21CSC201J", "Data Structure", 4);
        Course lab = new Course("21CSC205L", "DSA Lab", 3, 1);

        System.out.println("21CSC201J total credits: " + theory.totalCredits());
        System.out.println("21CSC205L total credits: " + lab.totalCredits());

    }
}