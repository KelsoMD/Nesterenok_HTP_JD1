package by.htp.homework;
import java.util.Scanner;
public class Task3 {
public void runTask()	{
	System.out.println("Тут начинается задание №3");
	Scanner sc = new Scanner(System.in); // task 3
    int x, y;
    System.out.println("Введите первое число");
    x = sc.nextInt();
    System.out.println("Введите второе число");
    y = sc.nextInt();
    int z = x + y;
    System.out.println("Сумма " + z);
	}
}
