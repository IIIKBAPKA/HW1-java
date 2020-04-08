import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        task_1();
        task_2();
        task_3();
        task_4();
        task_5();
    }

    //Задание 1. Найти максимум из трёх чисел
    static void task_1() {
        System.out.println("Задание 1. Найти максимум из трёх чисел");
        System.out.println("\tВведите три числа через запятую, чтобы узнать самое большое из них(Например: 4,5,9)");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        String[] num = number.split(",");
        try {
            int a = Integer.parseInt(num[0]);
            int b = Integer.parseInt(num[1]);
            int c = Integer.parseInt(num[2]);
            if ((a > b) && (a > c)) {
                System.out.println("\tСамое большое значение имеет число: " + a);
            } else if ((b > a) && (b > c)) {
                System.out.println("\tСамое большое значение имеет число: " + b);
            }
            else if ((c>a)&&(c>b)){
                System.out.println("\tСамое большое значение имеет число: "+c);
            }
            else {
                System.out.println("\tВсе числа равны и имеют значение: " + c);
            }
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException t) {
            System.out.println("Вы ввели неккоректные данные");
        }
    }

    //Задание 2. Дано 2 числа типа String и вернуть их сумму тоже в String
    static void task_2() {
        System.out.println("\nЗадание 2. Дано 2 числа типа String и вернуть их сумму тоже в String");
        System.out.println("\tВведите два числа(через пробел), чтобы получить их сумму(Например: 5 10)");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        String[] num = number.split(" ");
        try {
            int a = Integer.parseInt(num[0]);
            int b = Integer.parseInt(num[1]);
            int sum = a + b;
            String summ = Integer.toString(sum);
            System.out.println(summ);
        } catch (NumberFormatException t) {
            System.out.println("Вы ввели неккоректные данные");
        }
    }

    //Задание 3. Определить четное или нечетное число. Если четное вывести true, а если нечетное false
    static void task_3() {
        System.out.println("\nЗадание 3. Определить четное или нечетное число. Если четное вывести true, а если нечетное false");
        System.out.println("\tВведите любое число, чтобы узнать четное оно или нет");
        try {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            if (a > 0) {
                boolean b = (a % 2 == 0);
                System.out.println("\t" + b);
            } else {
                System.out.println("Число не может быть отрицательным");
            }
        } catch (NumberFormatException | InputMismatchException N) {
            System.out.println("Вы ввели неккоректные данные");
        }
    }

    //Задание 4. Есть 2 стороны параллелограмма. Найти площадь параллелограмма
    static void task_4() {
        System.out.println("\nЗадание 4. Есть 2 стороны параллелограмма. Найти площадь параллелограмма");
        System.out.println("\tВведите соответствующее число: \n\t\t1-Известна основа и высота\n\t\t2-Известна сторона,основа и угол между ними\n\t\t3-Если известна только сторона и основа(будет выбран угол по умолчанию 60 градусов)");
        Scanner scanner = new Scanner(System.in);
        try {
            int variable = scanner.nextInt();
            if (variable == 1) {
                System.out.println("Введите (в сантиметрах) основу, а затем через запятую висоту(Например:10,5)");
                Scanner scan = new Scanner(System.in);
                String params = scan.nextLine();
                String[] num = params.split(",");
                int a = Integer.parseInt(num[0]);
                int b = Integer.parseInt(num[1]);
                int square = a * b;
                System.out.println("Площадь Вашего параллелограмма равна: " + square);
            } else if (variable == 2) {
                System.out.println("Введите (в сантиметрах) основу, а затем через запятую сторону и градус угла между ними(Например:10,5,60)");
                Scanner scan = new Scanner(System.in);
                String params = scan.nextLine();
                String[] num = params.split(",");
                double a = Double.parseDouble(num[0]);
                double b = Double.parseDouble(num[1]);
                double c = Double.parseDouble(num[2]);
                double sin = Math.toRadians(c);
                double square = a * b * Math.sin(sin);
                System.out.printf("Площадь Вашего параллелограмма равна: %.2f", square);
            } else if (variable == 3) {
                System.out.println("Введите основу, а затем сторону через запятую(Например: 10,5)(будет выбран угол по умолчанию 60 градусов)");
                Scanner scan = new Scanner(System.in);
                String params = scan.nextLine();
                String[] num = params.split(",");
                double a = Double.parseDouble(num[0]);
                double b = Double.parseDouble(num[1]);
                double sin = Math.toRadians(60);
                double square = a * b * Math.sin(sin);
                System.out.printf("Площадь Вашего параллелограмма равна: %.2f", square);
            }
        } catch (NumberFormatException | InputMismatchException N) {
            System.out.println("Вы ввели неккоректные данные");
        }
    }

    //Задание 5. Есть 3 стороны треугольника. Найти площадь треугольника
    static void task_5() {
        System.out.println("\nЗадание 5. Есть 3 стороны треугольника. Найти площадь треугольника");
        System.out.println("\tВведите три числа через запятую, чтобы получить площадь треугольника(Например: 4,5,9)");
        Scanner scanner = new Scanner(System.in);
        try {
            String number = scanner.nextLine();
            scanner.close();
            String[] num = number.split(",");
            double a = Double.parseDouble(num[0]);
            double b = Double.parseDouble(num[1]);
            double c = Double.parseDouble(num[2]);
            if ((a + b > c) && (a + c > b) && (b + c > a) && (a > 0) && (b > 0) && (c > 0)) {
                double p = (a + b + c) / 2;
                double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.printf("Площадь Вашего треугольника равна: %.2f", square);
            } else {
                System.out.println("Такого треугольника не существует(сумма любых двух сторон в треугольнике больше чем третья)");
            }
        } catch (NumberFormatException | InputMismatchException | ArrayIndexOutOfBoundsException N) {
            System.out.println("Вы ввели неккоректные данные");
        }
    }
}