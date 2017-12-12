package by.htp.homework;
import java.util.Scanner;

public class Task9 {
	public void runTask() {
		System.out.println("Тут начинается задание №8");
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Введи название месяца (любимого или нелюбимого) Первая большая буква, потом маленькие! А то магии не будет! И давай без ошибок там!");//task9
	        String month = sc.nextLine();
	        if (month.equals("Декабрь")||month.equals("Январь")||month.equals("Февраль")){
	            System.out.println("Это Зима!"); }
	        if (month.equals("Март")||month.equals("Апрель")||month.equals("Май")){
	            System.out.println("Это Весна!"); }
	        if (month.equals("Июнь")||month.equals("Июль")||month.equals("Август")){
	            System.out.println("Это ЛЕТОООООООО!"); }
	        if (month.equals("Сентябрь")||month.equals("Октябрь")||month.equals("Ноябрь")){
	            System.out.println("Это Осень!"); }
	}

}
