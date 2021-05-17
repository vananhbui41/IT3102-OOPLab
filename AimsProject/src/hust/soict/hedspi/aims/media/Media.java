package hust.soict.hedspi.aims.media;

public abstract class Media implements Comparable<Media>{
	private String title;
	private String category;
	private float cost;
	private int id;
	
	public Media(int id) {
		this.id = id;
	}
//Lab 08
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Media media = (Media)obj;
		return id == media.id;
		
	}
	@Override
    public int compareTo(Media o) {
        //return this.title.compareTo(media.getTitle());
        return Float.compare(this.cost,o.getCost());
    }
	
	Media(String title){
		this.title = title;
		}
	
	Media(String title,String category){
		this(title);
		this.category = category;
	}	
	
	public String getTitle() {
		return title;
	}
	/*public void setTitle(String title) {
		this.title = title;
	}*/
	public String getCategory() {
		return category;
	}
	/*public void setCategory(String category) {
		this.category = category;
	}*/
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public Media(String title, String category, float cost, int id) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.setId(id);
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	
}
