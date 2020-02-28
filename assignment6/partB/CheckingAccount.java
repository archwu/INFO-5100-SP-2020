public class CheckingAccount extends Account
{
  // static data members
  static private double MinBalance = 100;
  static private double Fee = 10;


  // NO instance data members


  // methods
  public CheckingAccount(String fname, String lname, double cb){
    super(fname, lname, cb);
  }

  //
  //
  // WRITE YOUR CODE FOR ALL METHODS
  //


  @Override
  public double DebitTransaction(double debitAmount) {
    if (super.DebitTransaction(debitAmount) < MinBalance) {
      ChargeFee();
    }
    return curBalance;
  }

  @Override
  public double CreditTransaction(double creditAmount) {
    if (super.CreditTransaction(creditAmount) < MinBalance) {
      ChargeFee();
    }
    return curBalance;
  }

  private void ChargeFee() {
    curBalance -= Fee;
  }


  // Test
  public static void main(String[] args)
  {
    CheckingAccount ch1 = new CheckingAccount("Steve", "Jobs", 50); // he was poor once before
    System.out.println(ch1);


    ch1.DebitTransaction(0.25); // he was cheap back then too
    System.out.println(ch1);    // should be $39.75 (= $49.75 - $10 fee)


    ch1.CreditTransaction(7.00); // small expense check
    System.out.println(ch1);     // should be $36.75 (= $39.75 + $7.00 - $10 fee)


    ch1.CreditTransaction(1000000); // a huge bonus!!
    System.out.println(ch1); // should be $1000036.75
  }


	  /* Output of the test
	  Account name: Steve Jobs, Account Type: CheckingAccount, Balance: $50.00
	  Account name: Steve Jobs, Account Type: CheckingAccount, Balance: $39.75
	  Account name: Steve Jobs, Account Type: CheckingAccount, Balance: $36.75
	  Account name: Steve Jobs, Account Type: CheckingAccount, Balance: $1000036.75
	  */
}
