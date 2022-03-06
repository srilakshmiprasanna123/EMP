package com.mod;

import java.util.Scanner;

public class emp2partb {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //line1
        System.out.println("Enter x1 point :");
        int x1 = sc.nextInt();

        System.out.println("Enter y1 point :");
        int y1 = sc.nextInt();

        System.out.println("Enter x2point :");
        int x2 = sc.nextInt();

        System.out.println("Enter y2 point :");
        int y2 = sc.nextInt();

        double distanceXY = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        System.out.println("Distance Between points"
                + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ") : " + distanceXY);

        //line 2
        System.out.println("Enter m1 point :");
        int m1 = sc.nextInt();

        System.out.println("Enter n1 point :");
        int n1 = sc.nextInt();

        System.out.println("Enter m2 point :");
        int m2 = sc.nextInt();

        System.out.println("Enter n2 point :");
        int n2 = sc.nextInt();

        double  distanceMN = Math.sqrt((m2 - m1) * (m2 - m1) + (n2 - n1) * (n2 - n1));

        System.out.println("Distance Between points (X,Y):"
                + "(" + m1 + "," + n1 + ")," + "(" + m2 + "," + n2 + ") : " + distanceMN);

        if(distanceXY == distanceMN)
        {
            System.out.println("Two lines are equals");
        }
        else
        {
            System.out.println("Two lines are not equals");
        }
    }
}
