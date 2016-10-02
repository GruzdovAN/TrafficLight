import java.util.Scanner;

public class TrafficLight {
    private double time;

    public void checkTrafficLight() {
        int colorGreenInterval = 3;
        int colorRedInterval = 1;
        int colorYellowInterval = 1;
        int intervalsInHour = 5;
        String colorGreen = "Зеленый";
        String colorYellow = "Желтый";
        String colorRed = "Красный";
        if (!getTimeFromUser()) {
            double getInterval = time % intervalsInHour;
            String getColorFromTrafficLight = "";
            if (getInterval >= 0 && getInterval < colorGreenInterval) {
                getColorFromTrafficLight = colorGreen;
            } else if (getInterval < colorGreenInterval + colorYellowInterval) {
                getColorFromTrafficLight = colorYellow;
            } else if (getInterval < colorGreenInterval + colorYellowInterval + colorRedInterval) {
                getColorFromTrafficLight = colorRed;
            }
            System.out.println(getColorFromTrafficLight);
        }
    }

    private boolean getTimeFromUser() {
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
            scanner.nextLine();
            if (isCorrectInputValue && time <= 0) {
                System.out.println("Введенное значние должно быть положительным числом, попробуйте еще раз!");
                isCorrectInputValue = false;
            }
        }
        return isExitProgram;
    }
}