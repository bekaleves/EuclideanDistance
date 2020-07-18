package com.gravity;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PointWriter {

	/**
	 * Writing data into output.txt
	 * It doesn't use rounding, nor formatting
	 * @param result result of the shortest distance calculation
	 */
	public void writeOut(ShortestDistSearchResult result) throws IOException {

	    StringBuilder sb = new StringBuilder();
	    sb.append(result.getPointOne());
	    sb.append(result.getPointTwo());
		
		FileWriter writer = null;
		BufferedWriter bw = null;
		try {
			writer = new FileWriter(new File("output.txt"));
			bw = new BufferedWriter(writer);
			bw.write(sb.toString());
			bw.flush();
		} finally {
			try {
				if (null != writer) {
					writer.close();
				}
				if (null != bw) {
					bw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	

}
