
public class WardrobeFactory {
	public Wardrobe getWardrobe(String type) {
		Wardrobe wd = null;
		if("1".equals(type)) {
			wd = new RealWood();
			wd.price = 75000;
		}
		else if("2".equals(type)) {
			wd = new RealWood();
			wd.price = 95000;
		}
		else if("3".equals(type)) {
			wd = new Metal();
			wd.price = 70000;
		}
		else if("4".equals(type)) {
			wd = new Metal();
			wd.price = 80000;
		}
		else if("5".equals(type)) {
			wd = new CompressedWood();
			wd.price = 55000;
		}
		else if("6".equals(type)) {
			wd = new CompressedWood();
			wd.price = 75000;
		}
		return wd;
	}
}
