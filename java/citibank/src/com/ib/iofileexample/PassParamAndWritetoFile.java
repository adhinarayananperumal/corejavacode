package com.ib.iofileexample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PassParamAndWritetoFile {

	 BufferedWriter buffer = null;

	PassParamAndWritetoFile(BufferedWriter buffer, FileWriter myWriter) {
		this.buffer = buffer;
	}

	 void writeToFile(String val) {
		try {
			buffer.write(val);
		} catch (IOException e) {
			System.out.println("File writing exception e...");
		}
	}

}
