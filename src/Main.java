public class Main {
    public static void main(String[] args) {
        // Переменные. Урок 2 - Д/з

        // Задание 1 - Объявление переменных
        byte    valueByte   = 0;
        short   valueShort  = 0;
        int     valueInt    = 0;
        long    valueLong   = 0L;
        float   valueFloat  = 0.0F;
        double  valueDouble = 0.0D;

        System.out.println("Задача 1");
        System.out.println("Значение переменной valueByte   с типом данных Byte   = " + valueByte);
        System.out.println("Значение переменной valueShort  с типом данных Short  = " + valueShort);
        System.out.println("Значение переменной valueInt    с типом данных Int    = " + valueInt );
        System.out.println("Значение переменной valueLong   с типом данных Long   = " + valueLong);
        System.out.println("Значение переменной valueFloat  с типом данных Float  = " + valueFloat);
        System.out.println("Значение переменной valueDouble с типом данных Double = " + valueDouble);


        // Задание 2 - Инициализация переменных
        valueFloat      = 27.12F;
        valueLong       = 987678965549L;
        valueDouble     = 2.786;
        valueInt        = 569;
        valueShort      = -159;
        int valueInt2   = 27897;
        valueByte       = 67;

        System.out.println("\nЗадача 2");
        System.out.println("Вывод значений не требуется условиями задания.");


        // Задание 3 - Задача - Учителя
        System.out.println("\nЗадача 3");
        short teacher1 = 23; // ученика(оф) у Людмила Павловна
        short teacher2 = 27; // ученика(оф) у АннаСергеевна
        short teacher3 = 30; // ученика(оф) у ЕкатеринаАндреевна

        System.out.println("На каждого ученика расчитано " + 480 / (teacher1 + teacher2 + teacher3) + " листов бумаги.");

        // Задание 4 - Задача - Производительность машины.
        System.out.println("\nЗадача 4");
        short proizvoditelnoct = 16 / 2; // Производительность в минуту

        short time1 = 20;       // 20 Минут
        short time2 = 60*24;    // Сутки
        short time3 = 60*24*3;  // 3 дня
        int   time4 = 60*24*30; // Месяц = 30 дней

        System.out.println("За 20 минут машина произвела " + time1 * proizvoditelnoct + " штук бутылок.");
        System.out.println("За Сутки машина произвела " + time2 * proizvoditelnoct + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + time3 * proizvoditelnoct + " штук бутылок.");
        System.out.println("За Месяц машина произвела " + time4 * proizvoditelnoct + " штук бутылок.");


        // Задание 5 - Задача - Ремонт школы, банки с краской.
        System.out.println("\nЗадача 5");
        short danokKrackiVcego = 120; // шт. - Все банок краски.
        short banokKracki_White = 2; // шт. - Белой краски на класс
        short banokKracki_Brown = 4; // шт. - Коричневой краски на класс.
        // Находим количество классов
        short symClasses = (short) (danokKrackiVcego / (banokKracki_White + banokKracki_Brown));
        System.out.println("В школе, где " + symClasses + " классов, нужно " + banokKracki_White * symClasses + " шт банок Белой краски и " + banokKracki_Brown * symClasses +" шт банок Коричневой краски");



    }
}

