import java.util.List;

public interface DataGetter {
  List<? extends BigDataType> get();
}

class IncentiveGetter implements DataGetter{

  @Override
  public List<? extends BigDataType> get() {

    return null;
  }
}

class VehicleGetter implements DataGetter{

  @Override
  public List<? extends BigDataType> get() {

    return null;
  }
}

class DealerGetter implements DataGetter{

  @Override
  public List<? extends BigDataType> get() {

    return null;
  }
}