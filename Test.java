import java.util.*;

import static java.lang.System.exit;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Date date = new Date();

        Transaction transaction = new Transaction(23156,21000,date,true);
        Account account = new Account("Qwa12ea455as",20000,"Asadullah",transaction);
        AccountHolder accountHolder = new AccountHolder("Aqs347uyi9","Asadullah");
        Foregin foregin = new Foregin("pakistani","B640X21Z9","persnol");
        Citizen citizen = new Citizen("40224-29876541-4","naganChorangi",0.0);
        ATMCard atmCard = new ATMCard("Q1E2567A",account,4289,true);
        UtilityCard utilityCard = new UtilityCard("Q1234AE454",account,transaction);
        UtilityPlan utilityPlan = new UtilityPlan(12000,date,"May");


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>BANKING SYSTEM<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("____________________________________________________________");
        System.out.println("| ________________________________________________________ |");
        System.out.println("| |                                                      | |");
        System.out.println("| |                                                      | |");
        System.out.println("| |         Asad's Online Banking System                 | |");
        System.out.println("| |                                                      | |");
        System.out.println("| |                                                      | |");
        System.out.println("| |               ATM CashOut                            | |");
        System.out.println("| |                                                      | |");
        System.out.println("| |                                                      | |");
        System.out.println("| |                      Sponsered By:                   | |");
        System.out.println("| |                             HBL (HABIB BANK LIMITED) | |");
        System.out.println("| |______________________________________________________| |");
        System.out.println("|----------------------------------------------------------|");
        System.out.println("| ________________________________________________________ |");
        System.out.println("| |                                                      | |");
        System.out.println("| |                                                      | |");
        System.out.println("| |     1.    CASH OUT                                   | |");
        System.out.println("| |     2.    DEPOSIT                                    | |");
        System.out.println("| |     3.    Transaction                                | |");
        System.out.println("| |     4.    ADD                                        | |");
        System.out.println("| |     5.    Purchase                                   | |");
        System.out.println("| |     6.    Details                                    | |");
        System.out.println("| |     7.    Exit                                       | |");
        System.out.println("| |                                                      | |");
        System.out.println("| |______________________________________________________| |");
        System.out.println("|__________________________________________________________|");
        System.out.println("Enter the Choice: ");
        int choise = input.nextInt();

        if(choise == 1){
            System.out.println("Your Balance is :  "+account.getBalance());
            System.out.println("Aslam-o-Alikum , Sir how many Cash you want to Take:");
            System.out.println("5000" +
                    "\n1000" +
                    "\n500" +
                    "\n100\n");
            double cash = input.nextDouble();
            if(cash < account.getBalance()) {
                double total = account.getBalance() - cash;
                System.out.println("CashOut Successfully....\nOrignal Balance is : " + account.getBalance() );
                System.out.println("Your New Balance is: " + total);
            }else{
                System.out.println("Your balance remain same: "+account.getBalance());
                System.out.println("Out of Cash...");
            }
        }else if(choise == 2){

            System.out.println("How many Ammount You Want to deposit: ");
            double depositAmount = input.nextDouble();

            double amount = depositAmount + account.getBalance();

            System.out.println("Your new Balance is:  " + amount);

        }else if(choise == 3){

            System.out.println("Enter the Transaction amount:  ");
            int transac = input.nextInt();
            System.out.println("Enter the Type of Transaction (deposit or debit): ");
            String type = input.next();

            System.out.println("Transaction Successfully Done ... ENJOY ... If you Want See Details press d else any to Exit:");
            char op = input.next().charAt(0);

            System.out.println("==============================================");
            System.out.println("             Transaction Detials              ");
            System.out.println("==============================================");
            System.out.println(transaction.TranssectionalHistory(date , date));
            System.out.println("Last transaction amount: " + transaction.getAmount());
            System.out.println("last transaction Approved: " + transaction.isApproval());
            System.out.println("Current transaction amount: " + transaction.getAmount());
            System.out.println("Current transaction type: " + type);
            System.out.println("Total transaction amount is: " + (transaction.getAmount() + transac));
            System.out.println("===============================================");

            System.out.println("Press any key and Enter to Exit...");
            char exit1 = input.next().charAt(0);
            exit(0);


        }else if(choise == 4){
            System.out.println("Enter The New Amount: ");
            double amount = input.nextDouble();
            account.setBalance(amount);

            System.out.println("========================================");
            System.out.println("            New Detials                 ");
            System.out.println("========================================");
            System.out.println("     Account Name :        " + account.getAccountName());
            System.out.println("     Account Number:       " + account.getAccountNumber());
            System.out.println("     Pin Code:             " + atmCard.getPin());
            System.out.println("     transection Amount:   " + transaction.getAmount());
            System.out.println("     New Balance           " + account.getBalance() + amount);
            System.out.println("     Discount:             " + (account.getBalance() * 20) / 100);
            System.out.println("     Deposit Amount        " + amount);
            System.out.println("=========================================");
            System.out.println("\n\n\t\t\tPress any and Enter Key to Exit...");
            char cd = input.next().charAt(0);
            exit(0);
        }else if(choise == 5){
            System.out.println("Enter the Payable: \n1.Atm\n2.Cash: ");
            int ch = input.nextInt();

            if(ch == 1){

                System.out.println("**********Welcome to ATM Machine***********");

                System.out.println("Enter the Amount to Pay: ");
                double pay = input.nextInt();

                double amount = account.getBalance() - pay;

                System.out.println("Your bill have been paid and new amount is: " + amount);

            }if(ch == 2){
                System.out.println("You have to cash the amount");
            }else{
                System.out.println("Invalid Selection");
            }

        }else if(choise == 6){
            System.out.println("><><><><><><><><><DETAILS<><><><><><><><><><><");
            System.out.println("Account Name: " + account.getAccountName());
            System.out.println("Account NUmber: " + account.getAccountNumber());
            System.out.println("BarCode: " + atmCard.getBarCode());
            System.out.println("Atm Pin: " + atmCard.getPin());
            System.out.println("Account Balance: " + account.getBalance());
            System.out.println("Address: " + citizen.getAddress());
            System.out.println("Nationality: " + foregin.getNationality());
            System.out.println("Transcation Id: " + transaction.getTransactionId());
            System.out.println("Passport Number: " + foregin.getPassPortNo());
            System.out.println("Account Type: " + foregin.getAccType());
        }else if(choise == 7){
                exit(0);
        }else{
            exit(0);
        }



    }

}
