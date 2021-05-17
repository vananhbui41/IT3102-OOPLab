import java.util.Scanner;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
//a)	
	public MyDate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
//b)
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if ( day >0 & day <32  )
			this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if (month>0 & month<12)
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
//c)
	Scanner keyboard = new Scanner(System.in);
	public void accept() {
		String d,m,y;
			System.out.print("Nhap ngay: ");
			d = keyboard.nextLine();
		System.out.print("Nhap thang : ");
		m = keyboard.nextLine();
		System.out.print("Nhap nam: ");
		y = keyboard.nextLine();
		this.day = Integer.parseInt(d);
		this.month =Integer.parseInt(m);
		this.year = Integer.parseInt(y);
	}

//d)
	public void print() {
		long millis=System.currentTimeMillis();   
		java.sql.Date date=new java.sql.Date(millis);   
		System.out.println(date); 
	}
	
	
}
