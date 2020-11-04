package design.pattern.Creational;

public class FactoryDesignMain {

	public static void main(String[] args) 
	{
		OperatingSystemFactory osf = new OperatingSystemFactory();
		OS obj = osf.getInstance("Open");
		obj.spec();
	}

}
