public class AtmMachine {
    private int pin;
    private long debitCardNum;

       //shashi        //sam
    private BankAccount bankAccount;                                         

 
    AtmMachine(long debitCardNum,int pin){
        this.debitCardNum = debitCardNum;
        this.pin = pin;
        bankAccount = null;
    }

    
    public Boolean isAccountFind(BankAccount[] bankAccounts){
        
        //shashi--
        this.bankAccount = findBankAccount(bankAccounts);
              if(bankAccount !=null)
              return true;
     
        return false;
    }

    

    private BankAccount  findBankAccount(BankAccount [] bankAccounts){

        for(int i = 0; i<bankAccounts.length;i++){     
            if(bankAccounts[i].getDebitCardNum() == debitCardNum
            && bankAccounts[i].getPin(debitCardNum) == pin){

                return bankAccounts[i];
            }
                   
        }
        return null;
    }


    public void checkBalance(){
        if(bankAccount !=null){
            System.out.println("Bank amount rupees : " + bankAccount.getBankBalance());
        }

    }

     public String getCustomerName(){
             return bankAccount.getCustomerName();
     }

     public boolean deposit(double amountToBeDeposited){
             if(amountToBeDeposited>0 &&  amountToBeDeposited%100 == 0){
                double balance =   bankAccount.getBankBalance();
                    balance += amountToBeDeposited;

                    bankAccount.updateBalance(balance);
                    System.out.println("Rs "+amountToBeDeposited + " has been deposited successfully");
                    System.out.println("your updated balance :" + balance);
                    return true;
             } 

             return false;
        }

     public boolean withdraw(int amountToBewithdraw){
           double balance = bankAccount.getBankBalance();
          
         if(amountToBewithdraw % 100 == 0){
             if(amountToBewithdraw>0 && amountToBewithdraw<=balance){
                   
                    balance -= amountToBewithdraw;

                    bankAccount.updateBalance(balance);
                    System.out.println("Please Collect Your Amountt");
                    System.out.println("Rs "+ amountToBewithdraw + " has been debited successfully ");
                    System.out.println("your current balance : " + balance);
                    return true;
              
             }else{
                 System.out.println("Insufficient balance. only Rs "+balance);
                 return false;
             }
         }else{
            System.out.println("Withdrawal Amount should be Multiples of Rs.100, Rs.200, Rs.500, Rs.2000");
            return false;
         }
     }
    

}
