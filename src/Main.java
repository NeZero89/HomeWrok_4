import com.sun.source.tree.IfTree;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();


    }

    public static void task1() {
        System.out.println("Задача №1");
        int age = 17;
        System.out.println("если возраст человека равен " + age + "лет, то");
        if (age >= 18) {
            System.out.println("он совершеннолетний");
        } else {
            System.out.println("он не достиг совершенолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача №2");
        int outTemp = 4;
        System.out.println("На улице " + outTemp + " градусов");
        if (outTemp >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        if (outTemp < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }

    }

    public static void task3() {
        System.out.println("Задача №3");
        int speed = 90;
        System.out.println("Если скорость " + speed + " то");
        if (speed > 60) {
            System.out.println("Придется заплатить штраф");
        }
        if (speed <= 60) {
            System.out.println("можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача №4");
        int age = 10;
        System.out.println("Если возраст человека равен " + age + ", то");
        if (age >= 2 && age <= 6) {
            System.out.println("ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("ему нужно ходить в школу");
        } else if (age > 18 && age <= 24) {
            System.out.println("его место в университете");
        } else if (age > 24) {
            System.out.println("ему пора ходить на работу");
        }
    }

    public static void task5() {
        System.out.println("Задача №5");
        int childrenAge = 20;
        System.out.println("Если возраст ребенка " + childrenAge + ", то ему");
        if (childrenAge < 5) {
            System.out.println("нельзя кататься на атракционе.");

        } else if (childrenAge >= 5 && childrenAge < 14) {
            System.out.println("можно кататься только в сопровождении взрослого");
        } else if (childrenAge >= 14) {
            System.out.println("можно кататься без сопровождения взрослого");


        }

    }

    public static void task6() {
        System.out.println("Задача №6");
        int totalPlace = 102;
        int passenger = 100;
        int sitPlase = (60 - passenger);
        int standingPlase = 42;
        System.out.println("При посадке " + passenger + " пассажиров");
        if (passenger >= totalPlace) {
            System.out.println("в вагоне больше нет свободных мест");
        } else if (sitPlase >= 1) {
            System.out.println("в вагоне осталось " + sitPlase + " сидячих мест и 42 стоячих места");
        } else if (sitPlase < 1) {
            System.out.println("в вагоне осталось 0 сидячих мест и " + (standingPlase + sitPlase) + "стоячих мест"
            );
        }

    }

    public static void task7() {
        System.out.println("Задача №7");
        int one = 5;
        int two = 1;
        int three = 64;
        System.out.println("из представленных чисел "+one+","+two+","+three);
        if (one > two && one > three){
            System.out.println("наибольшее " + one);}
        else if (two>one&&two>three){
                System.out.println("наибольшее " + two);}
        else if(three>one&&three>two) {System.out.println("наибольшее "+three);

        }
    }
}








