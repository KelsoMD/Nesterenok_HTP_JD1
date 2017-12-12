package by.htp.homework;
import java.util.Scanner;

public class Task7 {
	public void runTask() {
		System.out.println("Тут начинается задание №6");
		Scanner sc = new Scanner(System.in);
		System.out.println("А теперь введи число от -9 до 9");// task7
		int l = sc.nextInt();
		if (l > 0 && l % 2 == 0) {
			System.out.println("То что надо! Иди дальше!");
		} else
			System.out.println("Попробуй в другой раз");
	}
}
