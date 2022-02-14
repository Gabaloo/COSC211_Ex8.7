package ex8_7;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.*;

class TESTinputArray {
  double[][] myArr; 
  
  @Before
  @Test
  //Test that entered values are correctly stored in array created by inputArray
  void testInputArrayValues() {  
    System.out.println("Enter \"3 0 1 2 1 2 3 2 3 4 10\" on the keyboard, and hit enter.");
    myArr = TwoDimArrays.inputArray();
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        Assert.assertTrue(myArr[i][j] == i + j);
      }
    }
  //test that length 3 array for 3 points is created
    Assert.assertTrue(myArr.length == 3);
    
  //test that length 3 rows are created for coordinates of x, y, and z
    Assert.assertTrue(myArr[0].length == 3);
  }
  
}
