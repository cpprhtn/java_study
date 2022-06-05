package com.cpprhtn.chapter11;

class AsciiPrint{
	public static void main(String[] args) {
		char ch = ' ';
		for(int i=0; i < 95; i++)
			System.out.print(ch++);
	}
}
