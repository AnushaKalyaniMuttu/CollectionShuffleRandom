package com.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test {
	/*
	 * Collections.shuffle(list,random)
	 * shuffles the list elements 
	 */

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		Random rd=new Random();
	Collections.shuffle(list,rd);
	list.forEach(System.out::print);
	      	}
		
	}
