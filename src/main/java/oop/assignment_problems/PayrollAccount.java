package oop.assignment_problems;

public class PayrollAccount {

    private double basicSalary;
    private double bonus;

    public PayrollAccount(double openingBasicSalary){

        if(openingBasicSalary < 0){
            basicSalary = 0;
            System.out.println("Invalid amount: ,Starting with 0");
        }
        else{
            basicSalary = openingBasicSalary;
        }
    }

    public void creditBonus(double amount){

        if (amount <= 0){
            System.out.println("Credit rejected: ,Amount should be greater than 0");
        }
        else{
            bonus += amount;
            System.out.println("Bonus credited: Rs " + amount);
        }
    }

    public void deductTax(double percent){

        if (percent < 0 || percent > 100){
            System.out.println("Tax Percent should be less than 100 and greater tha 0");
        }
        else {
            basicSalary -= basicSalary * (percent / 100);
            System.out.println("Tax deducted: " + percent + "%");
        }
    }

    public double getNetSalary(){
        return basicSalary+bonus;
    }

    public static void main(String[] args) {

        PayrollAccount p = new PayrollAccount(50000);

        p.creditBonus(5000);
        p.deductTax(10);

        System.out.println("Net salary: Rs " +  p.getNetSalary());
    }
}