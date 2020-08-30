package com.sapient;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.util.ArrayList;
public class FileHandler {
	static void read(String filepath){
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(filepath);
			br = new BufferedReader(fr);
			String line;
			while((line = br.readLine())!= null) {
			//System.out.println(line);
				ClassManager.addTransaction(line);
			}
			br.close();
		}catch(FileNotFoundException e) {
			e.getStackTrace();
		}catch(IOException e) {
			e.getStackTrace();
		}		
	}
	

}
