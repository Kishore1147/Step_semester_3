package constructors_and_java_keywords.assignment_problems;

public class HackathonRegistration {

    String participantName;
    String teamName;

    public HackathonRegistration(String participantName, String teamName) {
        this.participantName = participantName;
        this.teamName = teamName;
    }

    public HackathonRegistration(String participantName) {
        this(participantName, "Solo");
    }

    public void printDetails() {
        System.out.println(participantName + " | Team: " + teamName);
    }

    public static void main(String[] args) {

        HackathonRegistration[] participants = {
                new HackathonRegistration("Arun", "Code Warriors"),
                new HackathonRegistration("Priya"),
                new HackathonRegistration("Rahul", "Java Masters"),
                new HackathonRegistration("Kavya")
        };

        for (HackathonRegistration participant : participants) {
            participant.printDetails();
        }
    }
}