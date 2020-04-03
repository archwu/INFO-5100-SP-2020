import java.util.Collection;

public interface Sorter {
  Collection<? extends BigDataType> sort(Collection<? extends BigDataType> in);
}

class DealerSorter implements Sorter {

  @Override
  public Collection<? extends BigDataType> sort(Collection<? extends BigDataType> in) {
    return null;
  }
}

class VehicleSorter implements Sorter {


  @Override
  public Collection<? extends BigDataType> sort(Collection<? extends BigDataType> in) {
    return null;
  }
}

class IncentiveSorter implements Sorter {
  @Override
  public Collection<? extends BigDataType> sort(Collection<? extends BigDataType> in) {
    return null;
  }
}