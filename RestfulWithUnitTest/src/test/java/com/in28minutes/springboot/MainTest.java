package com.in28minutes.springboot;

import java.util.Arrays;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr  = new String[5];
		arr[0] = "A";
		arr[1] = "B";
		arr[2] = "C";
		arr[3] = "D";
		arr[4] = "F";
		
		arr[2] = null;
		
		System.out.println(Arrays.toString(arr));
		for(String a : arr) {
			System.out.println(a);
		}

	}

}
