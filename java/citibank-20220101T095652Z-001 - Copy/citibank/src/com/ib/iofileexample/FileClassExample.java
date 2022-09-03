package com.ib.iofileexample;

import java.io.File;
import java.io.IOException;

public class FileClassExample {

	public static void main(String[] args) throws IOException {

		File file = new File("f://c.txt");

		System.out.println((file.getAbsolutePath()));

		System.out.println((file.isDirectory()));

		File file1 = new File("f://a");

		System.out.println((file1.getAbsolutePath()));

		System.out.println((file1.isDirectory()));

		File file2 = new File("f://c166.txt");
		if (!file2.exists()) {
			file2.createNewFile();
			System.out.println("File  name dose exist......");

		} else {
			System.out.println("File  name already exist......");
		}

	}

}
