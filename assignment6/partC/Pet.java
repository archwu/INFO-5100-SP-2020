public class Pet {
  public static final int MALE = 0;
  public static final int FEMALE = 1;
  public static final int NEUTERED = 2;
  public static final int SPAYED = 3;
  protected int sex;
  String name;
  String ownerName;
  String color;

  public Pet(String name, String ownerName, String color) {
    this.name = name;
    this.ownerName = ownerName;
    this.color = color;
  }

  String getPetName() {
  return name;
  }

  String getOwnerName() {
  return ownerName;
  }

  String getColor() {
    return color;
  }

  String getSex() {
    switch (String.valueOf(sex)) {
      case "0":
        return "MALE";
      case "1":
        return "FEMALE";
      case "2":
        return "NEUTERED";
      case "3":
        return "SPAYED";
      default:
        return "INVALID SEX";
    }
  }// Should return the string equivalent of the gender, e.g the string “MALE” etc.

  void setSex(int sexid) {
    if (sexid >= 0 && sexid <= 3) {
      sex = sexid;
    }
  }

  @Override
  public String toString() {
    // Should return the name, owner’s name, age, color, and gender (use getSex());
    return getPetName() + " owned by " + getOwnerName() + "\n" + "Color: " + getColor() + "\n" + "Sex: " + getSex();
  }
}
