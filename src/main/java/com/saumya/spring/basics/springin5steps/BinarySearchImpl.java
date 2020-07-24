package com.saumya.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgorithm sa;
	
	//constructor injection
	/*public BinarySearchImpl(SortAlgorithm sa) {
		super();
		this.sa = sa;
	} */
	
	//setter injection

//	public void setSa(SortAlgorithm sa) {
//		this.sa = sa;
//	}


	public int binarySearch(int[] nums, int n) 
	{		
		int[] sortedNumbers = sa.sort(new int[] {12,3,4});
		System.out.println(sa);
		
		return 0;
	}

	

}
