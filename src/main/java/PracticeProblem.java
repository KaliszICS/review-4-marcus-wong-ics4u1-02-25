import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();		
	}

	public static void q1() {
		//Write question 1 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String num = s.nextLine();
		num = 5 + num;
		System.out.println(Integer.parseInt(num) + 5);
		
	}

	public static void q2() {
		//Write question 2 code here
		Scanner s2 = new Scanner(System.in);
		System.out.print("Input a number: ");
		String num2 = s2.nextLine();
		num2 = 4 + num2 + 3;
		System.out.println(Double.parseDouble(num2) + 3.4);
		
	}

	public static void q3() {
		//Write question 3 code here
		Scanner s3 = new Scanner(System.in);
		System.out.print("Input a boolean: ");
		String num3 = s3.nextLine();
		System.out.println(!Boolean.parseBoolean(num3));
		
	}

	public static void q4() {
		//Write question 4 code here
		Scanner s4 = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String num4 = s4.nextLine();
		num4 = num4 + 3;
		System.out.println((char)(Integer.parseInt(num4) + 2)); 

	}

	public static void q5() {
		//Write question 5 code here
		Scanner s5 = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String num5 = s5.nextLine();
		num5 = num5 + 1;
		System.out.println((double)(Integer.parseInt(num5) / 2));

		
	}

	public static void q6() {
		//Write question 6 code here
		Scanner s6  = new Scanner(System.in);
		System.out.print("Input a number: ");
		String num6 = s6.nextLine();
		num6 = 1 + num6;
		
		System.out.println((int)Double.parseDouble(num6));
	


		
	}

}
