package sample;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.ThreadPoolExecutor;

public class UsingTestNG_class2 {

    @Test(priority = 1, groups = {"P1"})
    public void testCheck1() {
        System.out.println("Test Executed for 1 - P1");
    }

    @Test(priority = 0, groups = {"P2"}, dependsOnGroups = {"P1"})
    public void testCheck2() {
        System.out.println("Test Executed for 2 - P2");
    }

    @Test(priority = 2, groups = {"P3"})
    public void testCheck3() {
        System.out.println("Test Executed for 3 - P3");
    }

    @Test(groups = {"P1"}, dependsOnMethods = "testCheck5")
    public void testCheck4() {
        System.out.println("Test Executed for 4 - P1");
    }

    @Test(groups = {"P1"}, invocationCount = 3, threadPoolSize = 3)
    public void testCheck5() {
        System.out.println("Test Executed for 5 - P1 ----->  InvocationCount is 3");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideByZero() {
        int result = 10 / 0;
    }

    @Test
    public void testHardAssert() {
        Assert.assertEquals(true, true);
    }

    @Test
    public void testSoftAssert() {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(true, false);
        System.out.println("Soft Asserted Done.. But didnt fail");
        soft.assertAll();
    }
}