package solid.principles.open.closed;

import solid.principles.Single.Invoice;

public interface InvoicePersistence 
{
	public void save(Invoice invoice);
}