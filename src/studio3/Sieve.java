package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("what number?: ");
		int N = in.nextInt();
		boolean number[] = new boolean[N+1];

		for(int i=0; i<=N; i++) {
			number[i]=true;

		}
		for(int p=2; p*p<=N; p++) {
			if (number[p]==true) {
				for (int i=p*p; i<=N; i+=p) {
					number[i]=false;
				}
			}
		}

		for( int i=2; i<=N; i++)
		{
			if ( number[i]== true) {
				System.out.println(i + " ");
			}
			
		}





	}

}
