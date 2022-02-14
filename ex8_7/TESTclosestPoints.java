package ex8_7;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TESTclosestPoints {
  
  double [][] arrOne = new double[][] {{0, 0, 0}, {1, 1, 1}, {2, 2, 2}};
  double [][] arrTwo = new double[][] {{0, 0, 0}, {0, 0, 6}, {0, 0, 2}};
  double [][] arrThree = new double[][] {{1, 9, 20}, {0, 0, 0}, {31, 21, 1}, {0, 0, 1}, {41, 2, 35}}; 
  double [][] arrTooSmall = new double[][] {{0,1,2}};
  int[] testArrOne;
  int[] testArrTwo;
  int[] testArrThree;
  int[] testArrTooSmall;
  
  @Test
  void testClosestPoints() {
    //Test that the closest points are correctly found at the first and last entries of the array.
    testArrTwo = TwoDimArrays.closestPoints(arrTwo);
    Assert.assertTrue(testArrTwo[0] == 0);
    Assert.assertTrue(testArrTwo[1] == 2);
    
    
    //Test that only the first instance of closest points are captured.  (1,1,1) and (2,2,2) are not considered the closest points
    testArrOne = TwoDimArrays.closestPoints(arrOne);
    Assert.assertTrue(testArrOne[0] == 0);
    Assert.assertTrue(testArrOne[1] == 1);
    //Assert.assertTrue(testArrOne[1] != 2);
    
    //Test that the closest points are correctly found at indices not the first or last.
    testArrThree = TwoDimArrays.closestPoints(arrThree);
    System.out.println(testArrThree[0] + " " + testArrThree[1]);
    Assert.assertTrue(testArrThree[0] == 1);
    Assert.assertTrue(testArrThree[1] == 3);
    
    testArrTooSmall = TwoDimArrays.closestPoints(arrTooSmall);
    Assert.assertTrue(testArrTooSmall[0] == -1);
    Assert.assertTrue(testArrTooSmall[1] == -1);
  }

}
