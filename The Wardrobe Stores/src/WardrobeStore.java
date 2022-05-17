
public class WardrobeStore {
	
	WardrobeFactory wf = new WardrobeFactory();
	
	public WardrobeStore(WardrobeFactory wf) {
		this.wf = wf;
	}
	
	public Wardrobe order(String type) {
		Wardrobe wardrobe;
		wardrobe = wf.getWardrobe(type);
		return wardrobe;
	}
}
