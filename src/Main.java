import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // -Написать программу вводящую информацию о вас (Имя, Фамилия, Профессия)
        String nameStr = "Ilya";
        String surNameStr = "Charnitski";
        String profesionStr = "QA Engineer";
        System.out.printf("Hello my name is: %s %s,\nmy profession is: %s.", nameStr, surNameStr, profesionStr);

        //-Обьявить и проиницилизировать переменные всех известных типов и вывисти их значения
        Boolean isNotTrue = false;
        Byte byteVar = 1;
        short lowNumeric = -1545;
        int forIteration = 1;
        long bigNumeric = 3254646436464L;
        float numWithDot = 2344.34f;
        double bigNumWithDot = 214235325.2397359;
        char oneChar = 'A';
        System.out.println("Boolean var with name isNotTrue: " + isNotTrue);
        System.out.println("Byte var with name byteVar: " + byteVar);
        System.out.println("Short var with name lowNumeric: " + lowNumeric);
        for (forIteration= 1; forIteration <= 5; forIteration++) {
            System.out.println("Int var for loop, forIteration = " + forIteration);
        }
        System.out.println("Long var with name bigNumeric:  " + bigNumeric);
        System.out.println("Float var with name numWithDot: " + numWithDot);
        System.out.println("Double var with name bigNumWithDot: " + bigNumWithDot);
        System.out.println("Char var with name oneChar: " + oneChar);

        /* -Запросить на ввод строку, ввести произвольный текст и ввывести на экран результат работы
         всех рассмотренных методов работы со строками */
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter some text: ");
        StringBuffer stingFromIn = new StringBuffer();
        stingFromIn.append(scanner.nextLine());
        System.out.println("You enter this text: " + stingFromIn);
    }
}