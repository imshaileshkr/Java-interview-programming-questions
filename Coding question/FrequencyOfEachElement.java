import java.util.Scanner;
public class FrequencyOfEachElement{


	// Function to find frequency of each element-----------------

	void frequency(int[] array, int length){
		
		int frequencyArray[] = new int[length];

		int visited = -1;
		for (int i=0;i<length ;i++) {
			int count =1;

			for (int j=i+1;j<length ;j++) {
				if(array[i]==array[j]){
					count++;

					frequencyArray[j]= visited;
				}
			}
		
		if(frequencyArray[i]!=visited)
			frequencyArray[i] = count;


		}
		// Display Frequency of each Element----------------------
		for(int i=0;i<frequencyArray.length;i++){
			if (frequencyArray[i]!=visited) {
				System.out.println(array[i]+" -> "+frequencyArray[i]);
			}
			
		}
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int length = sc.nextInt();

		// declare the Array
		int[] array = new int[length];

		// Taking element 
		System.out.println("Enter the elements of Array");
		for (int i=0;i<length ;i++ ) {
			array[i] = sc.nextInt();
		}

		FrequencyOfEachElement fq  = new FrequencyOfEachElement();
		fq.frequency(array, length);
		sc.close();



	}
}
