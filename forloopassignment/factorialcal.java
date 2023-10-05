package forloopassighment;
import java.util.Scanner;
public class factorialcal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n, fact=1;
		
		n=sc.nextInt();
				
		for( int i=1;i<=n;i++) {
			fact=fact*i;
			}
		{
			System.out.println("Factorial of"+ n+" is="+fact);
			
		}
		sc.close();	

	}

}
