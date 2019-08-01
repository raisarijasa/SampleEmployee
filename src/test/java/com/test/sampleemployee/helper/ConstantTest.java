package com.test.sampleemployee.helper;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class ConstantTest {

    @Test
    public void testConstructorIsPrivate() throws Exception {
        Constructor constructor = Constant.class.getDeclaredConstructor();
        Assert.assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }
}
