package ru.gb.java.homework1.catAndPlate;

public class Plate {
    private int foodCount;

    public Plate (int foodCount){
        this.foodCount = foodCount;
    }

    public int getFoodCount() {
        return foodCount;
      }

    public void setFoodCount(int foodCount) {
        this.foodCount = foodCount;
    }
    public void info(){
        System.out.println("Current food amount is " + foodCount);
    }

    public void decreaseFood(int amount){
        int countFood = getFoodCount() - amount;
        if (countFood >= 0) {
            foodCount = countFood;
        }
        else {
            System.out.println("Not enough food in the plate");
        }
    }
    public void increaseFood(int amount){
        foodCount += amount;
        System.out.println(amount + " grams of feed were added to the bowl");
    }
}
