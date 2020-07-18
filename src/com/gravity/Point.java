package com.gravity;

import java.util.Arrays;

public class Point {

    /**
     * This class represents a point (-a line-) from the given input Holds a
     * line index number, and the point's coordinates
     */

    private int index;
    private Double[] coordinates;

    public Point(int index, Double[] coordinates) {
        this.index = index;
        this.coordinates = coordinates;
    }

    public int getIndex() {
        return this.index;
    }

    public Double[] getCoordinates() {
        return this.coordinates;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setCoordinates(Double[] coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Double[] temp = getCoordinates();
        sb.append(getIndex()+1).append(":");
        for (Double coords : temp) {
            sb.append(coords).append("\t");
        }
        sb.append(System.lineSeparator());
        return sb.toString();
    }
}
