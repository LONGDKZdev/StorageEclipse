package bạiava33;

public class Time {
private int day;
private int mouth;
private int year;

public Time() {
	super();
}
public Time (int day, int mouth ,int year) {
if(day>=1 && day<=31) {
  this.day=day;
	} else {
		this.day=1;
	}
if(mouth>1 && mouth<=12) {
  this.mouth=mouth;
	} else {
		this.mouth=1;
	}
if(year >=1) {
  this.year=year;
	}else {
	this.year=1;
	}
}

// getter setter.
public int getDay() {
	return this.day;
}
public void setDay(int day) {
	if(day>=1 && day <=31) {
	this.day=day;
	}else {
		System.out.println(" khong đúng ");
	}
}

public int getMouth() {
	return this.mouth;
}
public void setMouth(int mouth) {
	if(mouth >=1 && mouth <=12) {
	this.mouth = mouth;
	}else {
		System.out.println(" không đúng ");
	}
}
public int getYear() {
	return this.year;
	
}
public void setYear(int year) {
	if(year >=1) {
	this.year = year;
	}else {
		System.out.println(" khong hop le ");
	}
}
@Override
	public String toString() {
		
		return "ngay "+day
				+"\n thang "+mouth
				+"\n nam "+year;
	}
}
