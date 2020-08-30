package com.sapient;

import java.util.ArrayList;
public class Client {
	private String clientId;
	private String securityId;
	private ArrayList<Transaction> cliTransaction = new ArrayList<Transaction>();
	Client(String clientId, String securityId) {
		this.clientId = clientId;
		this.securityId = securityId;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getSecurityId() {
		return securityId;
	}
	public void setSecurityId(String securityId) {
		this.securityId = securityId;
	}
	public  ArrayList<Transaction> getCliTransaction() {
		return cliTransaction;
	}
	public void addTransaction(Transaction tr) {
		cliTransaction.add(tr);
	}
		
}
