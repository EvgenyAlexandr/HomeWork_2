public class Main {
    public static void main(String[] args) {

        // Задание 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        PrintResult( 1,dog, cat, paper);

        // Задание 2
        dog += 4;
        cat += 4;
        paper += 4;
        PrintResult(2,dog, cat, paper);

        // Задание 3
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        PrintResult(3,dog, cat, paper);

        // Задание 4
        System.out.println("\nОтвет на задание 4");
        var friend = 19;
        System.out.println("friend = " + friend);
        friend += 2;
        System.out.println("friend = " + friend);
        friend /= 7;
        System.out.println("friend = " + friend);

        // Задание 5
        System.out.println("\nОтвет на задание 5");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog *= 10;
        System.out.println("frog = " + frog);
        frog /= 3.5;
        System.out.println("frog = " + frog);
        frog += 4;
        System.out.println("frog = " + frog);

        // Задание 6
        System.out.println("\nОтвет на задание 6");
        var Boxer1 = 78.2;
        var Boxer2 = 82.7;
        System.out.println("Общая масса 2 бойцов = " + (Boxer1 + Boxer2 ) + "кг" );
        System.out.println("Разница в весе между 2 бойцами = " + (Boxer1 - Boxer2 ) + "кг" );

        // Задание 7
        System.out.println("\nОтвет на задание 7");
        System.out.println("Остаток от деления между 2 весами = " + (Boxer2 % Boxer1) );

    }

    // Отображаем ответ на задание
    public static void PrintResult (int NomZad, double dog, double cat, int paper)
    {
        System.out.println("\nОтвет на задание " + NomZad);
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
    }
}

