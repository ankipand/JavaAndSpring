package com.person.learning.Exception;

import java.io.FileOutputStream;

public class TryWithResources {
	public static void main(String[] args) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(
					"C:/Users/gasingh/Desktop/BackEnd/FileReading.txt");
			String msg = "Welcome to javaTpoint!";
			byte byteArray[] = msg.getBytes(); // converting string into byte array
			fileOutputStream.write(byteArray);
			System.out.println("Message written to file successfuly!");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
	}
}
