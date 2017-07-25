package PIT.com.pit.sample;

public class PassFilterPredicate {
  
  private int limit;
  
  public PassFilterPredicate(int limit) {
    this.limit = limit;
  }
  
  public boolean filter(int i) {
    return i < limit;
  }

}
