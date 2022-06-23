package com.cg.labs.lab6;

	import java.util.Collections;
	import java.util.List;
	import java.util.ArrayList;

	public class Lab6Exp5{
	      
	       public int getSecondSmallest(int[] arr){
	              List<Integer> intList = new ArrayList<Integer>();
	              for(int i: arr){
	                     intList.add(i);
	              }
	              Collections.sort(intList);
	              return intList.get(1);
	       }
	       public static void main(String[] args) {
	    	   Lab6Exp5 p = new  Lab6Exp5();
	              int arr[] = {43,54,65,76,32,76,87,43,66,7,32,54,43};
	              int i = p.getSecondSmallest(arr);
	             System.out.println("The second smallest element in array is: ");
	              System.out.println(i);
	       }

	}
