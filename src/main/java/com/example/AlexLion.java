package com.example;

import java.util.List;

public class AlexLion extends  Lion{

    public AlexLion(String sex, Feline feline) throws Exception {
        super(sex, feline);
    }

    public List<String> getFriends(){
        return  List.of("Марти", "Глория", "Мелман");
    }

    public  String getPlaceOfLiving(){
        return  "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return feline.getKittens(0);
    } // заводим котят и получаем их кол-во

}
