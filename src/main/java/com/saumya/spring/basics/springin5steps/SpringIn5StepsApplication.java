package com.saumya.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {
	
	// what are beans
	// what are dependecies of the beans
	// where to find beans

	public static void main(String[] args) {
		
//		BinarySearchImpl b=new BinarySearchImpl(new QuickSortAlgorithm());
//		int result = b.binarySearch(new int[] {1,2,3},0);
//		System.out.println(result);
		
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl b = applicationContext.getBean(BinarySearchImpl.class);
		int result = b.binarySearch(new int[] {1,2,3},0);
		System.out.println(result);
	}

}
