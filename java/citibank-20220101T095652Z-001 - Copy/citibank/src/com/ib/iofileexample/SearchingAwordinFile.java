package com.ib.iofileexample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class SearchingAwordinFile {
	
	
	private static void searchStringFromFile() {
		 Path path = FileSystems.getDefault()
		  .getPath("", "f:\\c.txt");
		 String searchTerm = "credit";

		 try(Stream <String> streamOfLines = Files.lines(path)) {
		  Optional <String> line = streamOfLines.filter(l -> 
		                           l.contains(searchTerm)) .findFirst();
		  if(line.isPresent()){
		   System.out.println(line.get());
		  }else
		   System.out.println("Not found");
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		}

	public static void main(String[] args) {
		FileReader myWriter = null;
		
		searchStringFromFile();

		try {
			Scanner txtscan = new Scanner(new File("f:\\c.txt"));

			while(txtscan.hasNextLine()){
			    String str = txtscan.nextLine();
			    if(str.indexOf("500") != -1){
			        System.out.println("EXISTS");
			        System.out.println(str.indexOf("credit"));
			       // break;
			    }else {
			        System.out.println("searching word not exist.......");

			    }
			}

		} catch (FileNotFoundException f) {
			System.out.println("Wrong file name...");
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
