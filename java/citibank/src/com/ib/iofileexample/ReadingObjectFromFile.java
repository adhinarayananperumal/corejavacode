package com.ib.iofileexample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadingObjectFromFile {

	public static void main(String args[]) throws IOException {

		FileInputStream file = null;
		ObjectInputStream input = null;

		EmployeePojo employeePojo;

		try {

			file = new FileInputStream("tcsfile.txt");
			input = new ObjectInputStream(file);

			// Writing to the file using ObjectOutputStream
			employeePojo = (EmployeePojo) input.readObject();
			System.out.println("Successfully read object.......from  file");

			System.out.println(employeePojo.getEmpName());
			System.out.println(employeePojo.getEmpId());
			System.out.println(employeePojo.getAge());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (input != null) {
				input.close();
			}
		}
	}
}
