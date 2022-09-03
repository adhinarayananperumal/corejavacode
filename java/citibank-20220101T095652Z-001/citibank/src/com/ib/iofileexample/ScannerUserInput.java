package com.ib.iofileexample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerUserInput {

	static FileWriter myWriter = null;
	static BufferedWriter buffer = null;

	public static void main(String args[]) throws IOException {
		Scanner in = null;
		try {
			myWriter = new FileWriter("f://tcs1.txt");
			buffer = new BufferedWriter(myWriter);
			PassParamAndWritetoFile writetoFile = new PassParamAndWritetoFile(buffer, myWriter);

			in = new Scanner(System.in);
			System.out.print("Enter your name: ");
			String name = in.nextLine();

			while (!name.equals("quit")) {
				System.out.println("Name is: " + name);
				System.out.print("Enter your name: ");
				writetoFile.writeToFile(name);
				writetoFile.writeToFile("\n");
				name = in.nextLine();
				buffer.flush();
			}
			System.out.println("End..");
		} catch (IOException e) {
			System.out.println("wrong file path..so writing to file failed...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("generl error.....");
			e.printStackTrace();

		} finally {
			if (in != null) {
				in.close();
			}
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