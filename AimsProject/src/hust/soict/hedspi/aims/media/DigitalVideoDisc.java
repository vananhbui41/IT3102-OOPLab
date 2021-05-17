package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable {
//Lab 08
	
//Lab 07	
	public DigitalVideoDisc(String title, String category, float cost, int id) {
		super(title, category, cost, id);
		// TODO Auto-generated constructor stub
	}
	private String director;
	private int length;
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	/*public DigitalVideoDisc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DigitalVideoDisc(String title) {
		super();
		this.setTitle(title);
	}
	
	public DigitalVideoDisc(String title, String category, String directior, int length, float cost) {
		super();
		this.setTitle(title);
		this.setCategory(category);
		this.director = director;
		this.length = length;
		this.setCost(cost);
	}
	public DigitalVideoDisc(String title, String category) {
		super();
		this.setTitle(title);
		this.setCategory(category);
	}
	public DigitalVideoDisc(String title, String category, String directior) {
		super();
		this.setTitle(title);
		this.setCategory(category);
		this.director = director;
	}*/
	public boolean search(String title) {
        title = title.toLowerCase();
        String thisTitle = this.getTitle().toLowerCase().trim();
        thisTitle = thisTitle.toLowerCase().trim();
        String[] titleSplitted = title.split(" ");
        String[] thisTitleSplitted = thisTitle.split(" ");
        int a = 0;
        for (int i = 0; i < titleSplitted.length; i++) {
            for (int j = 0; j < thisTitleSplitted.length; j++) {
                if (thisTitleSplitted[j].equals(titleSplitted[i])) {
                    ++a;
                    break;
                }
            }
            if (a == thisTitleSplitted.length) {
                return true;
            }
        }

        return false;
    }

	public void play() throws PlayerException {
		if (this.getLength() > 0) {
		// TODO Play DVD as you have implemented
			System.out.println("Playing DVD: " + this.getTitle());
			System.out.println("DVD length: " + this.getLength());
			
		} else {
		throw new PlayerException("ERROR: DVD length is non-positive!");
		}
	}
}
