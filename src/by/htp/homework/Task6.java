package by.htp.homework;
import java.util.Scanner;

public class Task6 {
	public void runTask() {
		System.out.println("��� ���������� ������� �5");
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ����� �� 0 �� 9"); // task6
		while (true) {
			int m = sc.nextInt();
			if (m == 0) {
				System.out.println("��� �� ����!");
				break;
			} else if (m == 1) {
				System.out.println("��� �� ���� (��� �������)!");
				break;
			} else if (m == 2) {
				System.out.println("��� �� ���!");
				break;
			} else if (m == 3) {
				System.out.println("��� �� ���!");
				break;
			} else if (m == 4) {
				System.out.println("��� �� ������!");
				break;
			} else if (m == 5) {
				System.out.println("��� �� ����!");
				break;
			} else if (m == 6) {
				System.out.println("��� �� �����!");
				break;
			} else if (m == 7) {
				System.out.println("��� �� ����!");
				break;
			} else if (m == 8) {
				System.out.println("��� �� ������!");
				break;
			} else if (m == 9) {
				System.out.println("��� �� ������!");
				break;
			} else {
				System.out.println("�� �������� �� �� 0 �� 9, �� �������... ������ �������...");
			}
		}
	}
}
