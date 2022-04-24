package ru.gb.java.homework1.animals;

public class Cat extends Animal{
    public Cat(String name, int run, int swim) {
        super(name, run, swim);
        }

    @Override
    public String toString() {
        String catInfo;
        String catRun;
        String catSwim;
        if (getRun() > 200) {
            catRun = (getName() + " cannot run more than 200 m ");
        }
        else {
            catRun = (getName() + " run " + getRun() + " m ");
        }
        if (getSwim() >= 0) {
            catSwim = ("and can't swim");
        }
        else {
            catSwim = ("and swim " + getSwim() + " m") ;
        }
        catInfo = (catRun + catSwim);
        return catInfo;
    }


}

