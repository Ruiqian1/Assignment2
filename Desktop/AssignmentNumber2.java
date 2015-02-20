import javax.swing.JOptionPane;
import java.lang.Math;
import java.util.Scanner;

public class AssignmentNumber2 {

	public static void main(String[] args) {
	double a,b,c,d,e,sum,max1, max2,max3,max4,min1,min2,min3,min4;
	double average;
	Scanner keyboard =new Scanner(System.in);
	System.out.println("Enter five numbers ");
	a=keyboard.nextInt();
	b=keyboard.nextInt();
	c=keyboard.nextInt();
	d=keyboard.nextInt();
	e=keyboard.nextInt();
	sum=a+b+c+d+e;
	average=sum/5;
	max1=Math.max(a, b);
	max2=Math.max(c, d);
	max3=Math.max( max1, e);
	max4=Math.max(max3, max2);
	min1=Math.min(a, b);
	min2=Math.min(c, d);
	min3=Math.min(min1,e);
	min4=Math.min(min3, min2);
	System.out.println("The sum of fove numbers is "+sum+
			           "\nThe average of five numbers is " +average+
			           "\nThe maxmum of the five numbers is "+ max4+
			           "\nThe minimum of the five numbers is "+min4);
}
}
	
	
	
	
	
	
	