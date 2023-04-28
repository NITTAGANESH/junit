package com.code.junit;

import org.junit.Assert;
import org.junit.Test;

public class MyTestClassTest {
    
    @Test
    public void testDoSomethingWithParam1TwoAndParam2Five() {
        MyTestClass myTestClass = new MyTestClass();
        int result = myTestClass.doSomething("2", 5);
        Assert.assertEquals(5, result);
    }
    
    @Test
    public void testDoSomethingWithParam1FourAndParam2Fifteen() {
        MyTestClass myTestClass = new MyTestClass();
        int result = myTestClass.doSomething("4", 15);
        Assert.assertEquals(4, result);
    }
}





