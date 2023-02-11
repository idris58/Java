import java.lang.*;
public class AddressBook{ 
 	private String OwnerName;
	private String Info;
	private Contact ListOfContact[]=new Contact[200]; 
 	 
 	public AddressBook(){ 
 	 	//Empty Constructor  
 	} 
 	 
 	public AddressBook(String OwnerName, String Info) 
 	{ 
 	 	this.OwnerName=OwnerName;
		this.Info=Info; 
 	} 
 	 
 	public void setOwnerName(String OwnerName){this.OwnerName=OwnerName;} 
 	 
 	public void setInfo(String Info){this.Info=Info;} 
 	 
 	public String getOwnerName(){return OwnerName;} 
 	 
 	public String getInfo(){return Info;} 
 	 
 	public void ShowAllContactInfo() 
 	{ 
 	 	System.out.println("Owner Name :"+getOwnerName()); 
 	 	System.out.println("Information :"+getInfo()); 
 	} 
 	 
 	public void ShowContact(){
		for(int i=0; i<ListOfContact.length; i++)
		{ 
 	 	 	if (ListOfContact[i]!= null) 
 	 	 	{ 
 	 	 	 	ListOfContact[i].ShowPersonInfo(); 
 	 	 	 	System.out.println(); 
 	 	 	} 
 	 	} 
 	 	System.out.println(); 
 	 	ShowAllContactInfo(); 
 	 	System.out.println(); 
 	} 
 	 
 	public void AddContact(Contact Con) 
 	{ 
 	 	for(int i=0; i<ListOfContact.length; i++) 
 	 	{ 
 	 	 	if (ListOfContact[i] == null) 
 	 	 	{ 
 	 	 	 	ListOfContact[i]=Con; 
 	 	 	 	break; 
 	 	 	} 
 	 	} 
 	 	 
 	} 
 	 
 	public void DeleteContact(Contact Con) 
 	{ 
 	 	for(int i=0; i<ListOfContact.length; i++) 
 	 	{ 
 	 	 	if (ListOfContact[i] == Con) 
 	 	 	{ 
 	 	 	 	ListOfContact[i]=null; 
 	 	 	} 
 	 	} 
 	 	 
 	} 
 	 
 	public void DeleteContactByName(String Name) 
 	{ 	 
 	 	for(int i=0; i<ListOfContact.length; i++) 
 	 	{ 
 	 	 	if(ListOfContact[i]!= null && ListOfContact[i].getPersonName() == Name) 
 	 	 	{ 
 	 	 	 	ListOfContact[i]=null; 
 	 	 	 	} 
 	 	 	} 
 	 	} 
 	} 
 
 	 
