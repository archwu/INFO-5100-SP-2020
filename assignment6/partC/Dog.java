public class Dog extends Pet implements Boardable {

  String size;
  int yearStart;
  int yearEnd;
  int monthStart;
  int monthEnd;
  int dayStart;
  int dayEnd;

  public Dog(String name, String ownerName, String color) {
    super(name, ownerName, color);
  }

  String getSize() {
    return size;
  }

  @Override
  public String toString() {
    String tmp = super.toString();
    return "DOG:\n" + tmp + "\nHair: " + getSize();
  }

  @Override
  public void setBoardStart(int month, int day, int year) {
    yearStart = year;
    monthStart = month;
    dayStart = day;
  }

  @Override
  public void setBoardEnd(int month, int day, int year) {
    yearEnd = year;
    monthEnd = month;
    dayEnd = day;
  }

  @Override
  public boolean boarding(int month, int day, int year) {
    if (year >= yearStart && year <= yearEnd) {
      if (month >= monthStart && month <= monthEnd) {
        if (day >= dayStart && day <= dayEnd) {
          return true;
        }
      }
    }
    return false;
  }
}
