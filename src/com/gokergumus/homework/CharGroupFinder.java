package com.gokergumus.homework;

public class CharGroupFinder {

	public static void main(String[] args) {

		char[] source = { 'a', 'b', 'c', 'g', 'o', 'k', 'e', 'r', 'd', 'e',
				'f', 'g', 'h', 'g', 'o', 'k', 'e', 'r', 'i', 'j' };

		int gokerCounter = 0;

		for (int i = 0; i < source.length; i++) {
			if (source[i] == 'g' && source[i + 1] == 'o'
					&& source[i + 2] == 'k' && source[i + 3] == 'e'
					&& source[i + 4] == 'r') {
				gokerCounter++;
			}
		}

		char[] target = new char[source.length - 5 * gokerCounter];

		int k = 0;
		
		for (int j = 0; j < source.length; j++) {
			if (source[j] == 'g' && source[j + 1] == 'o'
					&& source[j + 2] == 'k' && source[j + 3] == 'e'
					&& source[j + 4] == 'r') {
				j = j + 5;
			}
			
			target[k] = source[j];
			k++;
		}
		
		System.out.println("target array is:" + target);
		System.out.println(target);
		System.out.println(target[5]);
	}
}
