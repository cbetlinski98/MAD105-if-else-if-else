package com.example.java;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        double temp = scanner.nextDouble();

        if(temp < 97.5)
        {   System.out.println("Low"); }
        else if(temp > 97.5 && temp < 99.5)
        {   System.out.println("Normal"); }
        else
        {   System.out.println("High"); }
    }
}