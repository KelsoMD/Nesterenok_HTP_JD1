package by.htp.homework;
import java.util.Scanner;

public class Task7 {
	public void runTask() {
		System.out.println("��� ���������� ������� �6");
		Scanner sc = new Scanner(System.in);
		System.out.println("� ������ ����� ����� �� -9 �� 9");// task7
		int l = sc.nextInt();
		if (l > 0 && l % 2 == 0) {
			System.out.println("�� ��� ����! ��� ������!");
		} else
			System.out.println("�������� � ������ ���");
	}
}
