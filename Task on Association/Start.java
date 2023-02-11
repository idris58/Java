public class Start{ 
 	public static void main(String[] args) 
 	{ 
 	 	 
 	 	Library arc = new Library(); 
 	 	Library lev = new Library("Bookland Library","Heavely complex,Bashundhara Rd,Dhaka",1000); 
 	 	 
 	 	Book A = new Book("Purana Polton","Alauddin Al-Azad","NV45362","Novels",50); 
 	 	Book B = new Book("Nondito Noroke","Humayun Ahmed", "NV564732","Novels", 75); 
 	 	Book C = new Book("Desh Vager Por","Imdadul Haq Milan", "HI474538","Historical",78); 
 	 	Book D = new Book("Turoshko Bhromon","Ismail Hossain Siraji","TV124532","Travelogue",67); 
 	 	Book E = new Book("Poradhinota", "Imdadul Haq Milan","NF678866","Non-fiction",56); 
 	 	 
 	 	System.out.println("\n ADDING BOOKS: \n"); 
 	 	 
 	 	lev.AddNewBook(A);
		lev.AddNewBook(B);
		lev.AddNewBook(C);
		lev.AddNewBook(D);
		lev.AddNewBook(E); 
 
 	 	lev.Showbook(); 
 	 	 
 	 	System.out.println("\n DELETING BOOKS: \n"); 
 	 	 
 	 	lev.DeleteBook(C);
		lev.DeleteBook(D);
		lev.Showbook(); 
 	 	 
 	 	System.out.println("\n ADDING COPY OF BOOKS: \n"); 
 	 	 
 	 	lev.AddNewBookCopy(E, 2); 
 	 	 
 	 	lev.Showbook(); 
 	 	System.out.println(); 
 	 	 
 	 	AddressBook obj = new AddressBook(); 
 	 	AddressBook dev = new AddressBook("IDRIS", "ABCD"); 
 	 	 
 	 	Contact AA = new Contact("ASIF", "1AD45362",21,"0196*******",'M'); 
 	 	Contact BB = new Contact("DIP", "AD564732",21,"0187*******", 'M'); 
 	    Contact CC = new Contact("RAISA", "3ASD474538",20,"0176*******", 'F'); 
 	 	Contact DD = new Contact("FOYSAL", "AC1245332",20,"0198*******", 'M'); 
 	 	Contact EE = new Contact("SAJAL", "TY678866",19,"0157*******", 'M'); 
 	 	 
 	 	System.out.println("\n ADDING CONTACTS: \n"); 
 	 	 
 	 	dev.AddContact(AA);
		dev.AddContact(BB);
		dev.AddContact(CC);
		dev.AddContact(DD);
		dev.AddContact(EE); 
 	 	 
 	 	dev.ShowContact(); 
 	 	 
 	 	System.out.println("\n DELETING CONTACTS: \n");
		dev.DeleteContact(CC); 
 	 	 
 	 	dev.ShowContact(); 
 	 	 
 	 	 
 	 	System.out.println("\n DELETING CONTACTS BY NAME: \n"); 
 	 	 
 	 	dev.DeleteContactByName("RAISA"); 
 	 	 
 	 	dev.ShowContact(); 
 	 	 
 	} 
 	 
} 
