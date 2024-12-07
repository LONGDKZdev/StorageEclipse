package Model;


//nơi thiết lập các phép tính
public class CounterModel {
	private int value;
	
	public CounterModel() {
		this.value = 0;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public void incresment1() {
		this.value++;
	}
	
	public void incresment10() {
		this.value+=10;
	}
	
	public void incresment100() {
		this.value+=100;
	}
	
	public void decrement1() {
		this.value--;
	}
	
	public void decrement10() {
		this.value-=10;
	}
	
	public void decrement100() {
		this.value-=100;
	}
	
	public void reset() {
		this.value = 0;
	}
}
