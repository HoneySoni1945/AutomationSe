package com.vodafone.basics;

import java.util.ArrayList;
import java.util.HashMap;

public class InputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello");

float a= 1.444444444444444f;
System.out.print("world" +a);

String k =" Hello 2";
System.out.println(k.equals("hello")); 
String b = k.substring(2);
System.out.println(k.compareTo("Honey"));
System.out.println(b);
System.out.println(k.toLowerCase());
System.out.println(k.compareToIgnoreCase("hello 2"));

		int[] arr={1,2,3,4,5,6,7,8};
		char[] ch={'a','f','g'};
		System.out.println(arr[3]);
		ArrayList<Integer> z = new ArrayList<Integer>();
		z.add(1);
		z.add(2);
		z.add(3);
		z.remove(2);
		System.out.println(z.get(1));
		int[] u =new int[10];
		u[0]=1;
		u[1]=2;
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"one");
				
		}

	}


