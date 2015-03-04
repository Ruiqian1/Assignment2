
/*
 * @author Ruiqian Yao
 * date 2/20/2015
 * E-mail yaoruiqian@gmail
 * purpose Assignment2
 * professor Tanes Kanchanawanchai
 * class CSC-200 003N
 */
//import all the utilities that my needed.
import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;
public class Assignment2part2 {

	public static void main(String[] args) {
		double a, b, c, d, e, sum, max1, max2, max3, max4, min1, min2, min3, min4, mode = 1;// declare
																							// all
																							// the
																							// variables
																							// that
																							// my
																							// be
																							// used
																							// in
																							// the
																							// following
																							// program.
		double average;
		int acount = 1, bcount = 1, ccount = 1, dcount = 1, ecount = 1, A, B, C, D;
		Scanner keyboard = new Scanner(System.in);// declare the scanner
		System.out.println("Enter five numbers.");// prompt the users to enter
													// five numbers
		a = keyboard.nextDouble();// store all the values of five numbers that
									// the users entered as in a,b,c,d,and e.
		b = keyboard.nextDouble();
		c = keyboard.nextDouble();
		d = keyboard.nextDouble();
		e = keyboard.nextDouble();
		sum = a + b + c + d + e;// declare the sum
		average = sum / 5;// calculate the average
		max1 = Math.max(a, b);// compare the maximum of the five numbers
		max2 = Math.max(c, d);
		max3 = Math.max(max1, e);
		max4 = Math.max(max3, max2);
		min1 = Math.min(a, b);// compare the minimum of the five numbers
		min2 = Math.min(c, d);
		min3 = Math.min(min1, e);
		min4 = Math.min(min3, min2);
		if (a == b) {
			acount++;
			bcount++;
		}
		;
		if (a == c) {
			acount++;
			ccount++;
		}
		;
		if (a == d) {
			acount++;
			dcount++;
		}
		;
		if (a == e) {
			acount++;
			ecount++;
		}
		;
		if (b == c) {
			bcount++;
			ccount++;
		}
		;
		if (b == d) {
			bcount++;
			dcount++;
		}
		;
		if (b == e) {
			bcount++;
			ecount++;
		}
		;
		if (c == d) {
			ccount++;
			dcount++;
		}
		;
		if (c == e) {
			ccount++;
			ecount++;
		}
		;
		if (d == e) {
			dcount++;
			ecount++;
		}
		;
		A = Math.max(acount, bcount);
		B = Math.max(ccount, dcount);
		C = Math.max(A, ecount);
		D = Math.max(B, C);
		if (D == acount) {
			mode = a;
		}
		if (D == bcount) {
			mode = b;
		}
		if (D == ccount) {
			mode = c;
		}
		if (D == dcount) {
			mode = d;
		}
		if (D == ecount) {
			mode = e;
		}
		double sort[]={a,b,c,d,e};
		double median=sort[sort.length/2];

		System.out.println("The sum of five numbers is " + sum
				+ "\nThe average of five numbers is " + average
				+ "\nThe maxmum of the five numbers is " + max4
				+ "\nThe minimum of the five numbers is " + min4
				+ "\nThe mode is " + mode+
				"\nThe median is "+median);// output the sum, average,
											// maximum,and the minimum

	}

}
