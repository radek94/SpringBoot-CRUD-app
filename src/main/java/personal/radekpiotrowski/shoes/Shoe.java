package personal.radekpiotrowski.shoes;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Shoe {

	@Id
	private int id;
	private String brand, model;
	private boolean isOriginalBox;
	
	public Shoe() {}
	
	public Shoe(int id, String brand, String model, boolean isOriginalBox) {
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.isOriginalBox = isOriginalBox;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isOriginalBox() {
		return isOriginalBox;
	}

	public void setOriginalBox(boolean isOriginalBox) {
		this.isOriginalBox = isOriginalBox;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
			
}
