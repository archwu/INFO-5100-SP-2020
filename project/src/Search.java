import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

interface SearchFactory {
  Parser produceParser();

  DataGetter produceDataGetter();

  Sorter produceSorter();
}

class SearchDealer implements SearchFactory {

  @Override
  public Parser produceParser() {
    return new DealerParser();
  }

  @Override
  public DataGetter produceDataGetter() {
    return new DealerGetter();
  }

  @Override
  public Sorter produceSorter() {
    return new DealerSorter();
  }

}

class SearchVehicle implements SearchFactory {

  @Override
  public Parser produceParser() {
    return new VehicleParser();
  }

  @Override
  public DataGetter produceDataGetter() {
    return new VehicleGetter();
  }

  @Override
  public Sorter produceSorter() {
    return new VehicleSorter();
  }
}

class SearchIncentive implements SearchFactory {

  @Override
  public Parser produceParser() {
    return new IncentiveParser();
  }

  @Override
  public DataGetter produceDataGetter() {
    return new IncentiveGetter();
  }

  @Override
  public Sorter produceSorter() {
    return new IncentiveSorter();
  }
}

public class Search {
  /*
  This class is the API we provide to all the GUIs. The GUI should instantiate a Search instance with their input of
  GUI and their identifier(Vehicle, Dealer or Incentive). Afterwards the GUI only need to call the doSearch() method
  then our algorithms will return sorted data for GUI to display
   */
  SearchFactory factory;
  String[] input;

  public Search(String[] a, String b) {
    input = a;
    if (b.equals("Vehicle")) {
      factory = (SearchFactory) new SearchVehicle();
    } else if (b.equals("Dealer")) {
      factory = (SearchFactory) new SearchDealer();
    } else if (b.equals("Incentive")) {
      factory = (SearchFactory) new SearchIncentive();
    } else {
      throw new NoSuchElementException();
    }
  }

  public Collection<? extends BigDataType> doSearch() {
    DataGetter curGetter = this.factory.produceDataGetter();
    Parser curParser = this.factory.produceParser();
    Sorter curSorter = this.factory.produceSorter();
    curParser.parse(this.input);
    Collection<?extends BigDataType> data = curGetter.get();
    return curSorter.sort(data);
  }
}