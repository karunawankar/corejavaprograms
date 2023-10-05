package forloopassighment;
import java.util.Scanner;
public class multipliTable {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number between 2 and 10");
		int n ;
		n =sc.nextInt();
		for(int i=1;i<=10;i++) {
			
			System.out.println(n+"*"+i+"="+n*i);
		}
		
		
		sc.close();
	}

}
