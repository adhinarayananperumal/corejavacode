package com.ib.iofileexample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingtoFileUsingCharacterStream {

	public static void main(String[] args) {
		FileWriter myWriter = null;
		BufferedWriter buffer = null;
		try {
			
			myWriter = new FileWriter("f://tra.txt");
			buffer = new BufferedWriter(myWriter);
			
			buffer.write("2341456,02/12/2021,5000,credit1111111");
			buffer.write("\n2341456,02/12/2021,5000,222222222222");
			buffer.write("\n2341456,02/12/2021,5000,33333333333333333");

			System.out.println("Wrote to the file successfully...");
			
			
		} catch (IOException e) {
			System.out.println("wrong file path..so writing to file failed...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("generl error.....");

		} finally {
			if (buffer != null) {
				try {
					buffer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}

	}

}
