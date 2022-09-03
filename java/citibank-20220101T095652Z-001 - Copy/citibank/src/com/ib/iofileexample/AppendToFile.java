package com.ib.iofileexample;

import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {

	public static void main(String[] args) {
		FileWriter myWriter = null;
		try {
			myWriter = new FileWriter("f://c.txt", true);
			myWriter.write("2341456,02/12/2021,5000,credit");
			myWriter.write("\n234156,02/12/2021,5000,credit");
			myWriter.write("\n237456,02/12/2021,5000,credit");
			myWriter.write("\n23t456,02/12/2021,5000,credit");
			System.out.println("Wrote to the file successfully...");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (myWriter != null) {

				try {
					myWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}


	}

}


/*
Scanner txtscan = new Scanner(new File("filename.txt"));

while(txtscan.hasNextLine()){
    String str = txtscan.nextLine();
    if(str.indexOf("word") != -1){
        System.out.println("EXISTS");
    }
}

*/