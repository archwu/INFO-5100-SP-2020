public class SearchCriterion {
  String signature;
  String[] optionalSearchFilters;
  String dealerID;

  public SearchCriterion(String signature, String[] optionalSearchFilters, String dealerID){
    this.dealerID = dealerID;
    this.optionalSearchFilters = optionalSearchFilters;
    this.signature = signature;
  }
}
