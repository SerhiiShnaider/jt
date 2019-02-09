package com.gmail.shnapi007;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalcTest {

  Calc calc;

  @BeforeTest
  public void before() {
    calc = new Calc();
  }

  @Test
  public void addTest() {
    Assert.assertEquals(calc.add(2, 2), 4, "Adding is incorrect");
  }

  @Test
  public void subtractTest() {
    Assert.assertEquals(calc.subtract(4, 2), 2, "Subtracting is incorrect");
  }

  @Test
  public void multiplyTest() {
    Assert.assertEquals(calc.multiply(2, 3), 6, "Multiplying is incorrect");
  }

  @Test
  public void divideTest() {
    Assert.assertEquals(calc.divide(6, 2), 3, "Multiplying is incorrect");
  }

}
