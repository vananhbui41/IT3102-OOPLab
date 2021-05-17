package hust.soict.hedspi.test.media;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;

public class TestMediaCompareTo {
	public static void main(String[] args) {
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", 19.95f,6);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", 24.95f,7);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f,8);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Star Wars 2", "Science Fiction", 20.00f,9);	
		

       ArrayList<Media> collection = new ArrayList();
        collection.add(dvd1);
        collection.add(dvd2);
        collection.add(dvd3);

        Iterator iterator = collection.iterator();
        System.out.println("------------------------------");
        System.out.println("The DVDs currently in the order : ");

        while (iterator.hasNext()){
            System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
        }

        Collections.sort((List)collection);

        iterator = collection.iterator();
        System.out.println("------------------------------");
        System.out.println("The DVDs in sorted order are : ");

        while (iterator.hasNext()){
            System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
        }

    }
}
