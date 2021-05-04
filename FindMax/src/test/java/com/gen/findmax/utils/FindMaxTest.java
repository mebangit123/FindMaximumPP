package com.gen.findmax.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindMaxTest {
@Test
public void returnMaxAtFirstPos() {
	int max = FindMax.findMaxInt(10, 9, 4);
	assertEquals(10, max);
}
@Test
public void returnMaxAtSecondPos() {
	int max = FindMax.findMaxInt(8, 9, 4);
	assertEquals(9, max);
}
@Test
public void returnMaxAtThirdPos() {
	int max = FindMax.findMaxInt(8, 9, 12);
	assertEquals(12, max);
}
}
