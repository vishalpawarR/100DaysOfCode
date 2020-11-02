package solid.principles.open.closed;

import solid.principles.Single.Invoice;

public class DatabasePersistence implements InvoicePersistence
{
	public void save(Invoice invoice)
	{
		//Save to DB
	}
}