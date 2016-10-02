import java.util.Scanner;

/**
 * Получение минут, прошедших с начала часа, от пользователя
 */
public class DataInput {
    private double time;

    public double getTime() {
        return time;
    }

    public boolean getTimeFromUser() {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectInputValue = false;
        boolean isExitProgram = false;
        String symbolForExit = "q";
        System.out.println("Для определения текущего цвета светофора, введите минуты, прошедшие с начала часа.");
        System.out.println("Для прекращения работы программы введите " + symbolForExit);
        while (!isCorrectInputValue) {
            if (scanner.hasNextDouble()) {
                time = scanner.nextDouble();
                isCorrectInputValue = true;
            } else if ((scanner.nextLine().equals(symbolForExit))) {
                isExitProgram = true;
                break;
            } else {
                System.out.println("Введенное значение не является числом, попробуйте еще раз!");
            }
            if (isCorrectInputValue && time <= 0) {
                System.out.println("Введенное значние должно быть положительным числом, попробуйте еще раз!");
                isCorrectInputValue = false;
            }
        }
        return isExitProgram;
    }
}