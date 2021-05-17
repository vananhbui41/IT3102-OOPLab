package hust.soict.hedspi.aims.order;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Date;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.utils.MyDate;
public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	private String id;
	
	public Order() {
		super();
	}

/*	public float totalCost() {
		float totalcost=0;
		for (int i=0; i<qtyOrdered; i++) {
			totalcost = totalcost + itemsOrdered[i].getCost();
		}
		return totalcost;
	}*/
//Lab04
	/*public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		while (this.qtyOrdered < MAX_NUMBERS_ORDERED) {
			for (int i = 0; i<dvdList.length;i++) {
				addDigitalVideoDisc(dvdList[i]);
				this.qtyOrdered++;
			}
		}
		if (this.qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The order is almost full\n"
					+ "Dvd can't be add:");
			for (int i= this.qtyOrdered+1;i < dvdList.length;i++) {
				System.out.println(dvdList[i].getTitle());
			}
		}
	}*/
	
	MyDate myDate = new MyDate();
	private Date dateOrdered;
	public static final int  MAX_LIMITTED_ORDERS = 5;
	//private static int nbOrders = 0;
	private static int check = 0;
	//private int check_order = 0;
	//private static int count_order_limited = MAX_LIMITTED_ORDERS;
	
	SimpleDateFormat formatter = new SimpleDateFormat("  HH:mm:ss dd/MM/yyyy");
	
	public Date getDateOrdered() {
		return dateOrdered;
	}

	public void setDateOrdered(Date dateOrdered) {
		this.dateOrdered = dateOrdered;
	}
	
	public void printDigitalVideoDisc(DigitalVideoDisc dics) {
        System.out.println(" - " + dics.getTitle() + " - " + dics.getCategory()
                + " - " + dics.getDirector() + " - " + dics.getLength() + " : " + dics.getCost());

	}
	
/*    public void printOrder() {
        if (check == 0) {
            System.out.println("**************************************Order**************************************");
            System.out.println("Date : " + formatter.format(this.getDateOrdered()));
            System.out.println("Ordered Items : ");
            for (int i = 0; i < this.qtyOrdered; i++) {
                System.out.println("DVD - " + this.itemsOrdered[i].getTitle() + " - " + this.itemsOrdered[i].getCategory()
                        + " - " + this.itemsOrdered[i].getDirector() + " - " + this.itemsOrdered[i].getLength() + " : " + this.itemsOrdered[i].getCost());
            }
            System.out.println("Total cost : " + this.totalCost());
            System.out.println("*********************************************************************************");

        }
    }*/
/*
//Lab 05
    public DigitalVideoDisc getALuckyItem() {
    	int random_int = (int)(Math.random() * (this.qtyOrdered ));
    	System.out.println(this.itemsOrdered[random_int].getTitle()+" is the lucky item.");
    	return this.itemsOrdered[random_int];  	
    }
    public float totalCost() {
		float totalcost=0;
		for (int i=0; i<qtyOrdered; i++) {
			totalcost = totalcost + itemsOrdered[i].getCost();
		}
		totalcost = totalcost - this.getALuckyItem().getCost();		
		return totalcost;
	}
*/   
//Lab 06
    public void addMedia(Media media) {
    	if (this.itemsOrdered.size() >= MAX_NUMBERS_ORDERED) {
    		System.out.println("The order is almost full");
    	}
    	else this.itemsOrdered.add(media);
    }
    
    public void removeMedia(Media media) {
    	for (int i = 0; i< this.itemsOrdered.size();i++) {
    		if (this.itemsOrdered.get(i) == media)
    			this.itemsOrdered.remove(i);
    	}
    	System.out.println("Media has been removed!");
    }
    public void removeMedia1(int id) {
    	for (int i = 0; i< this.itemsOrdered.size();i++) {
    		if (this.itemsOrdered.get(i).getId() == id)
    			this.itemsOrdered.remove(i);
    	}
    	System.out.println("Media has been removed!");
    }
    public Media getALuckyItem() {
    	int random_int = (int)(Math.random() * (this.itemsOrdered.size()));
    	System.out.println(this.itemsOrdered.get(random_int).getTitle()+" is the lucky item.");
    	return this.itemsOrdered.get(random_int);  	
    }
    public float totalCost() {
		float totalcost=0;
		for (int i=0; i<this.itemsOrdered.size(); i++) {
			totalcost = totalcost + this.itemsOrdered.get(i).getCost();
		}
		totalcost = totalcost - this.getALuckyItem().getCost();		
		return totalcost;
	}
    public void printOrder() {
        if (check == 0) {
            System.out.println("**************************************Order**************************************");
            System.out.println("Date : " + formatter.format(this.getDateOrdered()));
            System.out.println("Ordered Items : ");
            for (int i = 0; i < this.itemsOrdered.size(); i++) {
                System.out.println("DVD - " + this.itemsOrdered.get(i).getTitle() + " - " + this.itemsOrdered.get(i).getCategory()
                        + " - " + /*this.itemsOrdered[i].getDirector() + " - " + this.itemsOrdered[i].getLength() + " : " + */this.itemsOrdered.get(i).getCost());
            }
            System.out.println("Total cost : " + this.totalCost());
            System.out.println("*********************************************************************************");
        }
    }

	public void removeMedia(int idItem1) {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public void printList() {
		System.out.println("**************************************List Media**************************************");
		System.out.println("Items:");
		for (int i=0;i<this.itemsOrdered.size();i++) {
				System.out.println(this.itemsOrdered.get(i).getId()+" - "+this.itemsOrdered.get(i).getTitle() + " - "
						+this.itemsOrdered.get(i).getCost() + " - "+this.itemsOrdered.get(i).getCategory());
				
		}
        System.out.println("Total cost : " + this.totalCost());
		System.out.println("*********************************************************************************");
	}

}


