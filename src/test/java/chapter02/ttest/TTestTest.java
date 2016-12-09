package chapter02.ttest;

import org.apache.commons.math3.stat.inference.TTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TTestTest {

  @Test
  public void test() throws Exception {
    // setup
    double[] baseline = {1.0, 0.8, 1.2};
    double[] sample = {0.5, 1.25, 0.5};
    TTest ttest = new TTest();

    // exec
    double pValue = ttest.tTest(baseline, sample);

    // assertion
    assertThat(pValue).isEqualTo(0.43483185200434427);
  }

}
