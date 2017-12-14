package by.htp.lesson3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ������� �1.
		int[] x = newArr(100);
		// ������� �2-6.
		returnEven(x);
		// ������� �7-8.
		char[] name = nameToChar();
		name = addPatronymic(name);
		System.out.println("���� ��� � ������� ��������: " + name);
		// ������� �9-9.1
		delThree(x);
		x = makeSmall(x);
		//������� �10
		System.out.println("���������� ���������");
		int[] x1 = newArr(100);
		printArr(x1);
		bubbleAscend(x1);
		System.out.println("���������� �������");
		int[] x2= newArr(100);
		choiceAscend(x2);
		printArr(x);
		System.out.println("���������� ������� ��� ����");
		int[] x3 = newArr(100);
		quickSortAscend(x3,0,x.length-1);
		printArr(x3);
		System.out.println("���������� ���������");
		int[] x4 = newArr(100);
		insertAscend(x4);
		printArr(x4);
		// ������� �11.
		System.out.println("������� ��� �������� � ��������� ��");
		System.out.println("������� ������ ������� (�� ������ 0)");
		Scanner sc = new Scanner(System.in);
		int bot = sc.nextInt();
		System.out.println("������� ������� ������� (�� ������ 99)");
		int top = sc.nextInt();
		returnRange(x4,bot,top);

	}

	// ������� �1. ������� ������ �� � ��������� � ��������� ��� ���������� �������
	// �� 0 �� 99.
	public static int[] newArr(int x) {
		int[] arr = new int[x];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
		}
		System.out.println("Array is generated.");
		return arr;
	}

	// ������� �2,3,4,5,6.
	// 2. ������� �� ������� (������� 1) ��� ������ �������� �� �����.
	// 3. ��������� �������� ���� �������� ��������� �������
	// 4. ��������� ���������� ������ � �������� ��������� � �������, ���-�� ������
	// � �������� ������� �� �����
	// 5. ����� � ������� �� ����� ������������ / ����������� �������
	// 6. ����� ������������ � ����������� ������� ����� ������/�������� ���������

	public static void returnEven(int[] x) {
		System.out.println(
				"This method solving 5 tasks:\n1. Return all even numbers from array.\n2. Return residual of all minus elements from array.");
		System.out.println(
				"3. Return number of odd and even element of array.\n4.Return maximum and minimum element from array.");
		System.out.println("5. Return maximum and minimum elements of odd and even arrays.");
		int residual = 0;
		int even = 0;
		int odd = 0;
		System.out.println("Even elements:\n");
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 0 && x[i] != 0) {
				even++;
				System.out.print(x[i] + " ");
			}
			if (x[i] % 2 != 0 && x[i] != 0) {
				odd++;
				residual = residual - x[i];
			}
		}
		System.out.println("\nResidual " + residual);
		System.out.println("Even: " + even + " Odd: " + odd);
		System.out.println("Maximum: " + max(x) + " Minimum: " + min(x));
		int[] evenArr = newEvenArr(x, even);
		int[] oddArr = newOddArr(x, odd);
		System.out.println("Even maximum: " + max(evenArr) + " Even minimum: " + min(evenArr));
		System.out.println("Odd maximum: " + max(oddArr) + " Odd minimum: " + min(oddArr));
	}

	// ������� �7, 7.1.
	// ��������� � ������ ���� char ���� ������� � ��� (������ ������� �� ������
	// ��������� ���������� �������� � ������� ������ �����
	// 7.1 ����������� ���������� ��� ��� ������ 7 � ����������
	public static char[] nameToChar() {
		System.out.println("Enter your first and last name");
		Scanner sc = new Scanner(System.in);
		String sname = sc.nextLine();
		char[] name = new char[sname.length()];
		for (int i = 0; i < sname.length(); i++) {
			name[i] = sname.charAt(i);
		}
		// ������������ ��� �����
		// System.out.println(name);
		// System.out.println(name[0]);
		// System.out.println(name[4]);
		// System.out.println(name[10]);
		return name;
	}

	// ������� �8. �������� � ����� � ������� �������� ����� ������.
	public static char[] addPatronymic(char[] name) {
		System.out.println("Enter your patronymic, if you have one.");
		Scanner sc = new Scanner(System.in);
		String patronymic = sc.nextLine();
		char[] fullName = new char[name.length + patronymic.length() + 1];
		for (int i = 0; i < name.length; i++) {
			fullName[i] = name[i];
		}
		fullName[name.length] = ' ';
		int j = 0;
		for (int i = name.length + 1; i < fullName.length; i++) {
			fullName[i] = patronymic.charAt(j);
			j++;
		}
		// ��� �����
		// System.out.println(fullName);
		return fullName;
	}

	// ������� �9. ������� �� ������� ��� ����� ������� 3.
	public static int[] delThree(int[] x) {
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 3 == 0) {
				x[i] = -1;
			}
		}
		return x;
	}

	// ������� �9.1. �������� ������ � ������������ � ����������� ��������
	// ���������.
	public static int[] makeSmall(int[] x) {
		int count = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] != -1) {
				count++;
			}
		}
		int[] temp = new int[count];
		int j = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] != -1) {
				temp[j] = x[i];
				j++;
			}
		}
		return temp;
	}

	// ������� �10.1. ����������� ���������.
	// �� �����������
	public static void bubbleAscend(int[] x) {
		int bubble = 0;
		int flag = 1;
		while (flag != 0) {
			flag = 0;
			for (int i = 1; i < x.length; i++) {
				if (x[i - 1] > x[i]) {
					flag++;
					bubble = x[i];
					x[i] = x[i - 1];
					x[i - 1] = bubble;
				}
			}
		}
	}

	// �� ��������
	public static void bubbleDescend(int[] x) {
		int bubble = 0;
		int flag = 1;
		while (flag != 0) {
			flag = 0;
			for (int i = 1; i < x.length; i++) {
				if (x[i - 1] < x[i]) {
					flag++;
					bubble = x[i];
					x[i] = x[i - 1];
					x[i - 1] = bubble;
				}
			}
		}
	}

	// ������� �10.2. ����������� �������.
	// �� �����������
	public static void choiceAscend(int[] x) {
		int buff = 0;
		int minIndex = indexOfMin(x);
		buff = x[0];
		x[0] = x[minIndex];
		x[minIndex] = buff;
		for (int j = 1; j < x.length; j++) {
			int min = x[j];
			buff = x[j];
			int indexofmin = j;
			for (int i = j + 1; i < x.length; i++) {
				if (x[i] < min) {
					min = x[i];
					indexofmin = i;
				}
			}
			x[j] = min;
			x[indexofmin] = buff;
		}
	}

	// �� ��������
	public static void choiceDescend(int[] x) {
		int buff = 0;
		int maxIndex = indexOfMax(x);
		buff = x[0];
		x[0] = x[maxIndex];
		x[maxIndex] = buff;
		for (int j = 1; j < x.length; j++) {
			int max = x[j];
			buff = x[j];
			int indexofmin = j;
			for (int i = j + 1; i < x.length; i++) {
				if (x[i] > max) {
					max = x[i];
					indexofmin = i;
				}
			}
			x[j] = max;
			x[indexofmin] = buff;
		}
	}

	// ������� �10.3. ������� ����������
	public static void quickSortAscend(int[] x, int bot, int top) {
		if (x.length == 0)
			return;
		if (bot >= top)
			return;
		int f = bot + (top - bot) / 2;
		int found = x[f];
		int i = bot, j = top;
		while (i <= j) {
			while (x[i] < found) {
				i++;
			}

			while (x[j] > found) {
				j--;
			}

			if (i <= j) {
				int temp = x[i];
				x[i] = x[j];
				x[j] = temp;
				i++;
				j--;
			}
		}
		if (bot < j)
			quickSortAscend(x, bot, j);

		if (top > i)
			quickSortAscend(x, i, top);
	}
	public static void quickSortDescend(int[] x, int bot, int top) {
		if (x.length == 0)
			return;
		if (bot >= top)
			return;
		int f = bot + (top - bot) / 2;
		int found = x[f];
		int i = bot, j = top;
		while (i <= j) {
			while (x[i] > found) {
				i++;
			}

			while (x[j] < found) {
				j--;
			}

			if (i <= j) {
				int temp = x[i];
				x[i] = x[j];
				x[j] = temp;
				i++;
				j--;
			}
		}
		if (bot < j)
			quickSortDescend(x, bot, j);

		if (top > i)
			quickSortDescend(x, i, top);
	}
	//������� 10.4. ���������� ��������
	public static void insertAscend(int[] x) {
	    int temp, j;
	    for(int i = 0; i < x.length - 1; i++){
	        if (x[i] > x[i + 1]) {
	           temp = x[i + 1];
	           x[i + 1] = x[i];      
	           j = i;
	           while (j > 0 && temp < x[j - 1]) {
	               x[j] = x[j - 1];               
	               j--;
	           }
	           x[j] = temp;             
	        }        
	    }
	}
	public static void insertDescend(int[] x) {
	    int temp, j;
	    for(int i = 0; i < x.length - 1; i++){
	        if (x[i] < x[i + 1]) {
	           temp = x[i + 1];
	           x[i + 1] = x[i];      
	           j = i;
	           while (j > 0 && temp > x[j - 1]) {
	               x[j] = x[j - 1];               
	               j--;
	           }
	           x[j] = temp;             
	        }        
	    }
	}

	// ������� �11. ������� �� ����� ��� �������� ������� ������������� ���������
	// ���������.
	public static void returnRange(int[] x, int bot, int top) {
		System.out.println("Return all numbers from array over the range from " + bot + " to " + top + ".");
		for (int i = 0; i < x.length; i++) {
			if (x[i] >= bot && x[i] <= top) {
				System.out.println(x[i] + " ");
			}
		}
	}

	public static int[] newEvenArr(int[] x, int y) {
		int j = 0;
		int[] evenArr = new int[y];
		for (int i = 0; i < evenArr.length; i++) {
			if (x[i] % 2 == 0 && x[i] != 0) {
				evenArr[j] = x[i];
				j++;
			}
		}
		return evenArr;
	}

	public static int[] newOddArr(int[] x, int y) {
		int j = 0;
		int[] oddArr = new int[y];
		for (int i = 0; i < oddArr.length; i++) {
			if (x[i] % 2 != 0 && x[i] != 0) {
				oddArr[j] = x[i];
				j++;
			}
		}
		return oddArr;
	}

	public static int max(int[] x) {
		int max = x[0];
		for (int i = 0; i < x.length; i++) {

			if (x[i] > max) {
				max = x[i];
			}
		}
		return max;
	}

	public static int indexOfMax(int[] x) {
		int max = x[0];
		int index = 0;
		for (int i = 0; i < x.length; i++) {

			if (x[i] > max) {
				max = x[i];
				index = i;
			}
		}
		return index;
	}

	public static int min(int[] x) {
		int min = x[x.length - 1];
		for (int i = 0; i < x.length; i++) {

			if (x[i] < min) {
				min = x[i];
			}
		}
		return min;
	}

	public static int indexOfMin(int[] x) {
		int min = x[x.length - 1];
		int index = 0;
		for (int i = 0; i < x.length; i++) {

			if (x[i] < min) {
				min = x[i];
				index = i;
			}
		}
		return index;
	}

	public static void printArr(int[] x) {
		System.out.println("TEST");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println("\nTEST");
	}

	public static void makeSmall(char[] x) {
		int count = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] != (0)) {
				count++;
			}
		}
		char[] temp = new char[count];
		int j = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] != 0) {
				temp[j] = x[i];
				j++;
			}
		}

	}
}
