package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        calculatePayslip(100000);
    }

    public static void calculatePayslip(double basicSalary) {
        double allowance = basicSalary * 0.25;
        double epfDeduction = basicSalary * 0.08;
        double companyPefContribution = basicSalary * 0.12;
        double sportClubCharge = 250;
        double stampDutyCharges = 25;

        double totalSalary = basicSalary + allowance ;
        double netSalary = totalSalary - epfDeduction - sportClubCharge - stampDutyCharges;

        System.out.printf("%-35s %10.2f%n", "Basic Salary: ", basicSalary);
        System.out.printf("%-35s %10.2f%n","Allowance: ", allowance);
        System.out.printf("%-35s %10.2f%n","EPF Deduction: ", epfDeduction);
        System.out.printf("%-35s %10.2f%n","Company PEF Contribution: ", companyPefContribution);
        System.out.printf("%-35s %10.2f%n","Sport Club Charge: ", sportClubCharge);
        System.out.printf("%-35s %10.2f%n","Stamp Duty Charges: ", stampDutyCharges);
        System.out.printf("%-35s %10.2f%n","Total Salary: ", totalSalary);
        System.out.printf("%-35s %10.2f%n","Net Salary: ", netSalary);
    }
}
