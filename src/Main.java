public class Main {
    public static void main(String[] args) {

        // Задача 1
        var age = 25;           // Возраст
        System.out.println("Задача 1");

        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }


        // Задача 2
        System.out.println("\nЗадача 2");
        var temperature = 0;    // Температура

        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }


        // Задача 3
        System.out.println("\nЗадача 3");
        var speed = 62;         // Скорость
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }


        // Задача 4
        System.out.println("\nЗадача 4");
        int personAge = 20;     // Возраста

        if (personAge >= 2 && personAge <= 6) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в детский сад.");
        }
        if (personAge >= 7 && personAge <= 17) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в школу.");
        }
        if (personAge >= 18 && personAge <= 24) {
            System.out.println("Если возраст человека равен " + personAge + ", то его место в университете.");
        }
        if (personAge > 24) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему пора ходить на работу.");
        }


        // Задача 5
        System.out.println("\nЗадача 5");
        int     childAge = 10;          // Возраста ребенка
        boolean isParent = true;        // Наличие родителя

        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе.");
        }
        if (childAge >= 5 && childAge < 14) {
            if (isParent) {
                System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
            } else {
                System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе без сопровождения взрослого.");
            }
        }
        if (childAge >= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

        // Задача 6
        System.out.println("\nЗадача 6");
        int totalCapacity = 102;    // Общая вместимость
        int totalSeats    = 60;     // Сидячие места
        int passengers    = 95;     // Количество пассажиров

        if (passengers > totalCapacity) {
            System.out.println("Вагон полностью забит.");
        } else {
            if (passengers <= totalSeats) {
                System.out.println("В вагоне есть сидячие места.");
            } else {
                System.out.println("В вагоне есть только стоячие места.");
            }
        }

        // Задача 7
        System.out.println("\nЗадача 7");
        int one   = 11;
        int two   = 22;
        int three = 33;

        if (one > two && one > three) {
            System.out.println("Наибольшее число one = " + one);
        } else if (two > one && two > three) {
            System.out.println("Наибольшее число two = " + two);
        } else {
            System.out.println("Наибольшее число three = " + three);
        }
    }
}

