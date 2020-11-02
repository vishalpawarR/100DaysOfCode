package solid.principles.Single;

public class InvoicePersistence 
{
	Invoice invoice;

	public InvoicePersistence(Invoice invoice) 
	{
		this.invoice = invoice;
	}
	
	public void saveToFile(String filename)
	{
		//create a file with a given name and writes the invoice
	}
	
}
