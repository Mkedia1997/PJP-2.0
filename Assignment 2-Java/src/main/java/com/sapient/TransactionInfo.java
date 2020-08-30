package com.sapient;

public class TransactionInfo {
	public static int normal(String type,char priority) {
		if(priority == 'Y') {
			return 500;
		}
		else {
			if(type.equals("Sell")) {
				return 100;
			}
			else if(type.equals("Withdraw")) {
				return 100;
			}else if(type.equals("Buy")) {
				return 50;
			}
			else
				return 50;
		}
	}
	public static int intra(String type) {
		if(type.equals("Sell")) {
			return 10;
		}
		else 
			return 10;
	}
}
