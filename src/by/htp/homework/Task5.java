package by.htp.homework;
import java.util.Scanner;
public class Task5 {
	int max;
	int min;
	int sum;

	public void runTask() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введи из какого количества чисел вы хотите найти максимальное и минимальное");
		int[] maxMin = new int[sc.nextInt()];
		for (int i = 0; i < maxMin.length; i++) {
			System.out.println("Введи число");
			maxMin[i] = sc.nextInt();
		}
		max = maxMin[0];
		min = maxMin[0];
		for (int i = 1; i < maxMin.length; i++) {
			if (maxMin[i] > max) {
				max = maxMin[i];
			}
			if (maxMin[i] < min) {
				min = maxMin[i];
			}
		}
		System.out.println("Максимальное " + max);
		System.out.println("Минимальное " + min);
		sum = max + min;
	}

}
