import java.util.NoSuchElementException;

interface SearchFactory {
  public Parser produceParser();

  public DataGetter produceDataGetter();

  public Sorter produceSorter();
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
  SearchFactory factory;

  public Search(String[] a, String b) {
    if (b.equals("Vehicle")) {
      factory = (SearchFactory) new SearchVehicle();
    } else if (b.equals("Dealer")) {
      factory = (SearchFactory) new SearchDealer();
    } else if (b.equals("Incentive")){
      factory = (SearchFactory) new SearchIncentive();
    } else {
      throw new NoSuchElementException();
    }
  }
}