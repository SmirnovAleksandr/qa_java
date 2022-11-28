package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    @Test
    public void eatMeatTest() throws Exception {
          Feline feline = new Feline();
          List<String> actual = feline.eatMeat();
          List<String> expected = List.of("Животные", "Птицы", "Рыба");
          Assert.assertEquals(expected, actual);
    }

    @Test
    public void getKittensTest() throws Exception {
        Feline feline = new Feline();
        Integer actual = feline.getKittens(3);
        Integer expected = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCatsFamilyTest() throws Exception {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumbersOfKittensTest() throws Exception {
        Feline feline = new Feline();
        Integer actual = feline.getKittens();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }


}
