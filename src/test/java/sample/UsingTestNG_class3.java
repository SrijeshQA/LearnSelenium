package sample;

import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UsingTestNG_class3 {

    @BeforeTest
    public void beforeTest(){
        System.out.println("This is beforeTest execution....");
    }

    @Test
    public void testEval1() {
        System.out.println("Test Evaluated");
    }

    @Test
    public void testEval2() {
        System.out.println("Test Evaluated");
    }

    @Test
    public void testEval3() {
        System.out.println("Test Evaluated");
    }

    @Test
    public void testEval4() {
        System.out.println("Test Evaluated");
    }

    @Test
    public void testEval5() {
        System.out.println("Test Evaluated");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("This is afterTest execution....");
    }
}