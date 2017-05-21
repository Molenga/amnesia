package amnesia;

public abstract class AbstractCharacterClass implements AbstractCharacter {

	World world;
	Location location;
	int x, y;
	
	public AbstractCharacterClass(Location loc) {
		this.location = loc;
		this.x = location.getX();
		this.y = location.getY();
		this.world = location.getWorld();
	}
	
	public Location getLocation() {
		return this.location;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}

}
