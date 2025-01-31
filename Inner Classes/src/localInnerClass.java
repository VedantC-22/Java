


class Outer{
	 int x = 10;
	void m1() {
		int y = 50;
		class Inner{
			static int z = 100;
			void display() {
				System.out.println(Inner.z);
			}
		}
		Inner i = new Inner();
		i.display();
		
	}
}

class Outer2{
	static int x = 20;
	class Inner2{
		static void innerMethod() {
			System.out.println(x);
		}
	}
	
}


public class localInnerClass {
	static int x = 96;
	static class Inner3{
		int y = 6;
		void show() {
			System.out.println("Inside static inner class");
		}
		
		public static void main(String []args) {
			System.out.println("Inside inner3 main method");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o = new Outer();
		o.m1();
		
		Outer2.Inner2 i2 = new Outer2().new Inner2();
		i2.innerMethod();
		
		Inner3 i3 = new Inner3();
		i3.show();
		System.out.println(i3.getClass().getName());
	}

}
