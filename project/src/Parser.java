import java.util.List;

public interface Parser {
  public List<String> parse(String[] k);

}

class VehicleParser implements Parser {
  @Override
  public List<String> parse(String[] k) {
    return null;
  }
}

class DealerParser implements Parser {
  @Override
  public List<String> parse(String[] k) {
    return null;
  }
}

class IncentiveParser implements Parser {
  @Override
  public List<String> parse(String[] k) {
    return null;
  }
}

class Parsers {
  static Parser getParser() {
    return new IncentiveParser();
  }
}