public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1");
        var clientOS = 1;       // 0 — iOS, 1 — Android
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Неизвестная операционная система");
        }


        // Задача 2
        System.out.println("\nЗадача 2");
        var clientDeviceYear = 2015;
        if (clientOS == 0) {            // iOS
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Неизвестная операционная система");
        }


        // Задача 3 -  Проверка, является ли год високосным
        System.out.println("\nЗадача 3");
        var year = 2021;        // Год для проверки

        if (year <= 1584) {
            System.out.println(year + " год не поддерживается (должен быть больше 1584)");
        } else if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }


        // Задача 4 - Время доставки
        System.out.println("\nЗадача 4");
        var deliveryDistance = 95;      // Дистанция до клиента
        var deliveryTime = 0;

        if (deliveryDistance <= 20) {
            deliveryTime = 1;
        } else if (deliveryDistance <= 60) {
            deliveryTime = 2;
        } else if (deliveryDistance <= 100) {
            deliveryTime = 3;
        } else {
            deliveryTime = 0;
        }

        if (deliveryTime != 0) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Доставка свыше 100 км невозможна");
        }


        // Задача 5 -  Проверка, является ли год високосным
        System.out.println("\nЗадача 5");
        var monthNumber = 12;
        String season = "";

        if (monthNumber >= 1 && monthNumber <= 12) {
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    season = "зима";
                    break;
                case 3:
                case 4:
                case 5:
                    season = "весна";
                    break;
                case 6:
                case 7:
                case 8:
                    season = "лето";
                    break;
                case 9:
                case 10:
                case 11:
                    season = "осень";
                    break;
            }
            System.out.println("Месяц с номером " + monthNumber + " принадлежит к сезону: " + season);

        } else {
            System.out.println("Номер месяца должен быть от 1 до 12");
        }
    }
}

