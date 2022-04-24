package ru.gb.java.homework1.animals;

public abstract class Animal {
    private String name;
    private int run;
    private int swim;

    public Animal(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRun() {
        if (run >= 0) {
            return run;
        }
         return 0;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwim() {
        if (swim >= 0){
        return swim;
          }
        return 0;
    }

    public void setSwim(int swim) {
        this.swim = swim;
       }
    public abstract String toString();
}
