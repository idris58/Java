public class Book{
	
	private String bookName;
	private String bookAuthor;
	private String bookId;
	private String bookType;
	private int bookCopy;
	static int bookCounter=10;
	
	public Book(){}
	public Book(String n,String a,String i,String t,int c){
	bookName=n;
	bookAuthor=a;
	bookId=i;
	bookType=t;
	bookCopy=c;
	}
	public void setbookName(String n){bookName=n;}
	public String getbookName(){return bookName;}
	
	public void setbookAuthor(String a){bookAuthor=a;}
	public String getbookAuthor(){return bookAuthor;}
	
	public void setbookId(String i){bookId=i;}
	public String getbookId(){return bookId;}
	
	public void setbookType(String t){bookType=t;}
	public String getbookType(){return bookType;}
	
	public void setbookCopy(int c){bookCopy=c;}
	public int getbookCopy(){return bookCopy;}
	
	

void ShowBookinfo(){
System.out.println("Book Name:"+getbookName());
System.out.println("Book Author :"+getbookAuthor());
System.out.println("Book Id :"+getbookId());
System.out.println("Book Type :"+getbookType());
System.out.println("Book Copy :"+getbookCopy());
}


public void AddBookCopy(int x){
 bookCopy=bookCopy+x;
}
public static void showTotalBookInfo(){
 
 System.out.println("Book Counter :" +bookCounter);
 }

	
	public  static void  main(String[] args){
		Book a = new Book();
		Book b = new Book("Shesher Kabita","Rabindranath Tagore","N-104","Novel",40);
		b.ShowBookinfo();
		Book.showTotalBookInfo();
		System.out.println();
		System.out.println("After adding some copy");
		b.AddBookCopy(15);
		b.ShowBookinfo();
		Book.showTotalBookInfo();
		}
		
}




		