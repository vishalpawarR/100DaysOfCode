package supermarket.product;

public class DairyProduct extends GroceryProduct
{
	private Fat fat;

	public DairyProduct(String name, double price, double discount, Fat fat) {
		super(name, price, discount);
		this.fat = fat;
	}
	
	public String dislplay()
	{
		return (super.display()+"\nFat Level: "+fat);
	}

	public Fat getFat() {
		return fat;
	}

	public void setFat(Fat fat) {
		this.fat = fat;
	}
}

