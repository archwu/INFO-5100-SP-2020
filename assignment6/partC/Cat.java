public class Cat extends Pet implements Boardable {
  String hairLength;
  int yearStart;
  int yearEnd;
  int monthStart;
  int monthEnd;
  int dayStart;
  int dayEnd;

  public Cat(String name, String ownerName, String color, String hairLength) {
    super(name, ownerName, color);
    this.hairLength = hairLength;
  }

  String getHairLength() {
    return hairLength;
  }

  @Override
  public String toString() {
    String tmp = super.toString();
    return "CAT:\n" + tmp + "\nHair: " + getHairLength();
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
