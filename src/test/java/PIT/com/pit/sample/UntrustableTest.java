package PIT.com.pit.sample;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class UntrustableTest {

  private PassFilterPredicate passFilterPredicate;
  
  @Before
  public void setUp() {
    passFilterPredicate = new PassFilterPredicate(5);
  }
  
  @Test
  public void should_pass_when_filtering_one() {
    boolean result = passFilterPredicate.filter(1);
    Assert.assertTrue(result);
  }
  
  @Test
  public void should_not_pass_when_filtering_ten() {
    boolean result = passFilterPredicate.filter(10);
    Assert.assertFalse(result);
  }
  
  @Test
  public void should_not_pass_when_filtering_five() {
    boolean result = passFilterPredicate.filter(5);
    Assert.assertFalse(result);
  }
  
  
}
