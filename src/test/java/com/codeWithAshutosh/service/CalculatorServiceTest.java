package com.codeWithAshutosh.service;

import org.junit.*;

import javax.xml.crypto.Data;
import java.util.Date;

public class CalculatorServiceTest {

    @BeforeClass
    public static void init(){
        System.out.println("Before all test cases :");
        System.out.println("Started testing :"+new Date());
        //connection open
        //file open
    }

    @Before
    public void beforeTest(){
        System.out.println("Before each test case :");
    }

    @After
    public void afterTest(){
        System.out.println("After each test case :");
    }

    @Test
    public void addTwoNumbersTest(){
        System.out.println("test case addTwoNumbersTest");
        int actualResult = CalculatorService.addTwoNumbers(13, 12);
        int expectredResult = 25;

        Assert.assertEquals(expectredResult, actualResult);
    }

    @Test
    public void subTwoNumbersTest(){
        System.out.println("test case subTwoNumbersTest");
        int actualResult= CalculatorService.subTwoNumbers(12, 4);
        int expectedResult = 8;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void mulTwoNumbersTest(){
        System.out.println("test case mulTwoNumbersTest");
        int actualResult = CalculatorService.mulTwoNumbers(3,4);
        int expectedResult = 12;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test(timeout = 2000)
    public void divTwoNumbersTest() throws InterruptedException {

        Thread.sleep(3000);
        System.out.println("test case divTwoNumbersTest");
        int actualResult = CalculatorService.divTwoNumbers(24,3);
        int expectedResult = 8;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void sumAnyNumbersTest(){
        System.out.println("test case sumAnyNumbersTest");
        int actualResult = CalculatorService.sumAnyNumbers(1,2,3,4,5);
        int expectedResult = 15;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @AfterClass
    public static void cleanUp(){
        System.out.println("After all test cases :");
        System.out.println("End test cases :"+new Date());
        //connection close
        //file close
    }
}
