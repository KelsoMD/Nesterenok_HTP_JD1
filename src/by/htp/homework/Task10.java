package by.htp.homework;
import java.util.Scanner;

public class Task10 {
		public void runTask() {
		System.out.println("��� ���������� ������� �.... 4.1!!! (������ ���� ��������� ������ ���������� Sun=)");
		Scanner sc = new Scanner(System.in);
		System.out.println("������ 2 �����");// task9
		int x = sc.nextInt();
		int y = sc.nextInt();
		String plus = "+";
		String minus = "-";
		String umn = "*";
		String del = "/";
		System.out.println("����� �������������� �������� (+ - * /)");
		String month = sc.next();
		if (month.equals(plus)) {
			int z = x + y;
			System.out.println(z);
		}
		if (month.equals(minus)) {
			int z = x - y;
			System.out.println(z);
		}
		if (month.equals(umn)) {
			int z = x * y;
			System.out.println(z);
		}
		if (month.equals(del)) {
			double z = x / y;
			System.out.println(z);
		}
	}
}
