public class ArrayUti {

public void printfArray(int[] arr){
	int n=arr.length;
	for(int i=0;i<n; i++){
	System.out.print(arr[i] + " ");
	}
	system.out.println();
	}
	
	public void resize(int[] arr, int capacity){
	int [] temp = new int[capacity];
	for(int i=0; i<arr.length; i++){
	temp[i] = arr[i];
	}
	arr = temp;
	return arr;
	}
}
	public static void main(string[] args){
	ArrayUti arrUtil = new ArrayUti();
	arrUtil.printArray(new int[] {5,1,2,9,10};
	int[] original = new int {5,1,2,9,10};
	System.out.println("the size of original array - " +original.length);
	arr.Util.resize(original, 10);
	System.out.println("the size of original after array - " +original.length);
	}
	}