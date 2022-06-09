package study;

import java.awt.Rectangle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle box = new Rectangle(5, 10, 60, 90);
		Rectangle box2 = box;
		box.translate(100, 100);
		System.out.println(box.getX());
		System.out.println(box2.getX());
	}

}
