public class Main {
    public static void main(String[] args) {
        String[] colorsSignalArray = new String[]{"Зеленый", "Желтый", "Красный"};
        int[] intervalsSignalArray = new int[]{3, 1, 1};
        TrafficLight trafficLight = new TrafficLight(colorsSignalArray,intervalsSignalArray);
        trafficLight.checkColorTrafficLight();
    }
}
