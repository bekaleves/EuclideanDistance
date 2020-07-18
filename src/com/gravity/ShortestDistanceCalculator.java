package com.gravity;

import java.util.List;

import com.gravity.Point;

public class ShortestDistanceCalculator {
    
    /**
     * Calculates the shortest distance between the two distinct points,
     * then selects the minimal value of the distances
     * Running time is O(n*(n/2)*n)
     * @param points result of readIn.readFile from PointReader
     * @return returns a ShortestDistSearchResult with two Point in it
     */
    public ShortestDistSearchResult calculateDistance(List<Point> points) {
		
        double distance;
        double smallestSum = Double.MAX_VALUE;
        double shortestDist = Double.MAX_VALUE;
        Point pointOne = null;
        Point pointTwo = null;
        
        for (int i = 0; i < points.size(); i++) {
            double sum = 0.0;
            Double[] temp1 = points.get(i).getCoordinates();
            for (int j = i + 1; j < points.size(); j++) {
                sum = 0.0;
				Double[] temp2 = points.get(j).getCoordinates();
                for (int k = 0; k < temp1.length; k++) {
                    sum += Math.pow(temp1[k] - temp2[k], 2);
                    if (sum > smallestSum) {
                        break;
                    } 
                }
                
				distance = Math.sqrt(sum);     
				
                if (distance < shortestDist) {                   
                    shortestDist = distance;
                    smallestSum = sum;
					
					pointOne = points.get(i);
                    pointTwo = points.get(j);
                }
            }
        }
        return new ShortestDistSearchResult(pointOne, pointTwo);
    }

}
