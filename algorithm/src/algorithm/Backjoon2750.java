package algorithm;

import java.util.Scanner;

public class Backjoon2750 {
	public static void main(String[] args) {

		// N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
		// 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.

		Scanner sc = new Scanner(System.in);

		System.out.println("N개의 수를 입력하세요.");

		int num = sc.nextInt();

		int[] datas = new int[num];

		for (int i = 0; i < datas.length; i++) {
			datas[i] = (int) (Math.random() * 10 + 1); // 1~10 랜덤 숫자 넣음
			System.out.println("datas: " + datas[i]);
		}

		// 버블 정렬 사용
		for (int i = 0; i < datas.length - 1; i++) {
			for (int j = i; j < datas.length; j++) {
				if (datas[i] > datas[j]) { // 5 3
					int tmp = datas[i]; // tmp = 3
					datas[i] = datas[j]; // 3 3
					datas[j] = tmp; // 3 5
				}
			}

		}

		// 최종 결과
		for (int v : datas) {
			System.out.print(v + " ");
		}

	}
}
