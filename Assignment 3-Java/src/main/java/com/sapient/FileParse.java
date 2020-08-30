package com.sapient;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public  class FileParse {

	static void read(String FilePath) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(FilePath);
			br = new BufferedReader(fr);
			String line;

			while ((line = br.readLine()) != null) {
				Output.splitLine(line);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
