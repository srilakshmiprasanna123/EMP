package com.mod;

public class emp6 {
    public static void main(String[] args) {
        int EmpRatePerHr = 20;
        int Max_Salary = 100;
        int WorkingHour = 0;

        int TotalWorkingDays = 0;
        int NumOfWorkingDays = 20;
        int empHrs = 0;

        while (WorkingHour <= Max_Salary && TotalWorkingDays < NumOfWorkingDays) {
            TotalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case 0 -> empHrs = 8;
                case 1 -> empHrs = 4;
                case 2 -> empHrs = 0;
            }
            WorkingHour += empHrs;
            System.out.println("Day#: " + TotalWorkingDays + " Emp Hr " + empHrs);
        }
        int totalEmpWage = WorkingHour * EmpRatePerHr;
        System.out.println("total Emp Wage " + totalEmpWage);
    }
}
