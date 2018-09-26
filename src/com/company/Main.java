package com.company;

import java.lang.Math;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//Opgave 3.1
        System.out.println("Opgave 3.1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b and c values");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double discriminant = Math.pow(b, 2) - 4*a*c;

        if (discriminant > 0){
            double r1 = (-b + Math.pow(Math.pow(b,2)-4*a*c,0.5))/2*a;
            double r2 = (-b - Math.pow(Math.pow(b,2)-4*a*c,0.5))/2*a;
            System.out.println("root 1 is " + r1 + " and the 2nd root is " + r2);
        }
        else if (discriminant == 0){
            double root = (-b + Math.pow(Math.pow(b,2)-4*a*c,0.5))/2*a;
            System.out.println("There is only one root and its " + root);
        }

        else {
            System.out.println("There are no roots");}
        System.out.println();

//opgave 3.2
        System.out.println("3.2");
        int nr1 = (int) Math.floor((Math.random()*100)+1);
        int nr2 = (int) Math.floor((Math.random()*100)+1);
        System.out.println(nr1+ " + " + nr2 + " = ?");
        int anwser = nr1+nr2;
        int input = sc.nextInt();

        if (anwser == input) {
            System.out.println("Correct");}
            else {
            System.out.println("Wrong");}
        System.out.println();
//opgave 3.3
        System.out.println("Opgave 3.3");
        System.out.println("Enter value of a,b,c,d,e,f");
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double D = sc.nextDouble();
        double E = sc.nextDouble();
        double F = sc.nextDouble();
        double result = A*D - B*C;

        if (result == 0){
            System.out.println("There is no solution");}
//opgave 3.4
        System.out.println("");
        System.out.println("Opgave 3.4");
        int months = (int) Math.floor((Math.random() * 12) + 1);
        System.out.println("nr "+ months + " is ");

        if (months == 1) {
            System.out.println("Jan.");}
            if (months == 2) {
                System.out.println("Feb.");
            }
            if (months == 3) {
                System.out.println("Mar.");
            }
            if (months == 4) {
                System.out.println("Apr.");
            }
            if (months == 5) {
                System.out.println("May");
            }
            if (months == 6) {
                System.out.println("June");
            }
            if (months == 7) {
                System.out.println("July");
            }
            if (months == 8) {
                System.out.println("Aug");
            }
            if (months == 9) {
                System.out.println("Sep");
            }
            if (months == 10) {
                System.out.println("Oct");
            }
            if (months == 11) {
                System.out.println("Nov");
            }
            else if (months == 12){
                System.out.println("Dec");
            }
        }
    }
