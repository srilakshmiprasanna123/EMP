package com.mod;

public class emp5 {
    public static void main(String[] args) {

        int PerHourSalary = 20;
        int workingHour;
        int totalSalary = 0;
        int Salary;

        for (int day = 1; day <= 20; day++)
        {
            int empCheck = (int) Math.floor(Math.random() * 10) % 2;
            workingHour = switch (empCheck) {
                case 0 -> 8;
                case 1 -> 4;
                default -> 0;
            };

            Salary =workingHour * PerHourSalary ;
            totalSalary = totalSalary + Salary;

        }
        System.out.println("Employee has earned total salary in a month: " + totalSalary);

    }
}
