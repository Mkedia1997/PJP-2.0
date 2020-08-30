package com.sapient;

import java.io.IOException;

public class Runner {

	public static void main(String[] args) throws IOException {

		String FilePath = "C:\\Users\\Mayank\\Desktop\\sample.csv";
		FileParse.read(FilePath);
		Output.evaluateSalary();
		Output.writeData();
	}

}
