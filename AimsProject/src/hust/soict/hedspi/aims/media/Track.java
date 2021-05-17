package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.PlayerException;

public class Track implements Playable{
	private String title;
	private int length;
//Lab 08
//Lab 07	
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	public Track() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}
	public Track(String title) {
		super();
		this.title = title;
	}

	public void play() throws PlayerException {
		if (this.getLength() > 0) {
		// TODO Play DVD as you have implemented
			System.out.println("Playing Track: " + this.getTitle());
			System.out.println("Track length: " + this.getLength());
			
		} else {
		throw new PlayerException("ERROR: DVD length is non-positive!");
		}
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this == obj)
			return true;
		if ( obj == null || getClass() != obj.getClass() )
			return false;
		Track track = (Track) obj;
		return title == track.title && 
				length == track.length;
	}
}
