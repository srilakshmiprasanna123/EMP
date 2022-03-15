package com.mod;

import java.util.Scanner;

public class emp3partb {

    public static double lengthCalc(double x1, double x2, double y1, double y2) {
        double length = Math.sqrt(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
        return length;
    }

    private static int lengthEquality(double length1, double length2) {
        int flag;
        Double len1 = new Double(length1);
        Double len2 = new Double(length2);
        flag = len1.compareTo(len2);
        return flag;
    }
    private static void output(int flag) {
        if(flag==0) {
            System.out.println("Both the lines are equal");
        } else if  (flag>0) {
            System.out.println("First line is bigger");
        } else {
                System.out.println("Second line is smaller");

            }
        }

    public static void main(String[] args) {
        System.out.println("Line Comparision");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1, y1, x2, y2");

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double length1 = lengthCalc(x1, y1, x2, y2);
        System.out.println("Enter a1, b1 and a2, b2 for line 2");
        double a1 = sc.nextDouble();
        double b1 = sc.nextDouble();
        double a2 = sc.nextDouble();
        double b2 = sc.nextDouble();
        double length2 = lengthCalc(a1, b1, a2, b2);

        int flag = lengthEquality(length1, length2);
        output(flag);
    }
}



