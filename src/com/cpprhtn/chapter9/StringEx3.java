package com.cpprhtn.chapter9;

class StringEx3 {
	public static void main(String[] args) {
		// char[] cArr = {};
		char[] cArr = new char[0];
		
		// String s = new String("");
		String s = new String(cArr);

		System.out.println("cArr.length="+cArr.length);
		System.out.println("@@@"+s+"@@@");
	}
}
