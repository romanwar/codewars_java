import java.util.Scanner;

public class Test{
	public static void main(String[] args){
		//������ ������ ������� � ��������� ����������
		Scanner input = new Scanner(System.in);
		System.out.println("������ �������");
		int sizeNumbers = input.nextInt();
		System.out.println("������ ������");
		int[] numbers = new int[sizeNumbers];
		
		for(int i = 0; i < sizeNumbers; i++){
			numbers[i] = input.nextInt();
		}
		//������ ������� ��� ������
		System.out.println("������ ������� ��� ������");
		int x = input.nextInt();
		//linearSearch(numbers, x); //�������� �����
		//binarySearch(selectionSort(numbers), x); //�������� �����
		selectionSort(numbers);
	}
	
	public static void linearSearch(int[] Array, int arg){
		long time = System.nanoTime();
		int searchElement = 0;
		for(int i = 0; i < Array.length; i++){
			if(arg == Array[i]){
				searchElement = i;
			}else{
				searchElement = -1;
			}
		}
		System.out.println("����� ������:\n");
		time = System.nanoTime() - time;  
		System.out.println(time/1_000_000.0);
		System.out.println(searchElement);
		
	}
	public static int[] selectionSort(int[] Array){
		long time = System.nanoTime();
		int[] newArray = new int[Array.length];
		int min = Array[0];
		for(int i = 0; i < Array.length; i++){
			if(min < Array[i]){
				newArray[i] = min;
				System.out.println(min);
			}else{
				newArray[i + 1] = min;
			}
		}
		System.out.println("����� ������:\n");
		time = System.nanoTime() - time;  
		System.out.println(time/1_000_000.0);
		return newArray;
		
	}
	
	
	
	
}