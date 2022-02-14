package ex8_7;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TESTdistance {
  
  //Test point coordinates
  int x = 3;
  int y = 4;
  int z = 0;
  
  double expectedDist = 5.0;
  
  @Test
  void testDistance() {
    //Test distance with origin and (x, y, z)
    Assert.assertTrue(expectedDist == TwoDimArrays.distance(x, 0, y, 0, z, 0));
  
    //Test distance 0 with same point
    Assert.assertTrue(0 == TwoDimArrays.distance(x, x, y, y, z, z));
  }

}
