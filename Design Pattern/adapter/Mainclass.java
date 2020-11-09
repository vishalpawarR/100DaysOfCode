package com.jspiders.designpattern.adapter;

import java.util.ArrayList;

public class Mainclass {

	public static void main(String[] args) {
		int a = 100;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(a);
		Integer in = list.get(0);
		System.out.println(in);

	}

}
