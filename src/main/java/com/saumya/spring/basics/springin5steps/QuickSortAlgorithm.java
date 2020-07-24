package com.saumya.spring.basics.springin5steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm{
	
	public int[] sort(int[] nums) 
	{
		// Logic for Quick Sort
		return nums;
	}

}
