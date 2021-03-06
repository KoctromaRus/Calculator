import java.util.Scanner;

class Scratch {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        double numberFirst = number();
        double numberSecond = number();
        char operand = operation();
        double result = computation(numberFirst, numberSecond, operand);
        System.out.println(numberFirst + " " + operand + " " + numberSecond + "=" + result);

    }

    public static double number() {
        System.out.print("Введите число: ");
        double num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Ошибка!!! Введите число правильно!!!");
            scanner.next();
            num = number();
        }
        return num;
    }

    public static char operation() {
        System.out.print("Введите оператор: ");
        char operand;
        if (scanner.hasNext()){
            operand = scanner.next().charAt(0);
        }else {
            System.out.println("Ошибка!!! Введите правильно оператор!!!");
            scanner.next();
            operand = operation();
        }
        return operand;
    }
    private static double computation(double numberFirst, double numberSecond, char operand) {
        double result;
        switch (operand){
            case '+':
              result = numberFirst + numberSecond;
                break;
            case '-':
                result =  numberFirst - numberSecond;
                break;
            case '*':
                result = numberFirst * numberSecond;
                break;
            case '/':
                result = numberFirst / numberSecond;
                break;
            default:
                System.out.println("Оператор не найден!");
                result = computation(numberFirst, numberSecond, operation());

        }
        return result;
    }

}