public class ArrayUti {

public void printfArray(int[] arr){
	int n=arr.length;
	for(int i=0;i<n; i++){
	System.out.print(arr[i] + " ");
	}
	System.out.println();
	}
	
	public int[] resize(int[] arr, int capacity){
	int [] temp = new int[capacity];
	for(int i=0; i<arr.length; i++){
	temp[i] = arr[i];
	}
	return temp;
	
	}

	public static void main(String[] args){
	ArrayUti arrUti = new ArrayUti();
	//arrUti.printArray(new int[] {5,1,2,9,10});
	int[] original = new int[] {5,1,2,9,10};
	System.out.println("the size of original array - " +original.length);
	original = arrUti.resize(original, 100);
	System.out.println("the size of original after resize array - " +original.length);
	System.out.println("the size of original after resize array - " +original);
	}
	}