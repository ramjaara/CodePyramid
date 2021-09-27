package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int numberOfRows = input.nextInt();
        for (int i = 0; i < numberOfRows; i ++){
            for (int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
    }
        for (int i = numberOfRows; i < numberOfRows; i --){
            for (int j = numberOfRows; j>i; j--) {
                System.out.print("*");
            }
            System.out.println();
 }      }
}
