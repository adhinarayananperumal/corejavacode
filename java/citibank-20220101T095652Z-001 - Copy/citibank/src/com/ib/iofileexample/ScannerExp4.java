package com.ib.iofileexample;

import java.io.IOException;
import java.util.Scanner;

public class ScannerExp4 {

	public static void main(String args[]) throws IOException {

		Scanner in = null;

		try {
			in = new Scanner(System.in);
			System.out.print("Enter your name: ");
			String name = in.nextLine();

			while (!name.equals("quit")) {
				System.out.println("Name is: " + name);
				System.out.print("Enter your name: ");
				name = in.nextLine();
			}

		} finally {
			if (in != null) {
				in.close();
			}

		}

	}
}