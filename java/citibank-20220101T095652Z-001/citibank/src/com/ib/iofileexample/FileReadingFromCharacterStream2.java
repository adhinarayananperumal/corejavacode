package com.ib.iofileexample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingFromCharacterStream2 {

	public static void main(String[] args) {

		FileReader myWriter = null;
		BufferedReader br = null;
		try {
			File file = new File("f://tra.txt");

			myWriter = new FileReader(file);

			br = new BufferedReader(myWriter);
			
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}


		} catch (FileNotFoundException f) {
			System.out.println("Wrong file name...");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
