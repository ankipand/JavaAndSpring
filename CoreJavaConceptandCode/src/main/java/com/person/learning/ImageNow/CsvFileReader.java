package com.person.learning.ImageNow;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CsvFileReader {
/**
 * @param args
 * @throws IOException 
 */
public static void main(String[] args) throws IOException {
	System.out.println("Read the csv file");
	  BufferedReader br = new BufferedReader(new FileReader("D:/study/ImageNow/CSV FIle/imagenowbe-20200602.csv"));
	  System.out.println("br " +br.toString());
	  String header = br.readLine();
	  if (header != null) {
          String[] columns = header.split(";");
          System.out.println(columns.toString());
      }
	  
	 // CSVReader reader = new CSVReader(new FileReader("data.csv"), ',' , '"' , 1);
}
}
