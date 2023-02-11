public class Contact{ 
 	 
 	private String PersonName;
	private String PersonID;
	private int Age;
	private String MobileNumber;
	private char Gender; 
 	 
 	 
 	public Contact() 
 	{ 
 	 	//Empty Constructor
 	} 
 	 
 	public Contact(String PersonName, String PersonID, int Age, String MobileNumber, char Gender) { 
 	 	
		this.PersonName = PersonName;
		this.PersonID = PersonID; 
 	 	this.Age = Age; 
		this.MobileNumber = MobileNumber;
		this.Gender = Gender; 
 	} 
 	 
public void setPersonName(String PersonName)
{ 
	 	this.PersonName=PersonName;
		}
		public void setPersonID(String PersonID)
		{
 	 	this.PersonID=PersonID;
		}
		public void setAge(int Age)
		{ 
 	 	this.Age=Age;
		}
		public void setMobileNumber(String MobileNumber) 
		{ 
 	 	this.MobileNumber=MobileNumber; 
		} 
		public void setGender(char Gender) 
		{ 
 	 	this.Gender=Gender; 
		} 
 	 
		public String getPersonName() 
		{ 
 	 	return PersonName; 
		} 
		public String getPersonID() 
		{ 
 	 	return PersonID; 
		}
		public int getAge()
		{ 
	 	return Age;
		} 
		public String getMobileNumber() 
		{
 	 	return MobileNumber; 
		} 
		public char getGender() 
		{ 
 	 	return Gender; 
		}
 	 
 	public void ShowPersonInfo()
 	{ 
 	 	System.out.println("PERSON NAME: "+ getPersonName()); 
 	 	System.out.println("PERSON ID: "+ getPersonID()); 
 	 	System.out.println("AGE: "+ getAge()); 
 	 	System.out.println("MOBILE NUMBER: "+ getMobileNumber());
		
		if(getGender()=='M'|| getGender()== 'm') 
 	 	{ 
 	 	 	System.out.println("GENDER: MALE"); 
 	 	} 
 	 	else if(getGender()=='F'||getGender()=='f') 
 	 	{ 
 	 	 	System.out.println("GENDER: FEMALE"); 
 	 	} 
 	} 
 	 
} 
