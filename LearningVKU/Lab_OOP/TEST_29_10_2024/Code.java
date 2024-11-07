package TEST_29_10_2024;

	abstract class A
	{
		abstract void print();
	}

	interface Interface1
	{
		void sum3();
	}

	interface Interface2
	{
		void sum2();
	}

	class B extends A implements Interface1,Interface2
	{
		@Override
		void print()
		{
			System.out.println("ClassA");
		}

		@Override
		public void sum3()
		{
			System.out.println("a + b + c");
		}

		@Override
		public void sum2()
		{
			System.out.println("a + b");
		}
	}


