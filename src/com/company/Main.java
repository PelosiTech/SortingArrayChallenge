package com.company;
/**
 * This program was designed to take in a certain amount of integers given by the user
 * sorts the integers by largest number to smallest number and print out the solution
 * This was a challenge because we only could use Arrays.
 * author: Carlo Pelosi
 * Date: June 1st 2018
 */


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	int[] myIntArray = getIntegers(5);
	int[] sorted = sortIntegers(myIntArray);
	printArray(sorted);

    }

    /**
     * Prints the array given using a for each loop
     * @param array
     */
    public static void printArray (int[] array) {
        for (int num: array) {
            System.out.println(num);
        }
    }

    /**
     * Tells the user to enter in a certain amount of numbers
     * @param number the number of integers the user has decided to enter
     * @return the array of integers that was made
     */
    public static int[] getIntegers(int number) {
        int[] values = new int[number];
        System.out.println("Please enter in " + number + " integers");
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }


    /**
     * Sorts the array using Arrays.copyOf and a while loop
     * @param array Array that needs to be sorted
     * @return sorted array
     */
    public static int[] sortIntegers(int[] array) {
        int[] copyOfArray = Arrays.copyOf(array,array.length);

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;


            for(int i=0; i< copyOfArray.length-1; i++) {
                if(copyOfArray[i] < copyOfArray[i+1]) {
                    temp = copyOfArray[i];
                    copyOfArray[i] = copyOfArray [i+1];
                    copyOfArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return copyOfArray;
    }
}
