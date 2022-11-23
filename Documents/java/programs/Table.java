import java.util.Scanner;

public class Table{

public static void main (String[] args){
Scanner in = new Scanner(System.in);

System.out.print("Input num for table : ");
int num = in.nextInt();

for(int i=1; i<=10; i++){
System.out.println(num + "x" + i +"=" +(num*i));
}}}