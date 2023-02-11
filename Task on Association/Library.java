import java.lang.*;
public class Library{ 
 	private String LibName;
	private String LibAddress;
	private Book ListOfBook[] = new Book[20];
	private int TotalBook; 
 	 
 	public Library(){ 
 	 	//Empty Constructor  
 	} 
 	 
 	public Library(String LibName, String LibAddress, int TotalBook) 
 	{  
 	 	this.LibName=LibName; 
 	 	this.LibAddress=LibAddress;
		this.TotalBook=TotalBook; 
 	} 
 	 
 	public void setLibName(String LibName){this.LibName=LibName;} 
 	 
 	public void setLibAddress(String LibAddress){this.LibAddress=LibAddress;} 
 	 
 	public void setTotalBook(int TotalBook){this.TotalBook=TotalBook;}
	
	public String getLibName(){return LibName;} 
 
	public String getLibAddress(){return LibAddress;} 
	public int getTotalBook(){return TotalBook;} 
 	 
 	public void ShowLibInfo() 
 	{ 
 	 	System.out.println("Library Name :"+getLibName()); 
 	 	System.out.println("Library Address :"+getLibAddress()); 
 	 	System.out.println("Library Total Books :"+getTotalBook()); 
 	} 
 	 
 	public void Showbook(){
		for(int i=0; i<ListOfBook.length; i++) 
 	 	{ 
 	 	 	if (ListOfBook[i]!= null) 
 	 	 	{ 
 	 	 	 	ListOfBook[i].ShowBookInfo(); 
 	 	 	 	System.out.println(); 
 	 	 	} 
 	 	} 
 	 	System.out.println(); 
 	 	ShowLibInfo(); 
 	 	System.out.println(); 
 	} 
 	 
 	public void AddNewBook(Book book)
	{ 
	 	for(int i=0; i<ListOfBook.length; i++) 
	 	{ 
	 	 	if (ListOfBook[i] == null) 
			{ 
	 	 	 	ListOfBook[i]=book; 
 	 	 	 	break; 
 	 	 	} 
 	 	} 
 	 	 
 	} 
 	 
 	public void DeleteBook(Book book) 
 	{ 
 	 	for(int i=0; i<ListOfBook.length; i++) 
 	 	{ 
 	 	 	if (ListOfBook[i] == book) 
 	 	 	{ 
 	 	 	 	ListOfBook[i]=null; 
 	 	 	} 
 	 	} 
 	} 
 	 
 	public void AddNewBookCopy(Book book, int copy) 
 	{ 
 	 	int count=0; 
 	 	 
 	 	for(int i=0; i<ListOfBook.length; i++) 
 	 	{ 
	 	 	if (ListOfBook[i] == null) 
	 	 	{ 
	 	 	 	ListOfBook[i]=book; 
	 	 	 	count++; 
	 	 	if(count == copy) 
	 	 	 	{ 
 	 	 	 	 	break; 
 	 	 	 	} 
 	 	 	} 
 	 	} 
 	} 
 
} 
