public class CheckingAccount extends Account{
  static int count;
  double balance;
  
  public CheckingAccount(){
    super(0);
    count++;
  }
  
  public CheckingAccount(double balance){
   super(balance);
    count++;
  }
    
  
  public static int count(){
    return count;
  }
}