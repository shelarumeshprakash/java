public class MaxArray {

public int findSMax(int[] arr){

int max = Integer.MIN_VALUE;
int seMax = Integer.MIN_VALUE;
for(int i=0; i<arr.length; i++){
	if(arr[i]>max){
		seMax = max;
		max = arr[i];
	}
	else if(arr[i]>seMax && arr[i] != max);
}


return seMax;
}
public static void main(String[] args){
int [] arr = {5,9,3,15,58,2};
MaxArray na = new MaxArray();
System.out.println(na.findSMax(arr));

}
}