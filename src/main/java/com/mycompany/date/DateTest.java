/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.date;

/**
 *
 * @author Naweed
 */

import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Asks the user to insert the date:
        System.out.println("What is the current month? (Enter a number 1-12)");
        int month = input.nextInt();
        
        System.out.println("What is the current date? (Enter a number 1-31)");
        int day = input.nextInt();
        
        System.out.println("What is the current year?");
        int year = input.nextInt();
        
        // Outputs the year to the user:
        System.out.println("\nToday's date is: ");
        System.out.println(month + "/" + day + "/" + year);
        
    }
}
