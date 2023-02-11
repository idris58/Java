public class Book{ 
 	 
 	private String BookName;
	private String BookAuthor;
	private String BookID;
	private String BookType;
	private int BookCopy; 
 	 
 	private static int BookCounter=50; 
 	 
 	public Book() 
 	{ 
 	 	//Empty Constructor
 	} 
 	 
 public Book(String BookName, String BookAuthor, String BookID, String BookType, int BookCopy) 
 	{
 	 	this.BookName = BookName;
		this.BookAuthor = BookAuthor;
		this.BookID = BookID;
		this.BookType = BookType;
		this.BookCopy = BookCopy; 
 	} 
 	 
 	public void setBookName(String BookName) 
 	{ 
 	 	this.BookName=BookName; 
 	} 
 	public void setBookAuthor(String BookAuthor) 
 	{ 
 	 	this.BookAuthor=BookAuthor; 
 	} 
 	public void setBookID(String BookID) 
 	{ 
 	 	this.BookID=BookID; 
 	} 
 	public void setBookType(String BookType) 
 	{ 
 	 	this.BookType=BookType; 
 	} 
 	public void setBookCopy(int BookCopy) 
 	{ 
 	 	this.BookCopy=BookCopy; 
 	} 
 	 
 	public String getBookName() 
 	{ 
 	 	return BookName; 
 	} 
 	public String getBookAuthor() 
 	{ 
 	 	return BookAuthor; 
 	} 
 	public String getBookID() 
 	{ 
 	 	return BookID; 
 	} 
 	public String getBookType() 
 	{ 
 	 	return BookType; 
 	} 
 	public int getBookCopy() 
 	{ 
 	 	return BookCopy; 
 	} 
 	 
 	public void ShowBookInfo() 
 	{ 
 	 	System.out.println("BOOK NAME: "+ getBookName()); 
 	 	System.out.println("BOOK AUTHOR: "+ getBookAuthor()); 
 	 	System.out.println("BOOK ID: "+ getBookID()); 
 	 	System.out.println("BOOK TYPE: "+ getBookType()); 
 	 	System.out.println("BOOK COPY: "+ getBookCopy()); 
 	} 
 	 
 	public void SumBookCopy(int x) 
 	{ 
 	 	this.BookCopy=BookCopy+x; 
 	 	System.out.println("TOTAL BOOK COPY= " + BookCopy); 
 	} 
 	public void ShowTotalBookInfo() 
 	{ 
 	 	System.out.println("BOOK COUNTER= "+ BookCounter); 
 	} 
 
} 
