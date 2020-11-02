package solid.principles.open.closed;

public class PersistenceManager 
{
	InvoicePersistence invoicePersistence;
	BookPersistence bookPersistence;
	public PersistenceManager(InvoicePersistence invoicePersistence, BookPersistence bookPersistence) {
		super();
		this.invoicePersistence = invoicePersistence;
		this.bookPersistence = bookPersistence;
	}
	
	
}
