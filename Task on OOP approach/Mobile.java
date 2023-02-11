public class Mobile
{
   
    private String mobileOwnerName;
    private String mobileNumber;
    private double mobileBalance;
    private String mobileOSName;
    private boolean lock;
    
    
    public String getMobileOwnerName()
    {
        return mobileOwnerName;
    }
    public void setMobileOwnerName(String mobileOwnerName)
    {
        this.mobileOwnerName = mobileOwnerName;
    }
    public String getMobileNumber()
    {
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber)
    {
        this.mobileNumber = mobileNumber;
    }
    public double getMobileBalance()
    {
        return mobileBalance;
    }
    public void setMobileBalance(double mobileBalance)
    {
        this.mobileBalance = mobileBalance;
    }
    public String getMobileOSName()
    {
        return mobileOSName;
    }
    public void setMobileOSName(String mobileOSName)
    {
        this.mobileOSName = mobileOSName;
    }
    public boolean isLock()
    {
        return lock;
    }
    public void setLock(boolean lock)
    {
        this.lock = lock;
    }
    
    public Mobile()
    {
        this.mobileOwnerName="";
        this.mobileNumber="";
        this.mobileBalance=0;
        this.mobileOSName="";
        this.lock=true;
    }
    
    public Mobile(String mobileOwnerName, String mobileNumber, double mobileBalance, String mobileOSName,
                boolean lock)
    {
        this.mobileOwnerName = mobileOwnerName;
        this.mobileNumber = mobileNumber;
        this.mobileBalance = mobileBalance;
        this.mobileOSName = mobileOSName;
        this.lock = lock;
    }
    
    public void ShowInfo()
    {
        
        if(!lock)
        {
            System.out.println("Mobile Information:");
            System.out.println("Owners name: "+this.mobileOwnerName);
            System.out.println("Mobile number: "+this.mobileNumber);
            System.out.println("OS name: "+this.mobileOSName);
            System.out.println("Balance: "+this.mobileBalance);
            System.out.println("--------------------------------");
        }
        else
        {
            System.out.println("Phone Locked...");
        }
    }
    
    public void Recharge(int amount)
    {
      
        if(!lock)
        {
            this.mobileBalance=this.mobileBalance+amount;
			System.out.println("After Recharge Balance: "+this.mobileBalance);
        }
        else
        {
            System.out.println("Phone Locked...Unable to recharge...");
        }
    }
   
    public void CallSomeOne(int timeDuration)
    {
        
		
        if(!lock)
        {
			System.out.println("Call Duration: "+timeDuration+ " min");
			
            double total=timeDuration*0.5;
            if(mobileBalance>=total)
            {
                this.mobileBalance-=total;
                System.out.println("Call Successfull");
            }
            else
            {
                System.out.println("Insufficient Balance");
            }
        }
        else
        {
            System.out.println("Phone Locked..Unable to place call.");
        }
    }
	
	public static void main(String[] args)
    {
        Mobile m1=new Mobile("SM IDRIS","017*****",80.0,"Android",false);
        m1.ShowInfo();
        m1.Recharge(70);
        m1.CallSomeOne(16);
        m1.ShowInfo();
    }
}
