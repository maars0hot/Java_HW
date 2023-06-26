package HW_1_seminar;
// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n),
//  n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class HW_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number:");
        String str = scanner.nextLine();
        int number = Integer.parseInt(str);
        System.out.println("Сумма чисел: "+summa(number));
        System.out.println("Произведение чисел: "+multiplication(number));
        scanner.close();
    }
    static int summa(int n) {
        int i = 1;
        int result=1;
        while (i != n) {
            i++;
            result=result+i;

            
        }
        return result;
    }    
    static int multiplication(int n) {
        int i = 1;
        int result=1;
        while (i != n) {
            i++;
            result=result*i;
        }
        return result;
    }    
}
