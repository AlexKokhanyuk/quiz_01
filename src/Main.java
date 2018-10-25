import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        Scanner scan = new Scanner(System.in);


        System.out.println("Выберите стихию: ");
        System.out.println("1 - Огонь");
        System.out.println("2 - Вода");
        System.out.println("3 - Воздух");
        System.out.println("4 - Земля");
        System.out.println("5 - Ночь");
        System.out.println("6 - Лёд");
        System.out.println("7 - Яд");
        System.out.println("8 - Не хочу выбирать, во мне сочетаются все стихии");
        System.out.println("9 - Ээээмммм... а есть стихия домашнего уюта?");


        int answ=scan.nextInt();

        switch (answ){
            case 1: user.incrThunderClan();
            break;
            default:
                System.out.println("Please enter number between 1-9");
                break;

        }


//        for (int i = 0; i < 3; i++) {
//
//
//            int number = scan.nextInt();
//
//            if (number == 1) {
//                System.out.println("Yes");
//            } else {
//                System.out.println("No? try again");
//            }
//        }

        System.out.println(user.toString());
    }
}

