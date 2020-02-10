// Sagar Patel, CSCI1660, Exercise4, 2/5/2020
package com.company.Patel;
import java.util.*;
public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Map<String, Double> cityTemp = new HashMap<>();
        double avg = 0;
        String curCity = "";
        while (!(curCity.equals("END"))) {
            curCity = collectCity();
            if (!(curCity.equals("END"))) {
                avg = calcTemp();
            }
            cityTemp.put(curCity, avg);
        }
        cityTemp.remove("END");
        display(cityTemp);
    }
    public static String collectCity() {
        System.out.println("What is the name of the city you want to add?");
        return input.nextLine();
    }
    public static double calcTemp() {
        double total = 0;
        double avg = 0; 
        for (int i = 1; i < 6; i++) {
            System.out.println("What is the temperature of day " + i + "?");
            int temp = input.nextInt();
            input.nextLine();
            total = temp + total;
            avg = total / 5;
        }
        return avg;
    }
    public static void display(Map<String, Double> cityTemp) {
        System.out.println(cityTemp);
    }
}