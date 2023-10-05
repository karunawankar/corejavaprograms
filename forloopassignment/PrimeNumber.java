package forloopassighment;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		int i, count=0;
		for(i=2;i<=num/2;i++) {
			if(num%i==0){
				count++;
			}
		i++;
			 if(count==0) 
			{
				System.out.println(num+" is prime number");
			}
			else {
				System.out.println(num+" is not prime number");
			}
			}
		}
	}



