package amnesia;

public class AmnesiaClass implements Amnesia {

	private static char UP = 'u';
	private static char DOWN = 'd';
	private static char LEFT = 'l';
	private static char RIGHT = 'r';
	
	private CharacterPlayer player;
	private World world;
	
	
	
	public AmnesiaClass (int startX, int startY){
		world = new WorldClass();
		player = new CharacterPlayerClass(world.getLocation(startX, startY));
	}
	
	
	public Location move(char direction) {
		
		if (direction == UP)
			player.moveUp();
		
		else if (direction == DOWN)
			player.moveDown();
		
		else if (direction == LEFT)
			player.moveLeft();
		
		else
			player.moveRight();
		
		return player.getLocation();
			
	}

	public Location look(char direction) {
		Location loc = player.getLocation();
		int x, y;
		
		if (direction == UP){
			x = loc.getX();
			y = loc.getY()+1;
		}
		
		else if (direction == DOWN){
			x = loc.getX();
			y = loc.getY()-1;
		}
		
		else if (direction == LEFT){
			x = loc.getX()-1;
			y = loc.getY();
		}
		
		else{
			x = loc.getX()+1;
			y = loc.getY();
		}
		
		return world.getLocation(x, y);
		
		
	}

	public CharacterPlayer getPlayer(){
		return player;
	}
	
}
