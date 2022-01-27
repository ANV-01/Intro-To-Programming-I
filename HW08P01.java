
public class HW08P01 {

	public static void main(String[] args) {
		int [] array = new int [20];
		
		
		for (int x = 0 ; x<array.length;x++) {
		array[x]= (int)(Math.random()*array.length);
		}
		System.out.print("Before Bubble Sort ");
		AllElements(array);
		System.out.print("\nAfter  Bubble Sort  ");
		BubbleSort(array);
		PrintArray(array);

	}
	public static void  BubbleSort(int[] arr) {
		int num = arr.length;
		for (int i=0 ; i<num ; i++) 
			for (int j = 0 ;j<num - i -1;j++) 
				if (arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
				}
				
	}
			
			
		
		
		
	
	public static void AllElements(int[] arr) {
		for (int x : arr) {
			System.out.print(x+ " ");
		}
	}
		
	public static void PrintArray(int[] arr){
		int num = arr.length;
		for (int i = 0 ; i < num;i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}
					
			
}
			
		
		
	

