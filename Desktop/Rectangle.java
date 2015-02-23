/*
 * @author: Ruiqian Yao
 * E-mail: yaoruiqian@gmail.com
 * purpose: Class Exercise 3.2
 */
import java.util.Scanner;//get the scanner imported
import java.text.DecimalFormat;
public class Rectangle {

	public static void main(String[] args) {
		double width,height,perimeter,area;//declare the variables
		Scanner keyboard=new Scanner(System.in);//get the scanner ready
		DecimalFormat decimal=new DecimalFormat(".00");
		System.out.println("Enter the width of the rectangle.");//prompt for the width
		width=keyboard.nextDouble();//read the width
		System.out.println("Enter the height of the rectangle.");//prompt the height
		height=keyboard.nextDouble();//read the height
		perimeter=2*(width+height);//calculate the perimeter
		area=width*height;//calculate the area
		System.out.println("The perimeter of the rectangle is "+decimal.format(perimeter)+
				"\nThe area of the rectangle is "+decimal.format(area));
		keyboard.close();
		
		
		
		
	}

}
