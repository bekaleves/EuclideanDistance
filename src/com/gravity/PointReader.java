package com.gravity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PointReader {
    
    private static final String SEPARATOR = "\t";
    private File file;
    
    public PointReader(File f) {
        this.file = f;
    }
    
    /**
     * Reading the input file line by line as String[]'s
     * parsing those lines into Double[]'s as coordinates
     * Adding these lines and an index number to a List<Point>
     * @return returns with a List<Point>
     * @throws IOException 
     */
    public List<Point> readFile() throws IOException {
        List<Point> readInFile = new ArrayList<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            String line = null;
			int index = 0;
            while ((line = br.readLine()) != null) {
                String[] numbers;
                numbers = line.split(SEPARATOR);
                Double[] temp = new Double[numbers.length];
                for (int i = 0; i < numbers.length; i++) { 
                    temp[i] = Double.parseDouble(numbers[i]);
                }
				
                readInFile.add(new Point(index, temp));
				index++;
            }

        } finally {
            if (br != null) {
                try {
                    br.close(); 
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return readInFile;
    }
}
