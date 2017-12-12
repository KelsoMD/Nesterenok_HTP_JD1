package by.htp.homework;
import java.util.Scanner;

public class Task6 {
	public void runTask() {
		System.out.println("Тут начинается задание №5");
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число от 0 до 9"); // task6
		while (true) {
			int m = sc.nextInt();
			if (m == 0) {
				System.out.println("Это же НОЛЬ!");
				break;
			} else if (m == 1) {
				System.out.println("Это же ОДИН (бог всепапа)!");
				break;
			} else if (m == 2) {
				System.out.println("Это же ДВА!");
				break;
			} else if (m == 3) {
				System.out.println("Это же ТРИ!");
				break;
			} else if (m == 4) {
				System.out.println("Это же ЧЕТЫРЕ!");
				break;
			} else if (m == 5) {
				System.out.println("Это же ПЯТЬ!");
				break;
			} else if (m == 6) {
				System.out.println("Это же ШЕСТЬ!");
				break;
			} else if (m == 7) {
				System.out.println("Это же СЕМЬ!");
				break;
			} else if (m == 8) {
				System.out.println("Это же ВОСЕМЬ!");
				break;
			} else if (m == 9) {
				System.out.println("Это же ДЕВЯТЬ!");
				break;
			} else {
				System.out.println("Ну попросил же от 0 до 9, по братски... Начнем сначала...");
			}
		}
	}
}
