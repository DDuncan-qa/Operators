package com.qa.main;

public class Runners {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 3;
		int num2 = 4;
		int result = num + num2;
		System.out.println(result);
		
		int num3 = 5;
		int num4 = 1;
		int result1 = num3 * num4;
		System.out.println(result1);
		
		int num5 = 8;
		int num6 = 2;
		int result2 = num5 - num6;
		System.out.println(result2);
		
		int num7 = 12;
		int num8 = 3;
		int result3 = num7 / num8;
		System.out.println(result3);
		
		int num9 = 12;
		int num10 = 10;
		double result4 = (double) num9 / num10;
		System.out.println(result4);
	
		// Double allows you to divide numbers which are not fully divisible with each other
		
		
		
		
		// A person takes 3 exams in college, Physics, Chemistry, and Biology, each exam has a maximum of 150 marks. When all the exam marks have been added together, we can find the overall percentage that the person has got by multiplying their score by 100 and then dividing by 450.
		
		int biology = 0;
		int chemistry = 0;
		int physics = 0;
		 
		
		
		int maxTotal = 400;
		double percentage = (double) (biology + chemistry + physics ) / maxTotal; 
	    
		System.out.println(percentage * 100 + "%");
	
		int biology1 = 100;
		int chemistry1 = 100;
		int physics1 = 100;
		 
		
		
		int maxTotal1 = 150;
		double percentage1 = (double) (biology1) / maxTotal1; 
		System.out.println(percentage1 * 100 + "%");
		
		double percentage2 = (double) (chemistry1) / maxTotal1; 
		System.out.println(percentage2 * 100 + "%");
		
		double percentage3 = (double) (physics1) / maxTotal1; 
		System.out.println(percentage3 * 100 + "%");
	    
	
	
	}

}
