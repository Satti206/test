import  java.util.Scanner;

public class Fibbonachi {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Введите n: ");
		int n = in.nextInt();

		System.out.println(fib(n));
	}
	public static int fib(int n){
		if(n == 1 || n == 0) return 1;

		return fib(n - 1) + fib(n - 2);
	}
}