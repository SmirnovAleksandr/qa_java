package com.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest extends TestCase {
    @Spy
    Feline feline;

    @Test
    public void testDoesHaveManeTrue() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean expected = true;
        boolean actual = lion.hasMane;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDoesHaveManeFalse() throws Exception {
        Lion lion = new Lion("Самка", feline);
        boolean expected = false;
        boolean actual = lion.hasMane;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDoesHaveManeException() throws Exception {
        Exception exception = null;
        try {
            Lion lion = new Lion("Самко", feline);

        } catch (Exception ex) {
            exception = ex;
        }

        Assert.assertNotNull(exception);
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Integer expected = 1;
        Integer actual =  lion.getKittens();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion("Хищник", feline);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = lion.getFood();
        Assert.assertEquals(expected, actual);

    }
}