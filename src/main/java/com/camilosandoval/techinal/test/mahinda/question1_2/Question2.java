package com.camilosandoval.techinal.test.mahinda.question1_2;

/*Question 2
Assume are climbing a staircase of 10 steps. Also, assume that you can only take 1 or 2 steps each time you move up the stairs.
Below is an example of two different ways you can climb the staircase.
1, 1, 2, 2, 1, 2, 1
2, 2, 2, 2, 2

Write an algorithm to calculate the total number of unique ways we can climb the staircase.
Part 1: If you do a google search on this problem, you will find that one of the solutions uses the Fibonacci sequence. Explain how this solution works.
You do not need to write any code.
Part 2: If we do not use Fibonacci sequence solution, how could we solve this problem? Please explain your algorithm.
*/

import java.util.stream.Stream;

public class Question2 {

  public static void main(String[] args) {
    //call the method and print the result stairs of 10 steps
    Long result = countWays(10);
    //print the result
    System.out.println(result);
  }

  public static Long countWays(int steps) {
    //return the result of the fibonacci sequence with the number of steps in the parameter, 10 in this case
    //example steps =10 --> 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
    return Stream.iterate(new Long[]{1L, 2L}, a -> new Long[]{a[1], a[0] + a[1]})
            //generate the fibonacci sequence infinite
            .limit(steps)//limit the number of steps
            .map(a -> a[0])//get the first value of the array
            .reduce((firtValue, secondValue) -> secondValue)// // get the second value of the array
            .orElse(1L); //return 1 if the stream is empty

  }/*please check the test cases en el package test call countWaysTest*/

}
