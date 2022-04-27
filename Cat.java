package ru.gb.java.homework1.catAndPlate;

public class Cat {
    private int appetite;
    private String name;
    private boolean full;

    public Cat (String name, int appetite){
        this.appetite = appetite;
        this.name = name;
        this.full = false;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(appetite);
    }
    public void eatMore(Plate plate) {
        plate.increaseFood(400);
    }

    public boolean getFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
