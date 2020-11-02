package solid.principles.Liskov;

public class Square extends Rectangle
{
	public Square() 
	{
	
	}
	
	public Square(int size)
	{
		height = width = size;
	}

	@Override
	public void setWidth(int width) {
		// TODO Auto-generated method stub
		super.setWidth(width);
		super.setHeight(width);
	}

	@Override
	public void setHeight(int height) {
		// TODO Auto-generated method stub
		super.setHeight(height);
		super.setWidth(height);
	}
	
	
}
