package amnesia;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Set;

public class CharacterPlayerClass extends AbstractCharacterClass implements CharacterPlayer {
	
	private static final int INVENTORY_SIZE = 500;
	
	Dictionary <String, Set<Object>> inventory;


	
	
	public CharacterPlayerClass(Location loc) {
		super(loc);
		inventory = new Hashtable<String, Set<Object>>(INVENTORY_SIZE);
		
	}


	
	public Location moveUp() {
		this.location = world.getLocation(x, y+1);
		this.y = y+1;
		return this.location;
	}



	public Location moveDown() {
		this.location = world.getLocation(x, y-1);
		this.y = y-1;
		return this.location;
	}



	public Location moveLeft() {
		this.location = world.getLocation(x-1, y);
		this.x = x-1;
		return this.location;
	}



	public Location moveRight() {
		this.location = world.getLocation(x+1, y);
		this.x = x+1;
		return this.location;
	}


	
	


}
