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
	public static void main(String[] args) {
		System.out.println("Find Maximum Problem Using Generics..");
	}
}
