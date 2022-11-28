package com.example;

import java.util.List;

public class AlexLion extends  Lion{

    public AlexLion(Feline feline) {
        super(feline);
    }

    public AlexLion() throws Exception {
        super("Самец");
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
