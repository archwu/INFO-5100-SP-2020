public class Account {
  String firstName;
  String lastName;
  double curBalance;

  public Account(String fname, String lname, double curbalance) {
    this.firstName = fname;
    this.lastName = lname;
    this.curBalance = curbalance;
  }

  public String getAcctType() {
    return "Account";
  }

  public double DebitTransaction(double debitAmount) {
    curBalance -= debitAmount;
    return curBalance;
  }

  public double CreditTransaction(double creditAmount) {
    curBalance += creditAmount;
    return curBalance;
  }

  @Override
  public String toString() {
    return "Account name: " + this.firstName + " " + this.lastName + ", Account Type: " + getAcctType() + ", Balance: $" + curBalance;
  }
}

