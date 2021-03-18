package Generics.Wildcards;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcards {
    private static class Animal{}
    private static class Cat extends Animal{}
    private static class RedCat extends Cat{}
    private static class Dog extends Animal{}



    public static void addCat(List<? super Cat> catList){
        RedCat c = new RedCat();
        catList.add(c);
        System.out.println("Cat added");
    }

    public static void main(String[] args){
        List<Animal> animalList = new ArrayList<>();
        List<Cat> catList = new ArrayList<>();
        List<RedCat> redCatList = new ArrayList<>();
        List<Dog> dogList = new ArrayList<>();

        /* Type: Cat */
        addCat(catList);

        /* Type: SuperType of Cat --> Animal */
        addCat(animalList);

        /* Type: Dog and RedCat aren't Cat or SuperType of Cat */
        //addCat(dogList);
        //addCat(redCatList);
    }
}
