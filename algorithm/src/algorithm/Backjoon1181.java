package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class Backjoon1181 {
	public static void main(String[] args) {

		// 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
		// 1. 길이가 짧은 것부터
		// 2. 길이가 같으면 사전 순으로

		// 첫째 줄에 단어의 개수 N이 주어진다. (1 ≤ N ≤ 20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한
		// 줄에 하나씩 주어진다. 주어지는 문자열의 길이는 50을 넘지 않는다.
		// 조건에 따라 정렬하여 단어들을 출력한다. 단, 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력한다.

		Scanner sc = new Scanner(System.in);

		System.out.println("N을 입력해주세요. ");
		int num = sc.nextInt();

		// 중복을 없애기 위해 set 사용
		HashSet<String> words = new HashSet<String>();

		for (int i = 0; i < num; i++) {
			words.add(sc.next());
		}

		// 길이 순서대로 나열해야함으로 List로 변환 == 순서가 필요하다
		ArrayList<String> datas = new ArrayList<String>(words);

		// 길이에 따라 나열
		// Comparator 인터페이스 사용
		Collections.sort(datas, new Comparator<String>() {

			@Override
			public int compare(String w1, String w2) {
				if (w1.length() > w2.length()) {
					return 1;
				} else if (w1.length() < w2.length()) {
					return -1;
				} else
					return w1.compareTo(w2);

			}

		});

		for (String v : datas) {
			System.out.print(v + " ");
		}

	}
}
