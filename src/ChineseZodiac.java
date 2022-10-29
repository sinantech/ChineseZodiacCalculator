import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        int birth,zodiac;
        System.out.print("Please Enter Your Birth Year (Only Year) : ");
        Scanner input = new Scanner(System.in);
        birth = input.nextInt();
        zodiac = (birth%12);

        switch (zodiac) {
            case 0:
                System.out.println("Chinese Zodiac : " + "Monkey" );
            break;
            case 1:
                System.out.println("Chinese Zodiac : " + "Cockerel");
            break;
            case 2:
                System.out.println("Chinese Zodiac : " + "Dog");
            break;
            case 3:
                System.out.println("Chinese Zodiac : " + "Pig");
            break;
            case 4:
                System.out.println("Chinese Zodiac : " + "Mouse");
            break;
            case 5:
                System.out.println("Chinese Zodiac : " + "Ox");
            break;
            case 6:
                System.out.println("Chinese Zodiac : " + "Tiger");
            break;
            case 7:
                System.out.println("Chinese Zodiac : " + "Rabbit");
            break;
            case 8:
                System.out.println("Chinese Zodiac : " + "Dragon");
            break;
            case 9:
                System.out.println("Chinese Zodiac : " + "Snake");
            break;
            case 10:
                System.out.println("Chinese Zodiac : " + "Horse");
            break;
            case 11:
                System.out.println("Chinese Zodiac : " + "Sheep");
            break;
        }


    }
}
