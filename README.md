# COSC211_Ex8.7
Excercise 8.7 from Liang, with required methods and testing

Enter matrix of points in 3d space.  matrix length determined by user input.
Calculate distances between each pair of points
Determine the pair of points with the smallest distance
Print point indices.

Utilizes methods:
 
inputArray - no parameters, returns a 1D matrix of doubles, used to package coordinates of each point
distance - Accepts 6 double parameters, the x, y, and z coordinates of two points.  Calculates distance between two points in 3D space.  Outputs distance value as double
closestPoints - Accepts 2D matrix.  Works down the rows of the matrix, starting by calculating the distance between the first and second points, and ends at the distance calculation for the second to last and last points.  shortestDistance value is updated as necessary.
displayClosestPoint - displays coordinates of point indices.
  
Tests methods:

inputArray
Verify input values are correctly stored in array.
Verify array length is always 3 for 3 dimensional space.

distance
Verify correct distance is calculated.
Verify distance of duplicate points is 0.

closestPoints
Verify only first instance is accepted if multiple points are equidistant for the shortest distance
Verify first and last values can be correctly determined as closest
Verify nonfirst and nonlast values can be correctly determined as closest
Verify method works on different size matrices. (3x3 and 5x3)

displayClosestPoint()
Verify input values are printed.

  
   
  
  
