package com.yash.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DynamicArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :: ");
        int size = sc.nextInt();
        String Array[] = new String[size];
        System.out.println("Enter elements of the array (Strings) :: ");
        for (int i = 0; i < size; i++) {
            Array[i] = sc.next();
        }
        System.out.println(Arrays.toString(Array));
        ArrayList<String> myList = new ArrayList<String>(Arrays.asList(Array));
        System.out.println("Enter the element that is to be added:");
        String element = sc.next();
        myList.add(element);
        Array = myList.toArray(Array);
        System.out.println(Arrays.toString(Array));
    }		
}