package com.example;

public interface PayslipHandler {

    void calculate(Payslip payslip);

    void next(PayslipHandler payslipHandler);
}
