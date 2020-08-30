package com.sapient;

public class Runner {

	public static void main(String[] args) {
		String FilePath="C:\\Users\\Mayank\\Desktop\\Sample Input Week 2 Assign 2 Java.csv";
		FileHandler.read(FilePath);
		ClassManager.getTransactionClientWise();

	}

}
