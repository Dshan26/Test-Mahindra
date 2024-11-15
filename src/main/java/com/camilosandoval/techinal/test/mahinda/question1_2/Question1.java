package com.camilosandoval.techinal.test.mahinda.question1_2;

/*
Question 1
Write a method that takes 2 parameters. The first parameter is an
array of integers that has already been sorted from smallest to largest.
The second parameter is an integer. The method should return the number of
times the second parameter appears in the first parameter.
Example:
If the first parameter is [1, 2, 3, 3, 4, 5] and the second parameter is 3. The method should return 2.

Part 1: Please explain your algorithm.
Part 2: Please implement the method in Java.

* */

import java.util.Arrays;

public class Question1 {

 public static void main(String[] args) {
  //create an array of integers the size of 6
   int[] numbers = {1, 2, 3, 3, 4, 5};
   //parameter is 3
   int number = 3;
   //call the method and print the result
   Long result = countAppearances(numbers, number);
   System.out.println(result);
 }

 public static Long countAppearances(int[] numbers, int number) {
   //utilize stream to filter and count the number of times the number appears
   return Arrays.stream(numbers).filter(n -> n == number).count();
 }
 /*please check the test cases en el package test call countAppearancesTest*/


}
