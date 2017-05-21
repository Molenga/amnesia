package amnesia;

public class WorldClass implements World {

	private static int DEFAULT_WIDTH = 10;
	private static int DEFAULT_HEIGHT = 10;
	
	int width, height;
	Location[][] world;
	
	
	public WorldClass () {
		width = DEFAULT_WIDTH;
		height = DEFAULT_HEIGHT;
		world = new Location[width][width];
	}
	
	public Location getLocation(int x, int y) {
		return world[x][y];
	}

}
