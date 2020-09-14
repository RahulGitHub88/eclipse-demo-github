package com.in28minutes.springboot;

//Java implementation of the above approach 
import java.util.*; 

class GFG 
{ 
	
	// Function to find the missing elements 
	static Vector missing_elements(Vector vec) 
	{ 
	
		// Vector to store the list 
		// of missing elements 
		Vector mis = new Vector(); 
	
		// For every given element 
		for (int i = 0; i < vec.size(); i++) 
		{ 
	
			// Find its index 
			int temp = Math.abs((int)vec.get(i)) - 1; 
	
			// Update the element at the found index 
			if ((int)vec.get(temp) > 0) 
				vec.set(temp,-(int)vec.get(temp)); 
			else
				vec.set(temp,vec.get(temp)); 
		} 
		for (int i = 0; i < vec.size(); i++) 
		{ 
			// Current element was not present 
			// in the original vector 
			if ((int)vec.get(i) > 0) 
				mis.add(i + 1); 
		} 
		return mis; 
	} 
	
	// Driver code 
	public static void main(String args[]) 
	{ 
		Vector vec = new Vector(); 
		vec.add(3); 
		vec.add(3); 
		vec.add(2); 
		vec.add(1); 
		vec.add(5); 
		vec.add(6); 
		vec.add(5); 
		
	//	Collections.sort(vec);
		System.out.println(vec.toString());
		
		/*for(int i=0;i<vec.size();i++) {
			if((int)vec.get(i) != i+1  && (int)vec.get(i) != (int)vec.get(i+1)) {
				System.out.println(i+1);
			}
		}*/
		
		// Vector to store the returned 
		// list of missing elements 
		Vector miss_ele = missing_elements(vec); 
	
		// Print the list of elements 
		for (int i = 0; i < miss_ele.size(); i++) 
			System.out.print(miss_ele.get(i) + " "); 
	} 
} 

//This code is contributed by AnkitRai01 
