
import java.util.Scanner;
public class EvenPositionOfArray{


	void evenPosition(int[] array, int size){
			System.out.println("Array element of Even position : ");
			for (int i=1;i<size;i+=2 ) {
				System.out.print(array[i]+" ");
			}
		}
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size = sc.nextInt();

		int[] array = new int[size];

		System.out.println("Enter the array element");
		for (int i=0;i<size;i++) {
			array[i] = sc.nextInt();
		}
		
		EvenPositionOfArray  even = new EvenPositionOfArray();
		even.evenPosition(array, size);
		sc.close();

	}
}