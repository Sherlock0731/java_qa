package ru.stqa.pft.sanbox;

public class MyFirstProgram {
	
	public static void main(String[] args) {
		hello("world");
		hello("user");

		Square s = new Square(7);
		System.out.println("Сторона квадрата со стороной " + s.l + " = " + s.area());

		Rectangle r = new Rectangle(7, 5);
		System.out.println("Сторона прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}
}