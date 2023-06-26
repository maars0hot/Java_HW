package HW_1_seminar;
import java.util.Scanner;

public class HW_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int num_a=scan.nextInt();
        System.out.println("Выберите операцию + - * /:");
        char operation;
        operation=scan.next().charAt(0);
        System.out.println("Введите второе число:");
        int num_b=scan.nextInt();
        int res;
        switch (operation) {
            case '+':
                res=num_a+num_b;
                System.out.printf("Результат: " + res + " | " );
                break;
            case '-':
                res=num_a-num_b;
                System.out.printf("Результат: "+res + " | ");
                break;
            case '*':
                res=num_a*num_b;
                System.out.printf("Результат: " + res + " | " );
                break;
            case '/':
                res=num_a/num_b;
                System.out.printf("Результат: " + res +" | " );
                break;
        }
        scan.close();
    }
}
