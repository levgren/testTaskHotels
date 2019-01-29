import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        //Получить от пользователя на вход число
        System.out.print("Пользователь, введите любое целое число: ");
        Scanner scan = new Scanner(System.in);     //объявляю сканнер для ввода из консоли
        int number = scan.nextInt();
        System.out.println("Пользователь ввел число " + number);

        //массив чисел фибоначчи
        int[] masFib = new int[21];     //инициализация массива
        for (int i = 0; i < masFib.length; i++) {
            if (i < 2) {
                masFib[i] = 1;
            } else {
                masFib[i] = masFib[i - 2] + masFib[i - 1];
            }
            System.out.print(masFib[i] + " ");
        }
        System.out.println();

        // Сгенерировать два случайных числа
        int x = 0;
        int y = 100;
        int number1 = x + (int) (Math.random() * y); // Генерация 1-го числа
        System.out.println("1-ое случайное число: " + number1);
        int number2 = x + (int) (Math.random() * y); // Генерация 2-го числа
        System.out.println("2-ое случайное число: " + number2);

        //получение суммы чисел массива
        int hotelsArr[] = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        int sum = 0;
        for (int i = 0; i < hotelsArr.length; i++) {
            sum = sum + hotelsArr[i];
        }
        System.out.println("Сумма всех чиселмассива= " + sum);




    }
}


