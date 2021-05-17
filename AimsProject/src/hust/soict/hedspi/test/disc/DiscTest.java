package hust.soict.hedspi.test.disc;

import java.util.Scanner;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class DiscTest {
	public static void main(String[] args) {
		DigitalVideoDisc dvd10 = new DigitalVideoDisc("Harry Potter");
		String test;
		Scanner scanner = new Scanner(System.in);
        
	    System.out.println("Nhap chuoi can test: ");
	    test = scanner.nextLine();
	    
	    if (dvd10.search(test)) {
	    	System.out.println("True");
	    }
	    else System.out.println("False");
	    System.exit(0);
	}
}
