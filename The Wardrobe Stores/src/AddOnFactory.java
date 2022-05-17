
public class AddOnFactory {
	public AddOn getAddOn(String type) {
		AddOn addon = null;
		if("1".equals(type)) {
			addon = new Locker();
		}
		else if("2".equals(type)) {
			addon = new Mirror();
		}
		else if("3".equals(type)) {
			addon = new Drawer();
		}
		else if("4".equals(type)) {
			addon = new Shelf();
		}
		else if("5".equals(type)) {
			addon = new Rod();
		}
		return addon;
	}
}
