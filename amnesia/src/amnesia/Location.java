package amnesia;

import java.util.Set;

public interface Location {
	
	
	String getDescr();
	
	String getShortDescr();
	
	Location getNearLocation(char direction);
	
	Set <Object> getObjects();
	
	int getX();
	
	int getY();
	
	World getWorld();
	
	
}
