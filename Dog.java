package ru.gb.java.homework1.animals;

public class Dog extends Animal{

    public Dog(String name, int run, int swim) {
        super(name, run, swim);
    }
        @Override
        public String toString() {
            String dogInfo;
            String dogRun;
            String dogSwim;
            if (getRun() > 500) {
                dogRun = (getName() + " cannot run more than 500 m ");
            }
            else {
                dogRun = (getName() + " run " + getRun() + " m ");
            }
            if (getSwim() > 10) {
                dogSwim = ("and can't swim distance more than 10 m");
            }
            else {
                dogSwim = ("and swim " + getSwim() + " m") ;
            }
            dogInfo = (dogRun + dogSwim);
            return dogInfo;
        }
    }