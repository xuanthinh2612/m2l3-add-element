package com.company;

import java.util.Scanner;

public class addElement {
    public static void main(String[] args) {
        // write your code here

        int[] arr = {10, 4, 6, 8, 8, 0, 0, 0, 0, 0};
        System.out.println(" your array:  ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        new addElement().addElement(arr);
        System.out.println("your new array:  ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }

    void addElement(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Insert index  ");
        int index = scanner.nextInt();
        while (index > arr.length - 1) {
            System.out.println("Insert index again <" + (arr.length - 1));
            index = scanner.nextInt();
        }
        System.out.println("Insert value  ");
        int value = scanner.nextInt();
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
    }
}

