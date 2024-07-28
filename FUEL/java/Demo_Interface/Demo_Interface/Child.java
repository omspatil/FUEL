package Demo_Interface;

public class Child implements Grandparent, Parent {
	public void speak() {
		System.out.println("Similar to parent");
	}
	public void walk() {
		System.out.println("Similar to Parent");
	}
	public void hair() {
		System.out.println("Similar to Grandparent");
	}
	public void color() {
		System.out.println("Similar to Grandparent");
	}
	public void tall() {
		System.out.println("Similar to Grandparent");
	}
     public static void main(String[] args) {
		Child c = new Child();
		c.tall();c.color();c.speak();c.hair();c.walk();
	}
}
