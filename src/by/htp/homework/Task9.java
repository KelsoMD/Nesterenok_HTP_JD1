package by.htp.homework;
import java.util.Scanner;

public class Task9 {
	public void runTask() {
		System.out.println("��� ���������� ������� �8");
		 Scanner sc = new Scanner(System.in);
	        System.out.println("����� �������� ������ (�������� ��� ����������) ������ ������� �����, ����� ���������! � �� ����� �� �����! � ����� ��� ������ ���!");//task9
	        String month = sc.nextLine();
	        if (month.equals("�������")||month.equals("������")||month.equals("�������")){
	            System.out.println("��� ����!"); }
	        if (month.equals("����")||month.equals("������")||month.equals("���")){
	            System.out.println("��� �����!"); }
	        if (month.equals("����")||month.equals("����")||month.equals("������")){
	            System.out.println("��� �����������!"); }
	        if (month.equals("��������")||month.equals("�������")||month.equals("������")){
	            System.out.println("��� �����!"); }
	}

}
