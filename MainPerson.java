package ru.gb.java.homework1;

public class MainPerson {

    public static void main(String[] args) {
        Person person0 = new Person();
        person0.setName("Petrov Petr Petrovich");
        person0.setPosition("Director");
        person0.setEmail("petrov@mail.ru");
        person0.setPhone("89995554466");
        person0.setSalary(100000);
        person0.setAge(52);
        System.out.println(person0.toString());


        Person person1 = new Person("Ivanov Ivan Ivanovich", "tester", "ivanov@mail.ru", "89295551166", 70000, 40);
       /* Person person1 = new Person();
        person.setName("Ivanov Ivan Ivanovich");
        person.setPosition("Director");
        person.setEmail("petrov@mail.ru");
        person.setPhone("89995554466");
        person.setSalary(100000);
        person.setAge(52);*/
        System.out.println(person1.toString());

        Person person2 = new Person("Sidorov Andrey Vasilievich", "manager", "sidorov@mail.ru", "895699988550", 80000, 32);
        System.out.println(person2.toString());

        Person person3 = new Person("Kovalenko Anna Viktorovna", "developer", "kovalenko@mail.ru", "82534445522", 85000, 27);
        System.out.println(person3.toString());

        Person person4 = new Person("Vlasova Marina Yurievna", "Engineer", "vlasova@mail.ru", "82534445332", 85000, 41);
        System.out.println(person4.toString());

        Person[] persArray = new Person[5]; // ¬начале объ€вл€ем массив объектов
        persArray[0] = person0;
        persArray[1] = person1;
        persArray[2] = person2;
        persArray[3] = person3;
        persArray[4] = person4;

        System.out.println("Employees over 40 years old:");
        for (int i = 0; i < persArray.length; i++) {
              if (persArray[i].getAge() > 40) {
              System.out.println(persArray[i].toString());
            }
        }
    }
}
