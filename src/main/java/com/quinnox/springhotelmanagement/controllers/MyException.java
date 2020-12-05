package com.quinnox.springhotelmanagement.controllers;

public class MyException {
	
	public static void divide(){
		int a = 10;
		int b= 0;
		int c=a/b;
	}
	
	public static void main(String args[])
	{
		try{
		     divide();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
