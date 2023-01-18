package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest extends TestCase {
    @Spy
    Feline feline;

    @Test
    public void testGetSound() throws Exception {
        Cat cat = new Cat(feline);
        String expectedSound = "Мяу";
        Assert.assertEquals(expectedSound, cat.getSound());
    }

    @Test
    public void testGetFood() throws Exception  {
        Cat cat = new Cat(feline);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = cat.getFood();
        Assert.assertEquals(expected, actual);
    }
}