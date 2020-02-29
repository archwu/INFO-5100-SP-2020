public class Dog extends Pet implements Boardable {

  String size;
  int year;
  int month;
  int day;

  public Dog(String name, String ownerName, String color) {
    super(name, ownerName, color);
  }
  String getSize(){
    return size;
  }

  @Override
  public String toString() {
    String tmp = super.toString();
    return "DOG:\n" + tmp + "\nHair: " + getSize();
  }

  @Override
  public void setBoardStart(int month, int day, int year) {

  }

  @Override
  public void setBoardEnd(int month, int day, int year) {

  }

  @Override
  public boolean boarding(int month, int day, int year) {
    return false;
  }
}
