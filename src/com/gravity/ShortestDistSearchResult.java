package com.gravity;

import com.gravity.Point;

public class ShortestDistSearchResult {

 	private Point pointOne;
	private Point pointTwo;

    /**
     * A class for the result points
     * the constructor demands two Point objects
     * @param pointOne First point of the nearest pair
     * @param pointTwo Second point of the nearest pair
     */
    public ShortestDistSearchResult(Point pointOne, Point pointTwo) {
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
    }
    
    public Point getPointOne() {
        return pointOne;
    }

    public Point getPointTwo() {
        return pointTwo;
    }
}
