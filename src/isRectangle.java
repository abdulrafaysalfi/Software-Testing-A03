import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class isRectangle {

	@Test
	void Test01(int height)
	{
		Rectangle r=new Rectangle();
		assertTrue(r.isRectangle(10,20 , 10, 20));
	}
	@Test
	void Test02()
	{
		Rectangle r=new Rectangle();
		assertFalse(r.isRectangle(10,10 , 10, 10));
	}
	@Test
	void Test03()
	{
		Rectangle r=new Rectangle();
		assertFalse(r.isRectangle(10,10 , 20, 10));
	}
	@Test
	void Test04()
	{
		Rectangle r=new Rectangle();
		assertFalse(r.isRectangle(10,20 , 10, 30));
	}
	@Test
	void Test05()
	{
		Rectangle r=new Rectangle();
		assertFalse(r.isRectangle(10,20 , 30, 40));
	}

}
