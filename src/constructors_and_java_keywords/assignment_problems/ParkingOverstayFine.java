package constructors_and_java_keywords.assignment_problems;

public class ParkingOverstayFine {

    String vehicleNo;
    double parkingFee;

    public ParkingOverstayFine(String vehicleNo, double parkingFee) {
        this.vehicleNo = vehicleNo;
        this.parkingFee = parkingFee;
    }

    public final double calculateFine(int hoursLate) {
        return parkingFee * hoursLate / 100;
    }

    public final void printSummary(int hoursLate) {
        if (hoursLate > 0) {
            double fine = calculateFine(hoursLate);

            System.out.println(vehicleNo
                    + " | Parking Fee: Rs " + parkingFee
                    + " | Fine: Rs " + fine);
        } else {
            System.out.println(vehicleNo + " - No overstay fine");
        }
    }

    public static void main(String[] args) {

        String[] vehicleNos = {
                "TN01AB1234",
                "TN02CD5678",
                "TN03EF9012",
                "TN04GH3456"
        };

        double[] parkingFees = {
                200,
                300,
                250,
                400
        };

        int[] hoursLate = {
                2,
                0,
                -1,
                3
        };

        for (int i = 0; i < vehicleNos.length; i++) {

            ParkingOverstayFine vehicle =
                    new ParkingOverstayFine(vehicleNos[i], parkingFees[i]);

            vehicle.printSummary(hoursLate[i]);
        }
    }
}