package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.Scanner;

import hust.soict.hedspi.aims.PlayerException;

public class CompactDisc extends Disc implements Playable{
//Lab 08
//Lab 07	
	public CompactDisc(String title, String category, float cost, int id) {
		super(title, category, cost, id);
		// TODO Auto-generated constructor stub
	}
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();

	public String getArtist() {
		return artist;
	}
	public void addTrack(Track track) {
		if (this.tracks.contains(track)== true)
			System.out.println("The track already exists.");
		else this.tracks.add(track);		
	}
	public void removeTrack(Track track) {
		for (int i = 0; i<this.tracks.size();i++) {
			if (this.tracks.get(i) == track)
				this.tracks.remove(i);
		}
		System.out.println("The track has been removed.");
	}
	public int getLength() {
		int length = 0;
		for (int i = 0;i<this.tracks.size();i++) {
			length = length + this.tracks.get(i).getLength();
		}
		return length;		
	}
	/*public void play() {
		System.out.println(this.tracks);
		Scanner sc = new Scanner(System.in);
		System.out.println("Track number? ");
		int a = sc.nextInt();
		System.out.println("Playing track "+a+this.tracks.get(a).getTitle());
		System.out.println("Track length:"+this.tracks.get(a).getLength());
	}*/
	public ArrayList<Track> getTracks() {
		return tracks;
	}
	public void setTracks(ArrayList<Track> tracks) {
		this.tracks = tracks;
	}
//Lab10
	public void play() throws PlayerException{
		if(this.getLength() > 0) {
			// TODO Play all tracks in the CD as you have implemented
			java.util.Iterator iter = tracks.iterator();
			Track nextTrack;
			while(iter.hasNext()) {
				nextTrack = (Track) iter.next();
				try {
						nextTrack.play();
					}catch(PlayerException e) {
						throw e;
					}
				}
			} else {
				throw new PlayerException("ERROR: CD length is non-positive!");
			}
		}
	
}
