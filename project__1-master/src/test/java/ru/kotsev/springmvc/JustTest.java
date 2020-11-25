package ru.kotsev.springmvc;

import org.junit.Assert;
import org.junit.Test;

public class JustTest {
    @Test
    public void test() {
        int x = 4;
        int y = 65;

        Assert.assertEquals(61, y - x);
    }
}
