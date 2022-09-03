package com.ib.iofileexample;

import java.io.BufferedOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DatatSreamExample {

	static final String dataFile = "f:\\invoicedata";
	static final double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
	static final int[] units = { 12, 8, 13, 29, 50 };
	static final String[] descs = { "Java T-shirt", "Java Mug", "Duke Juggling Dolls", "Java Pin", "Java Key Chain" };
	static DataOutput out=null;
	static BufferedOutputStream br=null;
	public static void main(String[] args) {
		
		try {
			
			br=new BufferedOutputStream(
		              new FileOutputStream(dataFile));
			
			out = new DataOutputStream(br);
			
			for (int i = 0; i < prices.length; i ++) {
			    out.writeDouble(prices[i]);
			    out.writeInt(units[i]);
			    out.writeUTF(descs[i]);
			}
			System.out.println("End");
		}catch(Exception e) {
			System.out.println("Error....");
		}
		finally {
			if(br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
