import java.util.Scanner;

public class ClientApp {
	
	public static void main(String[] args) {
		Wardrobe wardrobe = null;
		WardrobeBuilder wardrobeBuilder = new WardrobeBuilder();
		Scanner scan = new Scanner(System.in);
		String type;
		System.out.println("Menu to choose material");
		System.out.println("1. Two Door Real Wood");
		System.out.println("2. Three Door Real Wood");
		System.out.println("3. Two Door Metal");
		System.out.println("4. Three Door Metal");
		System.out.println("5. Two Door Compressed Wood");
		System.out.println("6. Three Door Compressed Wood");
		System.out.println("Enter your choice (1 or 6): ");
		type = scan.next();
		wardrobe = wardrobeBuilder.build(type);
		System.out.println("Price :" + wardrobe.price);
	}

}
