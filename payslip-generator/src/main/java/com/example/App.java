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

        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("Allowance: $" + allowance);
        System.out.println("EPF Deduction: $" + epfDeduction);
        System.out.println("Company PEF Contribution: $" + companyPefContribution);
        System.out.println("Sport Club Charge: $" + sportClubCharge);
        System.out.println("Stamp Duty Charges: $" + stampDutyCharges);
        System.out.println("Total Salary: $" + totalSalary);
        System.out.println("Net Salary: $" + netSalary);
    }
}
