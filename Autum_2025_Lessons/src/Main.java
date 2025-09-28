import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        example_with_if();
        example_with_while();
        example_with_for();
        emaple_4();
    }

    public static void example_with_if() {
        int score = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Please enter your score:");
            score = scanner.nextInt();
            if (score < 0 || score > 100) {
                System.out.println("Entered wrong score try again!.");
                scanner.nextLine();
            }
        } while (score < 0 || score > 100);
        if (score>= 90) {
            System.out.println("You grade is A!");
        } else if (score >= 80) {
            System.out.println("You grade is B!");
        } else if (score >= 70) {
            System.out.println("You grade is C!");
        } else if (score >= 60) {
            System.out.println("You grade is D!");
        } else if (score >= 50) {
            System.out.println("You grade is E!");
        } else  {
            System.out.println("You grade is F!");
        }
    }

    public static void example_with_while() {
        String userInput = " ";
        Scanner scanner = new Scanner(System.in);
        while (!userInput.equalsIgnoreCase("exit")) {
            System.out.print("Please enter something: ");
            userInput = scanner.nextLine();
            if (userInput.isEmpty()) {
               System.out.println("You've entered nothing, for quit type 'Exit'");
            } else {
                System.out.println("You've entered: " + userInput);
            }
        }
        System.out.println("Bye, you are enter " + userInput);
    }
    
    public static void example_with_for() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a namber: ");
        int x = scanner.nextInt();
        int mod_x = Math.abs(x);
        int sum = 0;
        for (int i = 0; i <= mod_x; i++) {
            sum += i;
        }
        if (x < 0) {
            sum = -sum;
        }
        System.out.printf("The sum of all numbers from 0 to %d is %d\n", x, sum);
    }

    public static void emaple_4() {
        int num_of_chanel = 0;
        Scanner scanner = new Scanner(System.in);
        String[] nameOfChanel = {" ",
        "1. Беларусь 1",
        "2. ОНТ",
        "3. СТВ",
        "4. Беларусь 2",
        "5. РТР Беларусь",
        "6. НТВ Беларусь",
        "7. Cinema",
        "8. Комедия ТВ",
        "9. Мир",
        "10. ТВ3",
        "11. ",
        "12. РБК ТВ",
        "13. Euronews",
        "14. ",
        "15. Дом Кино",
        "16. НТВ+ Кино Плюс",
        "17. Наше любимое кино",
        "18. ",
        "19. ",
        "20. Nickelodeon HD",
        "21. CBS Drama",
        "22. Карусель",
        "23. TiJi",
        "24. Мультимания",
        "25. National Geographic Channel ",
        "26. EuroSportNews",
        "27. ",
        "28. Da Vinci Learning",
        "29. TLC",
        "30. ",
        "31. Travel Channel",
        "32. Телекафе",
        "33. Культура",
        "34. ",
        "35. Охота и рыбалка",
        "36. Усадьба",
        "37. Eurosport",
        "38. Eurosport 2",
        "39. Музыка Первого",
        "40. ТРО",
        "41. ВТВ",
        "42. БелМузТв",
        "43. Шансон ТВ",
        "44. MTV Europe",
        "45. VH1",
        "46. MCM Top",
        "47. Mezzo",
        "48. Ностальгия",
        "49. Кухня ТВ",
        "50. Драйв",
        "51. Союз",
        "52. Еврокино",
        "53. S-TV",
        "54. Русская ночь",
        "55. ",
        "56. BBC Entertainment",
        "57. Наше кино",
        "58. Наше новое кино",
        "59. Кинохит",
        "60. Премьера",
        "61. Жест",
        "62. Феникс+Кино",
        "63. TV XXI",
        "64. Extreme Sports Channel",
        "65. Боец",
        "66. НТВ+ Наш Футбол",
        "67. KHL TV Channel",
        "68. JimJam",
        "69. Cartoon Network",
        "70. Мать и дитя",
        "71. Nickelodeon",
        "72. Boomerang",
        "73. ",
        "74. Investigation Discovery",
        "75. Моя Планета",
        "76. Gulli",
        "77. Время",
        "78. ",
        "79. ",
        "80. 24 Техно",
        "81. Nat Geo Wild",
        "82. CCTV News",
        "83. CCTV International Russian",
        "84. France 24(English)",
        "85. France 24(Francais)",
        "86. Europa Plus",
        "87. Travel Channel HD",
        "88. Eurosport HD",
        "89. National Geographic HD",
        "90. Test",
        "91. Психология 21",
        "92. Paramount Comedy",
        "93. Радость моя",
        "94. Life HD",
        "95. Беларусь 3",
        "96.     ",
        "97. 8 канал",
        "98. Беларусь 5",
        "99. Здоровое ТВ"};
        do {
            System.out.print("Please enter nuber of chanel: ");
            num_of_chanel = scanner.nextInt();
            scanner.nextLine();
            if (num_of_chanel > 0 && num_of_chanel < 100) {
                System.out.printf("Number of chanel is: %s\n", nameOfChanel[num_of_chanel]);
            } else if (num_of_chanel == 0) {
                System.out.println("Bye power is Off");
            } else  {
                System.out.println("You enter wrong chanel. Try again letter");
            }
        } while (num_of_chanel != 0);
    }
}