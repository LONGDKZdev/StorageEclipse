package Tester;

import Model.CounterModel;

public class Test {

	public static void main(String[] args) {
		CounterModel ct = new CounterModel();
		ct.incresment();
		ct.incresment();
		ct.incresment();
		ct.incresment();
		ct.incresment();
		ct.decrement();
		ct.decrement();
		System.out.println(ct.getValue());
	}

}
