package ru.gb.java.homework1.animals;

public class MainAnimal {
    public static void main(String[] args) {
    Cat cat = new Cat("Barsik", 250, 10);
    Dog dog = new Dog("Sharik", -3, 3);
    Cat cat1 = new Cat("Murzik", -10, 0);
    Dog dog1 = new Dog("Bobik", 550, 15);

    System.out.println(cat.toString());
    System.out.println(dog.toString());
    System.out.println(cat1.toString());
    System.out.println(dog1.toString());
    }

}
