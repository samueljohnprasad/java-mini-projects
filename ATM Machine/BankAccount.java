public class BankAccount {
    private String customerName;
    private String customerAccountNum;
    private double bankBalance;
    private long debitCardNum;
    private int pin;
    private String emailAddress;

    


    public BankAccount(String customerName, String customerAccountNum, double bankBalance, long debitCardNum, int pin,
            String emailAddress) {
        this.customerName = customerName;
        this.customerAccountNum = customerAccountNum;
        this.bankBalance = bankBalance;
        this.debitCardNum = debitCardNum;
        this.pin = pin;
        this.emailAddress = emailAddress;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public String getCustomerAccountNum(){
        return this.customerAccountNum;
    }


   public double getBankBalance(){
       return this.bankBalance;
   }


   public long getDebitCardNum(){
       return this.debitCardNum;
   }

   public int getPin(long debitCardNum){
      if(this.debitCardNum == debitCardNum)
      return pin;
      else
      return -1;
    }
    

    
    public String getEmailAddress(){
        return this.emailAddress;
    
    }

    public void updateBalance(double newBalance){
           this.bankBalance = newBalance;

    }


}
