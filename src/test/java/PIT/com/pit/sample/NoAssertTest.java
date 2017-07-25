package PIT.com.pit.sample;

import org.junit.Before;
import org.junit.Test;

public class NoAssertTest {

  private PassFilterPredicate passFilterPredicate;
  
  @Before
  public void setUp() {
    passFilterPredicate = new PassFilterPredicate(5);
  }
  
  @Test
  public void should_pass_when_filtering_one() {
    passFilterPredicate.filter(1);
  }
  
  @Test
  public void should_not_pass_when_filtering_ten() {
    passFilterPredicate.filter(10);
  }
  
}
