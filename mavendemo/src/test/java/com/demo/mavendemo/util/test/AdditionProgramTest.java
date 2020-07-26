package com.demo.mavendemo.util.test;
import com.demo.mavendemo.util.AdditionProgram;
import org.junit.*;


public class AdditionProgramTest {
    /*
    @Before                       //annotations -- representation
    public void before(){
        System.out.println("I am before");       //before ma database initalize garni
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("I am before class");        //other needed item added here for test
    }
    @After
    public void after(){
        System.out.println("I am after class");    //after ma database delete garni
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("I am after class");     //other needed item deleted
    }
    */
    @Test
    public void testSum(){
        AdditionProgram add = new AdditionProgram();
        Assert.assertEquals(5,add.sum(3,2));
        Assert.assertEquals(8,add.sum(4,4));
    }
}
