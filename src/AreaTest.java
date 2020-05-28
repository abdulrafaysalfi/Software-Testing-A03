import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AreaTest {

	@Test
	public void Test01()
	{
		Rectangle r=new Rectangle();
		assertEquals((10*20),r.areaOfRectangle(10, 20));
	}
	@Test
	public void Test02()
	{
		Rectangle r=new Rectangle();
		assertEquals((0),r.areaOfRectangle(-5, 10));
	}
	@Test
	public void Test03()
	{
		Rectangle r=new Rectangle();
		assertEquals((0),r.areaOfRectangle(10, -5));
	}
	@Test
	public void Test04()
	{
		Rectangle r=new Rectangle();
		assertEquals((10*10),r.areaOfRectangle(10, 10));
	}

}
