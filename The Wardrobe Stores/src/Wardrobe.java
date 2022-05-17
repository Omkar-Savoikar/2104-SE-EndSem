import java.util.ArrayList;
import java.util.List;


/**
 * @author 2104
 * @version 1.0.0
 *
 */
public abstract class Wardrobe {
	public Integer price = 0;
	private List<AddOn> items = new ArrayList<AddOn>();
	
	
	/**
	 * This method prints the material type
	 * 
	 */
	public abstract void print();
	
	/**
	 * This method adds addon items
	 * @param item AddOn
	 */
	public void addItem(AddOn item) {
		items.add(item);
	}
	
	/**
	 * This method sets base price of wardrobe
	 *
	 */
	public abstract void setBasePrice();
	
	/**
	 * This method gets price of wardrobe
	 */
	public void getPrice() {
		for(AddOn item: items) {
			price += item.price();
		}
	}
	
	/**
	 * This method displays the addon items
	 */
	public void showItems(){
		for (AddOn item : items) {
			System.out.print("Item : " + item.name());
	        System.out.println(", Price : " + item.price());
	    }		
	}	
}
