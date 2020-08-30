package com.sapient;

public class Result implements Comparable<Object>{
	private String Country;
	private String Gender;
	private double AvgSalary;
	private int Count;
	Result(String Country,String Gender,double AvgSalary,int Count){
		this.Country = Country;
		this.Gender = Gender;
		this.AvgSalary = AvgSalary;
		this.Count=Count;
	}
	public int getCount() {
		return Count;
	}
	public void setCount(int Count) {
		this.Count = Count;
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
	public double getAvgSalary() {
		return AvgSalary;
	}
	public void setAvgSalary(double avgSalary) {
		AvgSalary = avgSalary;
	}

	
	  @Override public int compareTo(Object other) { Result x = (Result) other; int
	  country_comp = (this.Country).compareTo(x.getCountry()); int gender_comp =
	  (this.Gender).compareTo(x.getGender());
	  
	  if (country_comp == 0) { if (gender_comp == 0) { return 0; } else if
	  (gender_comp > 0) { return 1; } else { return -1; } } else if (country_comp >
	  0) { return 1; } else { return -1; } }
	 
	
	/*
	 * public static Comparator<Result> Cou = new Comparator<Result>(){ public int
	 * compare(Result r1, Result r2) { String country1 = r1.getCountry(); String
	 * country2 = r2.getCountry();
	 * 
	 * if( country1.equals(country2)) { return 0; }else return 1;
	 * 
	 * }
	 * 
	 * };
	 */
}
