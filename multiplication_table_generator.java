package multiplication_table_generator;
import java.util.Scanner;
public class test {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter A number To get its table :");
	int number=sc.nextInt();
	System.out.print("Upto which number you want the table to be :");
	int upto=sc.nextInt();
	System.out.println("---------------------------");
	for(int i=1;i<=upto;i++) {
		int result=i*number;
		System.out.println(number+" x "+i+" = "+result);
	}
	System.out.println("---------------------------");
	
}
}
