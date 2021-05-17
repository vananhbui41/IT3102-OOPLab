package hust.soict.hedspi.aims;

import java.util.ArrayList;
import java.util.Scanner;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Track;
import hust.soict.hedspi.aims.order.Order;

public class Aims {
	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Order anOrder = new Order();
		String a;
		Book book[] = new Book[3];
		book[0]= new Book("Sach 1","Loai 1",20.1f,1);
		book[1] = new Book("Sack 2","Loai 2",10.2f,2);
		book[2] = new Book("Sach 3","loai 3",15.8f,3);
		CompactDisc cd[] = new CompactDisc[2];
		cd[0]= new CompactDisc("CD1","abc",100f,4);
		cd[1]=new CompactDisc("CD2","hfhfak",50f,5);
		DigitalVideoDisc dvd[] = new DigitalVideoDisc[4];
		dvd[0] = new DigitalVideoDisc("The Lion King", "Animation", 19.95f,6);
		dvd[1] = new DigitalVideoDisc("Star Wars", "Science Fiction", 24.95f,7);
		dvd[2] = new DigitalVideoDisc("Aladdin", "Animation", 18.99f,8);
		dvd[3] = new DigitalVideoDisc("Star Wars 2", "Science Fiction", 20.00f,9);
		//ArrayList<Order> orders = new ArrayList<Order>();
		while(true) {
			showMenu();
			a = sc.nextLine();
			
			switch (a) {
			case "1":	
				break;
			case "2": 
				String type;
					System.out.println("Enter a: to add Book.");
					System.out.println("Enter b: to add CompactDisc.");
					System.out.println("Enter c: to add DigitalVideoDisc");
					type = sc.nextLine();
					switch(type) {
					case "a":
						System.out.println("Enter bookid:");
						int bookid = sc.nextInt();
						sc.nextLine();
						for(int i=0;i<book.length;i++) {
							if ( book[i].getId() == bookid)
								anOrder.addMedia(book[i]);
						}
						break;
					case "b":
						System.out.print("Enter cdid:");
						int cdid = sc.nextInt();
						sc.nextLine();
						for (int i=0;i<cd.length;i++) {
							if (cd[i].getId()==cdid) {
								anOrder.addMedia(cd[i]);
								//System.out.println("Add a track to the CD");
								System.out.println("Enter title: ");
								String title = sc.nextLine();
								System.out.println("Enter length: ");
								int length = sc.nextInt();
								Track track = new Track(title,length);
								cd[i].addTrack(track);
								sc.nextLine();
								System.out.println("Play? Y/N");
								String ys = sc.nextLine();
								if (ys == "Y")
									try {
										cd[i].play();
									} catch (PlayerException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
							}	
						}
						break;
					case "c":
						System.out.println("Enter cdid:");
						int dvdid = sc.nextInt();
						sc.nextLine();
						for (int i=0;i<dvd.length;i++) {
							if (dvd[i].getId()==dvdid) {
								anOrder.addMedia(dvd[i]);
								System.out.println("Play? Y/N");
								String ys = sc.nextLine();
								if (ys == "Y")
									try {
										dvd[i].play();
									} catch (PlayerException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
							}
						}
						break;
					default:
						System.out.println("Invalid");
						continue;
					}
				break;
			case "3": 
				System.out.println("Enter item id: ");
				int removeid = sc.nextInt();
				sc.nextLine();
				anOrder.removeMedia1(removeid);
				break;
			case "4": 
				anOrder.printList();
				break;
			case "0":
				System.exit(0);
			default:
				System.out.println("Invalid request!");
				continue;
			}
			
		}
		
		
		/*Lab3
		// TODO Auto-generated method stub
		Order anOrder = new Order();
		//Create a new dvd object and set the fields
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		// add the dvd to the order
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);
		anOrder.addDigitalVideoDisc(dvd3);
		
		System.out.println(anOrder.toString());
		
		System.out.print("Total cost is: ");
		System.out.println(anOrder.totalCost());
		
		anOrder.removeDigitalVideoDisc(dvd3);
		System.out.println(anOrder.toString());*/
		/*Lab 4
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Ronger Aller",
                87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star wars", "Sicence fiction",
                "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker",
                90, 18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Soul", "Animation", "Pete Docter",
                107, 15.79f);		
		Order order = new Order();
        order.addDigitalVideoDisc(dvd1);
        order.printOrder();

        Order order1 = new Order();
        order1.addDigitalVideoDisc(dvd1, dvd2, dvd3, dvd4, dvd1, dvd4, dvd3);
        order1.addDigitalVideoDisc(dvd1);
        order1.printOrder();

        Order order2 = new Order();
        order2.addDigitalVideoDisc(dvd1, dvd1, dvd3, dvd3, dvd4, dvd2, dvd3, dvd1);
        order2.printOrder();

        Order order3 = new Order();
        order3.addDigitalVideoDisc(dvd1, dvd2, dvd3, dvd4, dvd3, dvd1, dvd1, dvd1, dvd4, dvd4);
        order3.addDigitalVideoDisc(dvd2);
        order3.printOrder();

        Order order4 = new Order();
        order4.addDigitalVideoDisc(dvd1, dvd2, dvd3, dvd4, dvd1, dvd4, dvd2);
        order4.printOrder();

        Order order5 = new Order();
        order5.addDigitalVideoDisc(dvd1, dvd2, dvd3, dvd4, dvd1, dvd4, dvd2, dvd3, dvd1, dvd1, dvd1);
        order5.printOrder();

        Order order6 = new Order();
        order6.addDigitalVideoDisc(dvd1, dvd2, dvd3, dvd4, dvd1, dvd4, dvd2);
        order6.printOrder();
        */
        
	}

}
