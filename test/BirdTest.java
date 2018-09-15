import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.sta.animal.Bird;

public class BirdTest {
	
	Bird bird = new Bird();

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSing() {
		assertEquals(bird.sing(), "I am singing");
	}

}
