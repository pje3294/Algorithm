package algorithm;

import java.util.Scanner;

public class Backjoon2750 {
	public static void main(String[] args) {

		// N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// ù° �ٺ��� N���� �ٿ� ������������ ������ ����� �� �ٿ� �ϳ��� ����Ѵ�.

		Scanner sc = new Scanner(System.in);

		System.out.println("N���� ���� �Է��ϼ���.");

		int num = sc.nextInt();

		int[] datas = new int[num];

		for (int i = 0; i < datas.length; i++) {
			datas[i] = (int) (Math.random() * 10 + 1); // 1~10 ���� ���� ����
			System.out.println("datas: " + datas[i]);
		}

		// ���� ���� ���
		for (int i = 0; i < datas.length - 1; i++) {
			for (int j = i; j < datas.length; j++) {
				if (datas[i] > datas[j]) { // 5 3
					int tmp = datas[i]; // tmp = 3
					datas[i] = datas[j]; // 3 3
					datas[j] = tmp; // 3 5
				}
			}

		}

		// ���� ���
		for (int v : datas) {
			System.out.print(v + " ");
		}

	}
}
