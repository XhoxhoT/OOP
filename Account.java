public class Account {

    private  int  numberId;
    private int balance;
    private String costumerName;
    private String email;
    private String phoneNumber;

    public Account(){
        System.out.println("Empty constructor ");
    }
    public Account(int numberId, int balance,String costumerName, String email, String phoneNumber )
    {
        this.numberId=numberId;
        this.balance= balance;
        this.costumerName= costumerName;
        this.email= email;
        this.phoneNumber= phoneNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getBalance()
    {
        return  balance;

    }
    public void setNumberId(int numberId)
    {
        this.numberId=numberId;

    }

    public int getNumberId()
    {
        return numberId;
    }

    public void setCostumerName(String costumerName)
    {
        this.costumerName=costumerName;

    }

    public String getCostumerName()
    {
        return costumerName;

    }

    public void setEmail(String email)
    {
        this.email=email;
    }
    public String getEmail()
    {
        return email;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void deposit(int value)
    {
        balance=balance+ value;
        System.out.println("Shuma qe shtuat eshte : "+value);
    }
    public void withdraw(int value)
    {
        if(balance>value)
        {
            balance=balance - value;
            System.out.println("Shuma qe vendoset eshte : " +value);
        }else{
            System.out.println("U doesn't have that value");

        }
    }

    public void print()
    {
        System.out.println("Emri : " +costumerName);
        System.out.println("ID : " +numberId);
        System.out.println("Balance : " +balance);
        System.out.println("Email : " +email);
        System.out.println("Phone : " +phoneNumber);

    }



}
