package Generics.Wildcards;

import java.util.ArrayList;
import java.util.List;


/* A list defined by List<? extends ...> can be informally thought of as read-only, but that is not a strict guarantee.*/
public class UpperBoundedWildcards {
    private static class Animal{}
    private static class Cat extends Animal { private int id = 2; }
    private static class RedCat extends Cat {}
    private static class Dog extends Animal {}



    public static void readCat(List<? extends Cat> catList){
        for(Cat c : catList){
            System.out.println(c.id);
        }
    }

    public static void main(String[] args){
        List<Animal> animalList = new ArrayList<>();
        List<Cat> catList = new ArrayList<>();
        List<RedCat> redCatList = new ArrayList<>();
        List<Dog> dogList = new ArrayList<>();

        catList.add(new Cat());
        catList.add(new Cat());

        readCat(catList);
    }
}
