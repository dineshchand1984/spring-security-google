package hello.world.maven.dto;

public class FoodItem {

	private int id;
	
	private String name;
	
	private double price = 0.0;
	
	private String description;

	public FoodItem( int iID, String iName, double iPrice, String iDescription) {
		this.id = iID;
		this.name = iName;
		this.price = iPrice;
		this.description = iDescription;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
