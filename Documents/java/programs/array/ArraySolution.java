
public class Arraysolution {
	public static void main(String[] args){
		int[] a1 = new int[100];
		int count =1;
		
		//a1[0] = 4;
		//a1[1] = 5;
		//a1[2] = 4;
		//a1[3] = 5;
		
		for(int i=0; i<a1.length; i++){
			a1[i]=count;
			count++;
		}
		for(int j=0; j<a1.length; j++){
			System.out.print(a1[j]+ " - ");
		}
	}
}

