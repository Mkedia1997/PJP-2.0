package com.sapient;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
public class Output {
	static ArrayList<IndividualSalary> Obj = new ArrayList<IndividualSalary>();
	static ArrayList<Result> Res = new ArrayList<Result>();

	static void splitLine(String line) {
		String[] arr = line.split(",");
		double d = Double.parseDouble(arr[4]);

		Obj.add(new IndividualSalary(arr[0], arr[1], arr[2], arr[3], d));

	}

	private static boolean isCountryPresent(IndividualSalary ob) {
		for (Result x : Res) {
			if (x.getCountry().equals(ob.getCountry()) && x.getGender().equals(ob.getGender())) {
				return true;
			}
				
		}
		return false;
	}

	public static void evaluateSalary() {
		for (IndividualSalary i : Obj) {
			if (isCountryPresent(i)) {
				for (Result y : Res) {
					if (y.getCountry().equals(i.getCountry()) && y.getGender().equals(i.getGender())) {
						y.setAvgSalary(y.getAvgSalary() + i.getSalary());
						y.setCount(y.getCount() +1);
						}
				}
			} else {
				Result rs = new Result(i.getCountry(), i.getGender(), i.getSalary(), 1);
				Res.add(rs);

			}
		}
	}

	static void writeData() throws IOException {
		//Collections.sort(Res);
		FileWriter fw = new FileWriter("C:\\Users\\Mayank\\Downloads\\Output Assign 3 Java.csv");
		BufferedWriter buffer = new BufferedWriter(fw);
		buffer.write("Country" + "," + "Gender" + "," + "AvgSalary\n");

		for (Result i : Res) {
			buffer.write(i.getCountry() + "," + i.getGender() + "," + i.getAvgSalary()/i.getCount()+"\n");
		}

		buffer.close();
	}

}
