import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SnakeTest {

	@Before
	public void setUp() throws Exception {
		String Snake1 = "Peter";
		this.name = name;
		this.length = length;
		this.favoriteFood = favoriteFood;
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void isHealthy() {


			Snake snake = new Snake(new length(0, 0));

			int a= snake.getLength();
			snake.setLenth(length.peter);
			snake.update();
			snake.grow();

			assertThat(snake.getLength(), is(10));

	}
	
	@Test
	public void fitsInCage() {
		
	}

}
