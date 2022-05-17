import java.util.Scanner;

public class WardrobeBuilder {
	
	public Wardrobe  build(String type) {
		Wardrobe wardrobe = null;
		AddOn addon = null;
		WardrobeFactory wf = new WardrobeFactory();
		WardrobeStore ws = new WardrobeStore(wf);
		wardrobe = ws.order(type); //wardrobe is the wardrobe according to material type and number of door
		String add = "1";
		Scanner scan = new Scanner(System.in);
		while(!add.equals("0")) {
			System.out.println("Menu to choose Add-ons");
			System.out.println("0. Exit");
			System.out.println("1. Locker");
			System.out.println("2. Drawer");
			System.out.println("3. Mirror");
			System.out.println("4. Extra Shelf");
			System.out.println("5. Extra hanging rod");
			System.out.println("Enter your choice (0 or 5): ");
			add = scan.next();
			if(!add.equals("0")) {
				wardrobe.addItem(addon);
			}
		}
		return wardrobe;
	}
}
