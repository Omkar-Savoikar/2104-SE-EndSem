
public class Metal extends Wardrobe {

	@Override
	public void print() {
		System.out.println("Metal Wardrobe");
	}

	@Override
	public void setBasePrice() {
		this.price = 70000;
	}

}
