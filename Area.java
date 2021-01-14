package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        double A;
        double r;
        Scanner input;

        input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        r = input.nextDouble();
        input.close();

        A = Circle.getArea(r);
        System.out.printf("The area of a circle of radius" + r + " is: " + A);
    }
}
