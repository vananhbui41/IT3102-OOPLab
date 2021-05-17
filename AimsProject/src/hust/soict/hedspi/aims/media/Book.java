package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;


public class Book extends Media{
//Lab 08
	private String content;
	
	private List<String> contentTokens;
	private TreeMap<String,Integer> wordFrequency;
    public Book(String title, String category, float cost, ArrayList<String> authors) {
        super(title, category);
        this.authors = authors;
        wordFrequency = new TreeMap<>();
    }
    public void processContent() {
        String[] a = this.content.split(" ");
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            this.contentTokens.add(a[i]);
        }
        Iterator<String> iterator = this.contentTokens.iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            if(this.wordFrequency.containsKey(key)){
                this.wordFrequency.put(key, this.wordFrequency.get(key) + 1);
            } else
                this.wordFrequency.put(key, 1);
        }
    }
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Book{" +
			    "authors=" + authors +
			    ", contentLength='" + contentTokens.size() + '\'' +
			    ", token_list=" + wordFrequency.keySet() +
			    ", wordFrequency=" + wordFrequency +
			    '}';
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
        this.contentTokens = new ArrayList<>();
        this.processContent();
	}
	//Lab 07	
	private List<String> authors = new ArrayList<String>();
	public Book(String title){
		super(title);
		}
	Book(String title,String category){
		super(title, category);
		}
	public Book(String title,String category,List<String> authors){
		super(title, category);
		this.authors = authors;
		//TODO: check author condition
		}
		
	public void addAuthor(String authorName) {
		for (int i=0; i<authors.size();i++) {
			if (authorName.equals(authors.get(i))) {
				System.out.println("This author already exists.");
				return;
			}
		}
		authors.add(authorName);
	}
	
	public void removeAuthor(String authorName) {
		for (int i=0; i<authors.size();i++) {
			if (authorName.equals(authors.get(i))) {
				authors.remove(authorName);
				return;
			}
		}
		System.out.println("The author has been removed.");		
	}
	public Book(String title, String category, float cost, int id) {
		super(title, category, cost, id);
	}
	
}
