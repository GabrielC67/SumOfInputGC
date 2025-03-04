import java.util.Scanner;

public class SumOfInput{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int inputScan = scanner.nextInt();
		sumNumbers(inputScan);
	}
	
	static int sumNumbers(int n){
		int sum = 0;
    		for (int i = 1; i <= n; i++) {
       		sum = sum + i;	
		}

    		return sum;
		
	}
}
