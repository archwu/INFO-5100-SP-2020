import java.util.ArrayList;

public class Mreview implements Comparable<Mreview> {
  // instance variables
  private String title;   // title of the movie
  private ArrayList<Integer> ratings; // list of ratings stored in a Store object

  Mreview() {
    title = "";
    ratings = new ArrayList<>();
  }

  Mreview(String ttl) {
    title = ttl;
    ratings = new ArrayList<>();
  }

  Mreview(String ttl, int firstRating) {
    ratings = new ArrayList<>();
    title = ttl;
    ratings.add(firstRating);
  }

  public String getTitle() {
    return title;
  }

  void addRating(int r) {
    ratings.add(r);
  }

  double aveRating() {
    int sum = 0;
    for (int rating : ratings) {
      sum += rating;
    }
    return (double) sum / numRatings();
  }

  int numRatings() {
    return ratings.size();
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Mreview)) {
      return false;
    }
    Mreview from = (Mreview) obj;
    return from.title.equals(this.title);
  }


  @Override
  public int compareTo(Mreview o) {
    return 0;
  }

  @Override
  public String toString() {
    return this.title + ", average " + this.aveRating() + " out of " + this.numRatings() + " ratings";
  }

  public static void main(String[] args) {
    Mreview a = new Mreview("Titanic");
    a.addRating(10);
    a.addRating(9);
    a.addRating(7);
    System.out.println(a);
  }
}

