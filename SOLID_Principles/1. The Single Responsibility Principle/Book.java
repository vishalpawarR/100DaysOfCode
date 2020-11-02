package solid.principles.Single;

public class Book 
{
	/*
	 * The Single Responsibility Principle
The Single Responsibility Principle states that a class should do one thing and therefore it should have only a single reason to change.

To state this principle more technically: Only one potential change (database logic, logging logic, and so on.) in the software�s specification should be able to affect the specification of the class.

This means that if a class is a data container, like a Book class or a Student class, and it has some fields regarding that entity, it should change only when we change the data model.

Following the Single Responsibility Principle is important. First of all, because many different teams can work on the same project and edit the same class for different reasons, this could lead to incompatible modules.

Second, it makes version control easier. For example, say we have a persistence class that handles database operations, and we see a change in that file in the GitHub commits. By following the SRP, we will know that it is related to storage or database-related stuff.

Merge conflicts are another example. They appear when different teams change the same file. But if the SRP is followed, fewer conflicts will appear � files will have a single reason to change, and conflicts that do exist will be easier to resolve.

Common Pitfalls and Anti-patterns
In this section we will look at some common mistakes that violate the Single Responsibility Principle. Then we will talk about some ways to fix them.

We will look at the code for a simple bookstore invoice program as an example. Let's start by defining a book class to use in our invoice.

This is a simple book class with some fields. Nothing fancy. I am not making fields private so that we don't need to deal with getters and setters and can focus on the logic instead.

Now let's create the invoice class which will contain the logic for creating the invoice and calculating the total price. For now, assume that our bookstore only sells books and nothing else.
	 */
	String name;
	String authorName;
	int year;
	double price;
	String isbn;
	public Book(String name, String authorName, int year, double price, String isbn) 
	{
		this.name = name;
		this.authorName = authorName;
		this.year = year;
		this.price = price;
		this.isbn = isbn;
	}
	
}
