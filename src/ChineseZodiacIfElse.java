import java.sql.SQLOutput;
import java.util.Scanner;

public class ChineseZodiacIfElse {
    public static void main(String[] args) {
        System.out.print("Please Enter YOur Birth Year Only : ");
        Scanner inp = new Scanner(System.in);
        int year;
        year = inp.nextInt();
        String zodiac = " ";

        if (year%12==0) {
            zodiac="Monkey";
            System.out.println("Chinese Zodiac : " + zodiac);
        } else if (year%12==1) {
            zodiac="Cockerel";
            System.out.println("Chinese Zodiac : " + zodiac);
        } else if (year%12==2) {
            zodiac="Dog";
            System.out.println("Chinese Zodiac : " + zodiac);
        } else if (year%12==3) {
            zodiac="Pig";
            System.out.println("Chinese Zodiac : " + zodiac);
        } else if (year%12==4) {
            zodiac="Mouse";
            System.out.println("Chinese Zodiac : " + zodiac);
        } else if (year%12==5) {
            zodiac="Ox";
            System.out.println("Chines Zodiac : " + zodiac);
        } else if (year%12==6) {
            zodiac="Tiger";
            System.out.println("Chinese Zodiac : " + zodiac);
        } else if (year%12==7) {
            zodiac="Rabbit";
            System.out.println("Chinese Zodiac : " + zodiac);
        } else if (year%12==8) {
            zodiac="Dragon";
            System.out.println("Chinese Zodiac : " + zodiac);
        } else if (year%12==9) {
            zodiac="Snake";
            System.out.println("Chinese Zodiac : " + zodiac);
        } else if (year%12==10) {
            zodiac="Horse";
            System.out.println("Chinese Zodiac : " + zodiac);
        } else if (year%12==11) {
            zodiac="Sheep";
            System.out.println("Chinese Zodiac : " + zodiac);
        }
    }
}
