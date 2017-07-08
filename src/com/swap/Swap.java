package com.swap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Swap {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a positive integer");
        String number = bufferedReader.readLine();
        System.out.println("Entered number is: " + number);
        int largestNumber = getLargestNumber(number);
        System.out.println("largest number: " + largestNumber);
    }

    private static int getLargestNumber(String number) {
        char[] digits = number.toCharArray();
        for (int i = 0; i < digits.length; ++i) {
            for (int j = i + 1; j < digits.length; ++j) {
                if (digits[i] < digits[j]) {
                    swap(digits, i, j);
                }
            }
        }
        String value = String.copyValueOf(digits);
        int maxNumber = Integer.parseInt(value);
        return maxNumber;
    }

    private static void swap(char[] digits, int max, int i) {
        char temp = digits[max];
        digits[max] = digits[i];
        digits[i] = temp;

    }

}
