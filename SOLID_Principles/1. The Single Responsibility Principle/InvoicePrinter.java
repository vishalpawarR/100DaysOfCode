package solid.principles.Single;

public class InvoicePrinter 
{
	private Invoice invoice;

	public InvoicePrinter(Invoice invoice) 
	{
		this.invoice = invoice;
	}
	
	public void print()
	{
		System.out.println(invoice.quantity+"x "+invoice.book.name+" "+invoice.book.price+" $");
		System.out.println("Discount rate: "+invoice.discountRate);
		System.out.println("Tax Rate: "+invoice.discountRate);
		System.out.println("Total: "+invoice.total+"$");
	}
}
