package com.mod;

public class emp9 {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;


    public emp9(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
        }

        public static void main(String[] args) {
            emp9 dMart = new emp9("Dmart", 20, 2, 10);
            int empHrs = 0;
            int totalEmpHrs = 0;
            int totalworkingDays = 0;
            int EmpHr = 0;


            while (totalEmpHrs <= dMart.maxHoursPerMonth && totalworkingDays < dMart.numOfWorkingDays) {
                totalworkingDays++;
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;

                switch (empCheck) {
                    case 0:
                        EmpHr = 8;
                        break;

                    case 1:
                        EmpHr = 4;
                        break;

                    case 2:
                        EmpHr = 0;
                        break;
                }

                totalEmpHrs = totalEmpHrs + EmpHr;
                System.out.println("Day#: " + totalworkingDays + " Emp Hr : " + EmpHr);
            }
            int totalEmpWage = totalEmpHrs * dMart.empRatePerHour;
            System.out.println("total Emp Wage for company : "+ dMart.company + "is: " + totalEmpWage);


        }
    }

