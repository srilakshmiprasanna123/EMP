package com.mod;

import java.util.Scanner;

public class emp1partb {
    public static void main(String[] args) {

        int x1,y1,x2,y2;
        double length;

        Scanner scan = new Scanner(System.in);

        System.out.println("enter x1 point");
        x1=scan.nextInt();

        System.out.println("enter x2 point");
        x2=scan.nextInt();

        System.out.println("enter y1 point");
        y1=scan.nextInt();

        System.out.println("enter y2 point");
        y2=scan.nextInt();

        length=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("leghth of a line"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+length);
    }
}
