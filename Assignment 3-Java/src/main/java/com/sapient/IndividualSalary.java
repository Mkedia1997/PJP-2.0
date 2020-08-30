package com.sapient;

public class IndividualSalary{
	String City;
	String Country;
	String Gender;
	String Currency;
	double Salary;

	IndividualSalary(String city, String country, String gender, String currency, double salary) {

		this.City = city;
		if (country.equals(""))
			this.Country = city;
		else
			this.Country = country;
		this.Gender = gender;
		this.Currency = currency;
		this.Salary = setConvertedSalary(salary);
	}

	public String getCity() {
		return City;
	}

	public double setConvertedSalary(double salary) {
		String cur = this.Currency;
		if (cur.equals("GBP"))
			return salary / 0.67;
		else if (cur.equals("INR"))
			return salary / 66.0;
		else if (cur.equals("SGD"))
			return salary / 1.5;
		else if(cur.equals("HKD"))
			return salary / 8.0;
		else
			return salary;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getCurrency() {
		return Currency;
	}

	public void setCurrency(String currency) {
		Currency = currency;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}
	
	
	
}
