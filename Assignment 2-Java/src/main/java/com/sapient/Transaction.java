package com.sapient;

public class Transaction {
	private String externalTransactionId;
	private String clientId;
	private String securityId;
	private String transactionType;
	private String transactionDate;
	private long marketValue;
	private char priorityFlag;
	public Transaction(String externalTransactionId, String clientId, String securityId, String transactionType, String transactionDate, long marketValue,
			char priorityFlag) {
		this.externalTransactionId = externalTransactionId;
		this.clientId = clientId;
		this.securityId = securityId;
		this.transactionType= transactionType;
		this.transactionDate= transactionDate;
		this.marketValue = marketValue;
		this.priorityFlag = priorityFlag;
		
		
	}
	public String getExternalTransactionId() {
		return externalTransactionId;
	}
	public void setExternalTransactionId(String externalTransactionId) {
		this.externalTransactionId = externalTransactionId;
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
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public long getMarketValue() {
		return marketValue;
	}
	public void setMarketValue(long marketValue) {
		this.marketValue = marketValue;
	}
	public char getPriorityFlag() {
		return priorityFlag;
	}
	public void setPriorityFlag(char priorityFlag) {
		this.priorityFlag = priorityFlag;
	}
}
