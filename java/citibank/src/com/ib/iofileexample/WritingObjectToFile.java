package com.ib.iofileexample;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WritingObjectToFile {

	public static void main(String args[]) throws IOException {

		FileOutputStream file = null;
		ObjectOutputStream output = null;

		EmployeePojo employeePojo = new EmployeePojo();
		employeePojo.setEmpName("Praveen");
		employeePojo.setEmpId("tcs101");
		employeePojo.setAge(24);

		try {

			file = new FileOutputStream("tcsfile.txt");
			output = new ObjectOutputStream(file);

			// Writing to the file using ObjectOutputStream
			output.writeObject(employeePojo);
			System.out.println("Successfully wrote object.......to file");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (output != null) {
				output.close();
			}
		}
	}
}
