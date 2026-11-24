abstract class BankAccount{
     abstract double calculateInterest();
    void displayAccountType(){
        System.out.println("Bank Account Details");
    }
}
class SavingsAccount extends BankAccount{
    double balance;
    SavingsAccount(double balance){
        this.balance=balance;
    }
    double calculateInterest(){
        return balance*0.05;
    }

}
public class Abbank {
    public static void main(String[] args) {
        SavingsAccount s=new SavingsAccount(500000);
        s.displayAccountType();
        System.out.println("Balance:"+s.balance);
        System.out.println("Interest:"+s.calculateInterest());
    }
}
