package tests;

import org.junit.Test;

import amnesia.Amnesia;
import amnesia.AmnesiaClass;
import amnesia.CharacterPlayer;
import amnesia.Location;
import junit.framework.TestCase;

public class Test1 extends TestCase {

	@Test
	public void test() {
		Amnesia am = new AmnesiaClass(3, 5);
		CharacterPlayer p = am.getPlayer();
		assert p.getX() == 3;
		assert p.getY() == 5;
		assert p.getLocation().getX()==3;
		assert p.getLocation().getY()==5;
		
		Location newL = am.move('u');
		assert p.getX() == 3;
		assert p.getY() == 6;
		assert p.getLocation().getX()==3;
		assert p.getLocation().getY()==6;
		
		assert p.getLocation() == newL;
		
	}
	
	

}
