package com.ib.iofileexample;

import java.io.BufferedInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class DataOutputStreamRead {

	static final String dataFile = "f:\\invoicedata";
	
	static double price;
	static int unit;
	static String desc;
	static double total;
	static BufferedInputStream br=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		br=	new BufferedInputStream(new FileInputStream(dataFile));

			DataInput in = new DataInputStream(br);

			while (true) {
				price = in.readDouble();
				unit = in.readInt();
				desc = in.readUTF();
				System.out.format("You ordered %d" + " units of %s at $%.2f%n", unit, desc, price);
				total += unit * price;
			}

		} catch (EOFException e) {
			//System.out.println("Error....");
			//e.printStackTrace();
		}
		catch (IOException e) {
			System.out.println("Error....");
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
