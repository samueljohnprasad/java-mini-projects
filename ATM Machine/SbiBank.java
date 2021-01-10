import java.util.Scanner;

public class SbiBank {
    public static void main(String [] args){
       

       BankAccount shashi = new BankAccount("shashi"," 0803101", 2343.0, 11111,1111,"shashishashank@gmail.com");
       BankAccount sam = new BankAccount("sam"," 1234", 100.0, 567890,4444,"samgolla@gmail.com");

      // System.out.println(sam.getPin(607909303));
       
       //server
       BankAccount [] customer= {shashi,sam};
       
     
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter the debit card number");
                long userDebit =  sc.nextLong();
      System.out.println("please enter your pin");
                int userPin = sc.nextInt();
    

        AtmMachine atm = new AtmMachine(userDebit,userPin);

        if(atm.isAccountFind(customer)){
            System.out.println(" HELLO " + atm.getCustomerName().toUpperCase() + " - WELCOME TO SBI BANK ");
            while(true){
                     
                   
                        System.out.println("Enter ");
                        System.out.println("1. withdraw ");
                        System.out.println("2. Deposit");
                        System.out.println("3. Checkbalance ");
                        System.out.println("4. exit \n");
                        System.out.println("ENTER YOU CHOICE :");

                         
                        if(sc.hasNextInt()){
                            int userChoice = sc.nextInt();
                            switch(userChoice){

                                case 1: 
                                while(true){
                            
                                            System.out.println("Enter the amount to  withdraw:");
                                            if(sc.hasNextInt()){
                                                 int amount = sc.nextInt();
                                                  if(atm.withdraw(amount)){
                                                    break;
                                               }else{
                                                    continue;
                                                   }
                                
                                           }else {
                                                   System.out.println("Please Enter Valid Integer Value.");
                                                }
                                sc.nextLine();
                                
                            }
                        
                                
                              //  atm.deposit();
                                break;
                                case 2:

                                while(true){
                                     System.out.println("Enter the amount to be deposited:");
                                    if(sc.hasNextInt()){
                                        int amount =  sc.nextInt();
                                        if(atm.deposit(amount)){
                                            break;
                                            
                                        }else{

                                            System.out.println("Please enter 100,500,1000 only");
                                            continue;

                                        }

                                    
                                            
                                
                                        
                                    }
                                }
                                
                                break;

                                case 3:
                                atm.checkBalance();
                                break;
                             
                                case 4:
                                System.exit(-1);
                                break;

                                default:
                                System.out.println("Please enter a valid option");
                                break;



                            }
                            
                        }else{
                            System.out.println("Please a valid integer number :");
                        }
                    
                    
                       
                   continue;
                 }
                
               
        }else{
               
               System.out.println("not valid use");
        }

    }
    
}
