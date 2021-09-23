package com.company;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char Char = input.toCharArray()[0];
//        byte[] bytes = input.getBytes("Windows-1253");
        System.out.println("16: " + String.format("%04x", (int) Char));
        System.out.println("8: " + String.format("%02x", (int) Char));
    }
}
