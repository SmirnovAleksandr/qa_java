package com.example;

import java.util.List;

public class Lion {
    boolean hasMane;// наличие гривы
    Feline feline; // класс кошачьих

    public Lion(String sex, Feline feline) throws Exception {
        this.feline = feline;

        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public boolean doesHaveMane() {
        return hasMane;
    }


    public int getKittens() {
        return feline.getKittens();
    } // заводим котят и получаем их кол-во

    public List<String> getFood() throws Exception {     // получаем список того что может есть Лев - "Животные", "Птицы", "Рыба"
        return feline.getFood("Хищник");
    }
}
