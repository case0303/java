package day21.stream;

import java.util.Arrays;
import java.util.OptionalInt;

public class StreamOptional {

	public static void main(String[] args) {
		int[] arr = new int[100];
		for (int i=0; i<100; i++ ) {
			arr[i] = i+1;
		}
		
		long count = Arrays.stream(arr).count();
		System.out.println();
		
		
		int sum = Arrays.stream(arr).sum();
		System.out.println();
		
		
		
	}

}
