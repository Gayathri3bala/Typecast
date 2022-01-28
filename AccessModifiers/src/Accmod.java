public class Accmod

	{

		private int data = 1580;

		void show()

		{

			System.out.println(data);

		}

		public void display()

		{

			System.out.println("Hope All Are Doing Good");

		}

		protected int no = 24;

	}

	class B extends Accmod

	{

		void msg()

		{

			System.out.println(no);

		}

	}
	
	class Test {

		public static void main(String args[]) {

			B b=new B();

			b.show();

			b.display();

			b.msg();

		}

	}


