/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrated;

/**
 *
 * @author jamesjackson
 */
import java.util.InputMismatchException; //James Jackson
											//Summary of skills learned
import java.util.Scanner;

public class Integrated {

	/**
	 * @param args Command line arguments. 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to an integration adventure!");
		System.out.println("");
		
		
		variableDemo(scanner);
		squareRoot(scanner);
		multiplyingNumbers(scanner);
		mathOperators(scanner);
		randomSum(scanner);
		outsideTemp(scanner);
		tableMath(scanner);
		whileBasic();
		switchingItUp(scanner);
		indexCount(scanner);
		littleArray(scanner);
		arraySum(scanner);
		twoDemensions();
		location();
		palindrome(scanner);
	}

	public static void variableDemo(Scanner scanner) {

		System.out.println("Here is a small example of two variable types.");
		int a1 = 63;
		double b1 = 45.0;
		double c1 = 67.675586;

		System.out.print("");

		System.out.println("The value of first variable is " + a1);
		System.out.println("The value of second variable is " + b1);
		System.out.println("The value of third variable is " + c1);
		System.out.print("");
	}

	// Variables are like boxes you can put variables in,
	// there are
	// different sizes.
	// Examples include int, double, float.
	// Once declared you need to give it a name that you can call.
	public static void multiplyingNumbers(Scanner scanner) {

		int product = 0;
		System.out.println("");
		System.out.println("Multipling numbers");
		System.out.println("");
		System.out.println("Enter the 1st number:");
		int num1 = scanner.nextInt();
		System.out.println("Enter the 2nd number:");
		int num2 = scanner.nextInt();

		product = num1 * num2;

		System.out.println("The product of the two numbers is:" + product);
		System.out.println("");

	}

	// End of the second task
	public static void squareRoot(Scanner scanner) {
		System.out.println("Square root and Quadratic root.");
		System.out.println("");

		System.out.println("Enter a number:");
		double x = scanner.nextDouble();

		System.out.println("");
		System.out.println("This will find the square root");
		System.out.printf(" %.5f%n ", Math.sqrt(x)); // This will show the sqrt
														// with five decimal
														// places.
		System.out.println("");
		System.out.println("Quadratic root can be found here");
		System.out.printf(" %.5f%n ", Math.pow(x, 1.0 / 4)); // This uses the a
																// power rule to
																// find the
																// quadratic
																// root.

	}

	public static void mathOperators(Scanner scanner) {
		int a, b;
		int resulta, results, resultm;
		float resultd;

		System.out.println("Enter two numbers to see different math operators");
		System.out.print("Enter a:");
		a = scanner.nextInt();
		System.out.print("Enter b:");
		b = scanner.nextInt();
		// Addition
		resulta = a + b;
		// Subtraction
		results = a - b;
		// Multiplication
		resultm = a * b;
		// Division
		try {
			resultd = (float) a / b;
			System.out.println("The result of dividing is " + resultd);
			System.out.println("The result of adding is " + resulta);
			System.out.println("The result of subtracting is " + results);
			System.out.println("The result of multiplying is " + resultm);
			// (make a try statement for the division problem.
			// This is an example of Integer
			// division, int
			// a will be divided by int b with
			// the backslash key.
		} catch (Exception ex) {
			System.out.println("improper use of math");
		}
		System.out.println("");

	}

	/**
	 * Stores values for a, b, c, and pulls from the luckysum method
	 * to produce a value.
	 */
	public static void randomSum(Scanner scanner) {

		int a, b, c, s;
		System.out.println("Enter 3 values:");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		s = luckySum(a, b, c);
		System.out.println("Lucky sum:" + s);

	}

	
	public static int luckySum(int a, int b, int c) {
		if (a == 13)
			return 0;
		if (b == 13)
			return a;
		if (c == 13)
			return a + b;

		return a + b + c;

	}

	/**
	 * This method will tell you what to expect if you give it the temperature.
	 */
	public static void outsideTemp(Scanner scanner) {

		try {
			System.out.println("");
			System.out.println("Enter Temperature:");
			int temperature = scanner.nextInt();
			if (temperature >= 100) {
				System.out.println("Stay inside its too hot");
			}

			else if (temperature < 100 && temperature >= 65) {
				System.out.println("Enjoy the day");
			} else {
				System.out.println("Bring a sweater.");

			}

		}

		catch (InputMismatchException e) {
			System.out.println("Invalid choice");
			System.out.println("");
		}
	}

	public static void tableMath(Scanner scanner) {

		System.out.println("");
		System.out.println("Enter a number:");
		int firstNumber = scanner.nextInt();

		System.out.println("Enter number of multiples:");
		int secondNumber = scanner.nextInt();

		int counter;
		int multiply;

		for (counter = 1; counter <= secondNumber; counter++) {

			multiply = firstNumber * counter;

			System.out.println(firstNumber + " * " + counter + " = " + (multiply));
			System.out.println("");
		}

	}

	public static void whileBasic() {
		int counter = 0;
		System.out.println("");
		while (counter < 5) {
			System.out.println("Count is " + counter);
			counter++;
		}
	}

	public static void switchingItUp(Scanner scanner) {

		System.out.println("1.Blue, 2.Green, 3.Red, 4.Yellow.");
		System.out.println("Enter the number of your favorite color");
		int color = scanner.nextInt();

		String colorString = "";

		switch (color) {
		case 1:
			colorString = "Blue";
			break;
		case 2:
			colorString = "Green";
			break;
		case 3:
			colorString = "Red";
			break;
		case 4:
			colorString = "Yellow";
			break;

		}
		System.out.println(colorString);
		System.out.println("");

	}

	public static void indexCount(Scanner scanner) {

		int[] arr = new int[5];

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Enter elements:");
				arr[i] = scanner.nextInt();

				System.out.println("Index of:" + i);
				System.out.println("");
			}
		} catch (Exception ex) {
			System.out.println("wrong");
		}
	}

	static void littleArray(Scanner scanner) {
		{

			double[] array = new double[5];
			System.out.println("");
			System.out.println("Enter" + " " + " array elements:");
			try {
				for (int small = 0; small < array.length; small++) {
					array[small] = scanner.nextDouble();
				}
			} catch (InputMismatchException e) {
				System.out.println("Improper selection");

			}
			min(array);
		}
	}

	/**
	 * @param creates an array to store inputs. 
	 * @return returns the value of the array.
	 */
	public static double min(double[] array) {
		double min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println(min);
		return min;

	}

	public static void arraySum(Scanner scanner) {

		int sum = 0;
		int array[];
		int SIZE = 5;
		array = new int[SIZE];
		System.out.println("Enter elements of array :");
		try {
			for (int i = 0; i < array.length; i++) {

				array[i] = scanner.nextInt();
				if (i == 9)
					break;
			}
		} catch (InputMismatchException ex) {
			System.out.println("Improper selection");
		}

		for (int i = 0; i < SIZE; i++) {

			sum += array[i];

		}
		System.out.println("");
		System.out.println("Sum of elements of the array:" + sum);
	}

	public static void twoDemensions() {
		String[][] baseball = { { "First  ", "Second ", }, { "Base", "Stolen" }
		};

		System.out.println(baseball[0][0] + baseball[1][0]);

		System.out.println(baseball[0][1] + baseball[1][1]);

	}

	public static void location() {
		int[][] arr = { { 32, 40, 89, 7, 6, 1 }, { 73, 84, 33, 95, 32, 6 }, 
				{ 32, 99, 6, 5, 32, 42 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 32) {
					System.out.println("");
					System.out.println("i location = " + i + " j location = "
					+ j);
				}
			}
		}
	}

	class Book {

		public void story(Scanner scanner) {
			
			Author aut;

			System.out.println("Enter name:");
			String name = scanner.nextLine();

			System.out.println("Enter email:");
			String email = scanner.nextLine();

			System.out.println("Enter book name:");
			String book = scanner.nextLine();

			aut = new Author(name, email, book);

			System.out.println(aut.getName() + "\n" + aut.getEmail() + "\n" + 
			aut.getBook());

		}

	}

	class Author {
		private String name;
		private String email;
		private String book;

		public Author(String origin, String mail, String title) {
			name = origin;
			email = mail;
			book = title;
		}

		public void setName(String origin) {
			name = origin;
		}

		public void setEmail(String mail) {
			email = mail;
		}

		public void setBook(String title) {
			book = title;
		}

		public String getName() {
			return name;
		}

		public String getEmail() {
			return email;
		}

		public String getBook() {
			return book;
		}
	}

	// Here is an example of a program that finds wether a entered line is a
	// palindrome or not.

	public static void palindrome(Scanner scanner) {
		String original, reverse = "";

		original = scanner.nextLine();

		int length = original.length();

		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);

		if (original.equals(reverse))
			System.out.println("Entered string is a palindrome.");
		else
			System.out.println("Entered string is not a palindrome.");

	}
}

// Inheritance is a way of adding hierarchy to code. For instance you have a
// parent class and child classes, the parent may be Animals, while child
// consists of types of animals like bear or cat.
// This is an example of method overriding. Using this technique you can
// override
// a previous method by using it again in a extended class.
class A {
	int i, j;

	A(int a, int b) {
		i = a;
		j = b;
	}

	void show() {
		System.out.println("i and j:" + i + " " + j);
	}
}

class B extends A {
	int k;

	B(int a, int b, int c) {
		super(a, b);
		k = c;
	}

	void show() {
		System.out.println("k:" + k);
	}
}

class Challenge {

	public static void second(Scanner scanner) {
		
		System.out.println("Enter the 1st number:");
		int num1 = scanner.nextInt();
		System.out.println("Enter the 2nd number:");
		int num2 = scanner.nextInt();
		System.out.println("Enter the 3rd number:");
		int num3 = scanner.nextInt();
		B obj = new B(num1, num2, num3);
		obj.show();

	}
}

// This is an example of how class Circle inherits class CircleShape's methods
// and from this it can compile values from the class.

class Area {

	public static void first(Scanner scanner) {
		
		

		System.out.print("Enter the radius:");
		double radius = scanner.nextDouble();
		new Area().method(radius);
	}

	public void method(double radius) {

		Circle myCircle = new Circle();
		myCircle.setradius(radius);
		System.out.print(myCircle.getDisplayText());
	}

	public abstract class CircleShape {
		public double radius;

		public CircleShape() {
		}

		public CircleShape(double radius) {
			this.radius = radius;
		}

		public void setradius(double radius) {
			this.radius = radius;
		}

		public String toString() {
			return "Radius " + radius;
		}

		abstract String getDisplayText();
	}

	public class Circle extends CircleShape {
		public double area() {
			return radius * radius * 3.14;
		}

		public String getDisplayText() {
			return "Radius " + radius + " and Area is " + area();
		}
	}

	public double area(double a, double b) {
		return 0;
	}

	public double area(double r) {
		return 0;
	}

	public double area(double a, double b, double c) {
		return 0;
	}

}

// Polymorphism is one whose operations can also be applied to values of
// some other type, or types.
// This is an example of how Polymorphism can overloading works.
// Overloading is two or more methods in the same class with the same name but
// different parameters
class Overload {

	public int test(int i) {
		System.out.println("a" + i);
		return i;
	}

	public void test(int i, int num) {
		System.out.println("a and b " + "" + i + " " + num);
	}

	public int test(char a) {
		System.out.println();
		return a;
	}
}

class Example {
	public static void overload(Scanner scanner) {
		Overload overload = new Overload();
		int result;
		overload.test(10);
		overload.test(10, 20);
		result = overload.test('a');
		System.out.println("Result " + result);
	}
}

// This is another polymorphism example, where the parameters of the final class
// are within the shapes class. Then they are called and processed through the
// Final class in the end.
class Shapes {
	public static void blocks(Scanner scanner) {
		
		System.out.print("**Menu**\n1. Area of Rectangle\n2. Area of Square\n3."
				+ " Area of Circle\n4. Area of Triangle\nEnter your choice :");
		int ch = scanner.nextInt();

		Final ar = new Final();
		switch (ch) {
		case 1:
			double a, b;
			System.out.print("Enter length :");
			a = scanner.nextDouble();
			System.out.print("Enter breadth :");
			b = scanner.nextDouble();
			a = ar.area(a, b);
			System.out.print("Area of rectangle is :" + a);
			break;
		case 2:
			double s;
			System.out.print("Enter edge :");
			s = scanner.nextDouble();
			s = ar.area(s, s);
			System.out.print("Area of square is :" + s);
			break;
		case 3:
			double r;
			System.out.print("Enter radius :");
			r = scanner.nextDouble();
			r = ar.area(r);
			System.out.print("Area of circle is :" + r);
			break;
		case 4:
			double c;
			System.out.print("Enter side 1 :");
			a = scanner.nextDouble();
			System.out.print("Enter side 2 :");
			b = scanner.nextDouble();
			System.out.print("Enter side 3 :");
			c = scanner.nextDouble();
			c = ar.area(a, b, c);
			System.out.print("Area of triangle is :" + c);
			break;
		default:
			System.out.print("Wrong Option!!");
		}
	}
}

class Final {
	public double area(double a, double b) {
		return a * b;
	}

	public double area(double a) {
		return a * a * Math.PI;
	}

	public double area(double a, double b, double c) {
		return .5 * a;
	}
}

// Second submission notes
// Some of this code borrowed thanks to proggrammer.com.
// Information gathered from Oracle.com.
// A logical operator (sometimes called a “Boolean operator”) in Java
// programming is an operator that returns a Boolean result that’s based on
// the Boolean result of one or two other expressions.
// Conditional operators include and, or, and teranary statements.
// these try if one option is true and the other, also one or the other.
// Method header is what you start your program with
// (public static void ie();

// Data types.
// Byte - 8 bit signed two's complement integer,
// Minimum value of -128 Max value of 127.
// short - is a 16 bit signed two's complement integer,
// with a minimum value of -32,768 and max of 32767.
// int - is a 32 bit signed two's complement integer, with a
// minimum value of -2^31 and a max of 2^31(-1)
// long 64 bit signed two's complement integer,
// with a minimum value of -2^63 and a max of 2^63(-1)
// float - is a 32 bit IEEE 754 floating point.
// double - is a 64 bit IEEE 754 floating point.
// boolean - is a data type with only two values: true or false.
// char - 16 bit Unicode character.
