public class Main {
    public static void main(String[] args) {

        // Задача 1
        var age = 25;
        System.out.println("Задача 1");

        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        };


        // Задача 2
        System.out.println("\nЗадача 2");
        var temperature = 0;

        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }


        // Задача 3
        System.out.println("\nЗадача 3");
        var speed = 62;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

    }
}

