package com.yash.array;

public class vowelsAndConsonants {

	public static void main(String[] args) {

		String str = "abcdefghijklmnopqrstuvwxyz";

		char[] a = str.toCharArray();

		System.out.println("The consonents are");

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u') {
				continue;
			}
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("The vowels are ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u') {
				System.out.print(a[i] + " ");
			}
		}
	}
}
