package com.gen.findmax.utils;

public class FindMax {
	public static Integer findMaxInt(Integer x, Integer y, Integer z) {
		int max = x;
		if(y.compareTo(max) > 0)
			max = y;
		if(z.compareTo(max) > 0)
			max = z;
		return max;
	}
	
	public static Double findMaxDouble(Double x, Double y, Double z) {
		Double max = x;
		if(y.compareTo(max) > 0)
			max = y;
		if(z.compareTo(max) > 0)
			max = z;
		return max;
	}
	public static String findMaxString(String x, String y, String z) {
		String max = x;
		if(y.compareTo(max) > 0)
			max = y;
		if(z.compareTo(max) > 0)
			max = z;
		return max;
	}
	
}
