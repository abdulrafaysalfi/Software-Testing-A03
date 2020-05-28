import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PerimeterTest {
	@Test
	public void Test01()
	{
		Rectangle r=new Rectangle();
		assertEquals(2*(10*20),r.perimeterOfRectangle(10, 20));
	}
	@Test
	public void Test02()
	{
		Rectangle r=new Rectangle();
		assertEquals((0),r.perimeterOfRectangle(-5, 10));
	}
	@Test
	public void Test03()
	{
		Rectangle r=new Rectangle();
		assertEquals((0),r.perimeterOfRectangle(10, -5));
	}
	@Test
	public void Test04()
	{
		Rectangle r=new Rectangle();
		assertEquals(2*(10*10),r.perimeterOfRectangle(10, 10));
	}
}
