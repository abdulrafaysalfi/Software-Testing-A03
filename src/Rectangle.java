

public class Rectangle {

	public boolean isRectangle(int width1,int height1,int width2,int height2)
	{
		boolean isTrue=false;
		if(width1==width2)
		{
			if(height1==height2)
			{
				if(width1!=height1)
				{
					isTrue=true;
				}
			}
		}
		else
		{
			isTrue=false;
		}
		return isTrue;
	}
	public int areaOfRectangle(int width,int height) {
		int result=0;
		if((width>=0 && width<=30) && (height>=0 && height<=30))
		{
			result=width*height;
		}
		return result;
	}
	public int perimeterOfRectangle(int width,int height) {
		int result=0;
		if((width>=0 && width<=30) && (height>=0 && height<=30))
		{
			result=2*(width*height);
		}
		return result;
	}
	public static void main(String[] args)
	{
		Rectangle rect=new Rectangle();
		System.out.println(rect.isRectangle(1,2,3,4));
	}
}

