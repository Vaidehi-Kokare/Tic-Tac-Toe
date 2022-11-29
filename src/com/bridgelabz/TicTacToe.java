package com.bridgelabz;

public class TicTacToe {

	static void board() {
		char[] space = new char[10];
		for (int i = 1; i < 10; i++) {
			space[i] = ' ';
		}
	}

	public static void main(String[] args) {
		board();

	}

}
