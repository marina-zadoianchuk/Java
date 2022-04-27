package ru.gb.java.homework1.catAndPlate;

public class MainApp {
    public static void main(String[] args) {

        Plate plate = new Plate(100);

        Cat[] catsArray = new Cat[5];
        catsArray[0] = new Cat("Boris", 10);
        catsArray[1] = new Cat("Vasya", 8);
        catsArray[2] = new Cat("Thomas", 15);
        catsArray[3] = new Cat("Murzik", 4);
        catsArray[4] = new Cat("Persik", 7);

        System.out.println("Time to eat for cats! In a plate: ");
        for (int i = 0; i < catsArray.length; i++) {
            plate.info(); //смотрим, сколько корма в миске
            if (plate.getFoodCount() >= catsArray[i].getAppetite()) //если корма достаточно, кот ест
            {
                catsArray[i].eat(plate);
                catsArray[i].setFull(true);
            }
            else {
                catsArray[i].setFull(false);
                catsArray[i].eatMore(plate);// добавляем корм, но кот еще не поел, статус будет false до выполнения следующего цикла

            }
            System.out.println(catsArray[i].getFull());
        }
        plate.info(); // остаток корма в миске, когда поели все коты
    }
}
