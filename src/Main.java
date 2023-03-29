import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int day2;
        int count = 0;
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите год: ");
            int year = scanner.nextInt();
            System.out.println("Введите количество дней: ");
            int day = scanner.nextInt();
            day2 =  calcYear(year,day);
            if (day == day2){
                count++;
            } else{
                System.out.println("Неправильно! В этом году " + calcYear(year, day) + " дней!");
                System.out.println("Набрано очков: " + count);
                break;
            }
        }
    }
    public static int calcYear(int a , int b) {

        if (a % 400 == 0 || a % 400 != 0 && a % 100 != 0 && a % 4 == 0 ) {
            b = 366;
        } else if (a % 100 == 0 || a % 400 != 0 && a % 100 != 0 && a % 4 != 0 ) {
            b = 365;
        }
        return b;
    }
}