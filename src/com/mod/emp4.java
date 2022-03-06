package com.mod;

public class emp4 {
    public static void main(String[] args) {
        int EmpWagePerHr = 20;
        int EmpHr = 8;
        int IsFullTime = 1;
        int IsPartTime = 2;
        int Salary = 0;

        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck) {
            case 0:
                EmpHr = 8;
                Salary = (EmpHr * EmpWagePerHr);
                System.out.println("Employee salary for full time is: " + Salary);
                break;

            case 1:
                EmpHr = 4;
                Salary = (EmpHr * EmpWagePerHr);
                System.out.println("Employee salary for part time is: " + Salary);
                break;

            case 2:
                EmpHr = 0;
                Salary = (EmpHr * EmpWagePerHr);
                System.out.println("Employee salary for Absent  is: " + Salary);
                break;
        }
    }
}
