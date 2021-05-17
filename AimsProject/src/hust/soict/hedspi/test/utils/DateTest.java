package hust.soict.hedspi.test.utils;

import hust.soict.hedspi.aims.utils.MyDate;

public class DateTest {
	public static void main(String[] args) {
		MyDate d1 = new MyDate();
		d1.print();
		d1.accept();
		System.out.println("Ngay 1:"+d1.getDate()+"-"+d1.getMonth()+"-"+d1.getYear());
	}

}
