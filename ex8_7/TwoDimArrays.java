package ex8_7;

import java.util.Scanner;

public class TwoDimArrays {
  
  //variables
  private static double[][] points;
  private static Scanner scnr = new Scanner (System.in);
  
  //METHOD to create 1D array of each points' coordinates
  public static double[][] inputArray() {
    System.out.print("Enter the number of points: ");
    int numberOfPoints = scnr.nextInt();
    while (numberOfPoints < 2) {
      System.out.println("At least 2 points are required.  Please enter a larger number.");
      numberOfPoints = scnr.nextInt();
    }
    
    double[][] tempArr = new double[numberOfPoints][3];
    for (int i = 0; i < numberOfPoints; i++) {
      
      tempArr[i][0] = scnr.nextDouble();
      tempArr[i][1] = scnr.nextDouble();
      tempArr[i][2] = scnr.nextDouble();
    }
    return tempArr;
  }
  
  //METHOD to calculate distance between two points
  public static double distance(double x1, double x2, double y1, double y2, double z1, double z2) {
    return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) + (z2 - z1) * (z2 - z1));
  }
  
 
  
  public static int[] closestPoints(double[][] points) {
    
    int[] closestPts;
    int i = 0;
    int j = 0;
    int p1 = 0;
    int p2 = 1;
    
    if (points.length > 1) {
      double shortestDistance = distance(points[0][0], points[1][0], points[0][1], points[1][1], points[0][2], points[1][2]);
      double distance= shortestDistance;
      
      for (i = 0; i < points.length; i++) {
        
        for (j = i+1; j < points.length; j++) {
          
          distance = distance(points[i][0], points[j][0], points[i][1], points[j][1], points[i][2], points[j][2]);
          if (shortestDistance > distance) {
            p1 = i; //Update point 1
            p2 = j; //Update point 2
            shortestDistance = distance;  //Update distance
          }  
        }
      }
      closestPts = new int[] {p1, p2};
      
    } else {
      System.out.println("Too few points have been entered.  Cannot determine a pair of closest points");
      closestPts = new int[] {-1, -1};
    }
    
    return closestPts;
     
  }
  
 
  public static void displayClosestPoints(int pt1, int pt2) {
    System.out.println("The closest two points are (" + points[pt1][0] + ", " + points[pt1][1] + ", " + points[pt1][2] + ") and (" + points[pt2][0] + ", " + points[pt2][1] + ", " + points[pt2][2] + ")");
    
  }
  
 
  public static void main (String[] args) {

    points = inputArray();
    int[] closestArr = closestPoints(points);
    displayClosestPoints(closestArr[0], closestArr[1]);
     
  }
}

