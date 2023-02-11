public class Contact{
	private String personName;
	private String personId;
	private int age;
	private String mobilenumber;
	private char gender;
	
	public Contact(){}
	
	public Contact(String a,String b,int c,String d,char e){
		personName=a;
		personId=b;
		age=c;
		mobilenumber=d;
		gender=e;
	}
	public void setName(String a){
		personName=a;
	}
	public void setId(String b){
		personId=b;
	}
	public void setAge(int c){
		age=c;
	}
	public void setNumber(String d){
		mobilenumber=d;
	}
	public void setGender(char e){
		gender=e;
	}
	public String getName(){return personName;} 
	public String getId(){return personId;}
	public int getAge(){return age;}
	public String getNumber(){return mobilenumber;}
	public char getGender(){return gender;}
	
	public void ShowPersoninfo(){
		System.out.println("Person Name:"+getName());
		System.out.println("Person Id:"+getId());
		System.out.println("Age:"+getAge());
		System.out.println("Mobile Number:"+getNumber());
		System.out.println("Gender:"+getGender());
	}
	public void DetectMobileOperator(){
 if(mobilenumber.charAt(2)=='9'){
 System.out.println("Banglalink Operator");
 }
 else if(mobilenumber.charAt(2)=='7'){
 System.out.println("Grameenphone Operator");
 }
 else if(mobilenumber.charAt(2)=='6'){
 System.out.println("Robi Operator");
 }
 else{
 System.out.println("Airtel Operator");
 }
	}
	public static void main(String args[]){
		Contact p = new Contact("SM IDRIS","22-46787-1",20,"017*****",'M');
		p.ShowPersoninfo();
		p.DetectMobileOperator();
	}
}