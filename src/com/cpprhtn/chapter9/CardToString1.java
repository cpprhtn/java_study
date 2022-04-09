package com.cpprhtn.chapter9;

class CardToString {
	public static void main(String[] args) {
		Card1 c1 = new Card1();
		Card1 c2 = new Card1();

		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}


class Card1 {
	String kind;
	int number;

	Card1() {
		this("SPADE", 1);
	}

	Card1(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
}