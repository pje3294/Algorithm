package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class Backjoon1181 {
	public static void main(String[] args) {

		// ���ĺ� �ҹ��ڷ� �̷���� N���� �ܾ ������ �Ʒ��� ���� ���ǿ� ���� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// 1. ���̰� ª�� �ͺ���
		// 2. ���̰� ������ ���� ������

		// ù° �ٿ� �ܾ��� ���� N�� �־�����. (1 �� N �� 20,000) ��° �ٺ��� N���� �ٿ� ���� ���ĺ� �ҹ��ڷ� �̷���� �ܾ ��
		// �ٿ� �ϳ��� �־�����. �־����� ���ڿ��� ���̴� 50�� ���� �ʴ´�.
		// ���ǿ� ���� �����Ͽ� �ܾ���� ����Ѵ�. ��, ���� �ܾ ���� �� �Էµ� ��쿡�� �� ������ ����Ѵ�.

		Scanner sc = new Scanner(System.in);

		System.out.println("N�� �Է����ּ���. ");
		int num = sc.nextInt();

		// �ߺ��� ���ֱ� ���� set ���
		HashSet<String> words = new HashSet<String>();

		for (int i = 0; i < num; i++) {
			words.add(sc.next());
		}

		// ���� ������� �����ؾ������� List�� ��ȯ == ������ �ʿ��ϴ�
		ArrayList<String> datas = new ArrayList<String>(words);

		// ���̿� ���� ����
		// Comparator �������̽� ���
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
