package com.camilosandoval.techinal.test.mahinda;

import com.camilosandoval.techinal.test.mahinda.question1_2.Question1;
import com.camilosandoval.techinal.test.mahinda.question1_2.Question2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TestMahindaApplicationTests {

	@Test
	void countAppearancesTest() {
   int[] numbers = {1, 2, 3, 3, 4, 5};
   int number = 3;
   Long result = Question1.countAppearances(numbers, number);

   // cretae junit test for countAppearances method in Question1 expecting 2 and result
   assertEquals(2L, result);
	}

 @Test
 void countWaysTest() {
   Long result = Question2.countWays(10);
   assertEquals(89L, result);
 }

}
