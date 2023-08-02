package org.example;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, -4, 7, 12};
        out.println("The sum of positive numbers is: " + SumOfPositive.sumOfPositives(arr1)); // 20

        int[] arr2 = {-1, -2, -3, -4, -5};
        out.println("The sum of positive numbers is: " + SumOfPositive.sumOfPositives(arr2)); // 0

        int[] arr3 = {1, 2, 3, 4, 5};
        out.println("The sum of positive numbers is: " + SumOfPositive.sumOfPositives(arr3)); // 15
    }
}