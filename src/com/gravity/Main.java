package com.gravity;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        try {
            if (args.length != 1) {
                System.out.println(
                        "Please type existing input file in first parameter, eg.: \"java -jar EuclideanDistanceCalculator.jar input\"");
                return;
            }
            File file = new File(args[0]);
            if (!file.isFile()) {
                System.err.println("Input file doesn't exist!");
                return;
            }
            PointReader readIn = new PointReader(new File(args[0]));
            List<Point> points = readIn.readFile();
            ShortestDistanceCalculator calc = new ShortestDistanceCalculator();
            ShortestDistSearchResult result = calc.calculateDistance(points);
            PointWriter writer = new PointWriter();
            writer.writeOut(result);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
