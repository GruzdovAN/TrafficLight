/**
 * Класс для создания светофора
 */
public class TrafficLight {
    String[] colorsSignalArray;
    int[] intervalsSignalArray;

    public TrafficLight(String[] colorsSignalArray, int[] intervalsSignalArray) {
        this.colorsSignalArray = colorsSignalArray;
        this.intervalsSignalArray = intervalsSignalArray;
    }

    public void checkColorTrafficLight() {

        int intervalsInHour = countIntervalInHour();
        DataInput dataInput = new DataInput();
        if (!dataInput.getTimeFromUser()) {
            int sumInterval = 0;
            double getInterval = dataInput.getTime() % intervalsInHour;
            String getColorFromTrafficLight = "";
            for (int i = 0; i < intervalsSignalArray.length; i++) {
                sumInterval = sumInterval + intervalsSignalArray[i];
                if (getInterval < sumInterval) {
                    getColorFromTrafficLight = colorsSignalArray[i];
                    break;
                }
            }
            System.out.println(getColorFromTrafficLight);
        }
    }

    private int countIntervalInHour() {
        int intervalCount = 0;
        for (int i = 0; i < intervalsSignalArray.length; i++) {
            intervalCount = intervalCount + intervalsSignalArray[i];
        }
        return intervalCount;
    }
}