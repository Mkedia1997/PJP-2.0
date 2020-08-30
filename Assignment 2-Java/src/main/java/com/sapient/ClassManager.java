package com.sapient;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassManager {

	static ArrayList<Client> Cli = new ArrayList<Client>();
	static ArrayList<Transaction> Tr = new ArrayList<Transaction>();
	static HashMap<String, Client> map = new HashMap<String, Client>();

	static void addTransaction(String line) {
		String[] arr = line.split(",");
		//System.out.println(arr[1] + arr[2]+arr[3]+ arr[4]+ arr[5]+ Integer.parseInt(arr[6])+
		//		arr[7].charAt(0));
		Transaction t = new Transaction(arr[1], arr[2], arr[3], arr[4], arr[5], Integer.parseInt(arr[6]),
				arr[7].charAt(0));
		Tr.add(t);
		System.out.println(t.getExternalTransactionId());
		if (map.containsKey(arr[2])) {
			(map.get(arr[2])).addTransaction(t);
			System.out.println("ClientPresent");
		} else {
			Client cl = new Client(arr[2], arr[3]);
			Cli.add(cl);
			map.put(arr[2], cl);
			cl.addTransaction(t);
			System.out.println(arr[2]+" "+arr[3]);
			System.out.println("ClientnotPresent");
		}
	}
	static void getTransactionClientWise() {
		for(Client x: Cli) {
			ArrayList<Transaction> cliTr = x.getCliTransaction();
			for(Transaction y:cliTr) {
				System.out.println(y.getClientId() + " " + y.getTransactionDate()+ " "+ y.getMarketValue());;
			}
		}
	}
	static void ProcessClientFees() {
		
	}
}
