package day13.api.util;

import java.util.Arrays;

public class ArraysEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {75,47,23,56,89};
		System.out.println("원본");
		System.out.println(Arrays.toString(score));
		//배열의 데이터를 오름차순으로 정렬 - soft()
		int[] score2 = Arrays.copyOf(score, score.length);
		Arrays.sort(score2);
		System.out.println();
		System.out.println(Arrays.toString(score2));
		//배열내부대이터의 인덱스를 탐색하는 메서드 binarySearch()
		int index = Arrays.binarySearch(score2, 75);
		
		System.out.println("75가 있는 인덱스 번호 : "+index);
		// 배열의 equals()
		int[] score3 = Arrays.copyOf(score, score.length);
		score3[2] = 140; // 값을 바꿔서 일치하지 않게 만듬
		if(Arrays.equals(score, score3)) {
			System.out.println("배열의 각 항목이 모두 일치함");
		} else {
			System.out.println("배열의 각 항목이 모두 일치하지 않음");
		}
	}

}
