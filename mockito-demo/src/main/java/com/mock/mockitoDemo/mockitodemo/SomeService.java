package com.mock.mockitoDemo.mockitodemo;

public class SomeService {

	private DataService dataService;
	
	  int findGreatstNum(int[] num) {
		 int[] data = dataService.getAllData();
		 int greatest = Integer.MIN_VALUE;
		 for (int value : data) {
			 if(value>greatest) {
				 greatest = value;
			 }
			
		}
		 return greatest;
	}
}
