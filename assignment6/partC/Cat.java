public class Cat extends Pet implements Boardable {
  String hairLength;

  public Cat(String name, String ownerName, String color, String hairLength) {
    super(name, ownerName, color);
    this.hairLength = hairLength;
  }
  String getHairLength(){
    return hairLength;
  }

  @Override
  public String toString() {
    String tmp = super.toString();
    return "CAT:\n" + tmp + "\nHair: " + getHairLength();
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
