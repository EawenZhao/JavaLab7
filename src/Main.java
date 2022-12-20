
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Sensor sensor = new Sensor();
        sensor.addObserver(new Lamp());
        sensor.addObserver(new Alarm());
        // 模拟N次环境变化
        for (int i = 0; i < 10; i++) {
            Thread.sleep(800);
            double temp = Math.random() * 100;
            System.out.printf("第%d次温度变化，当前温度%.2f\n", i + 1, temp);
            sensor.change(temp);
        }
    }
}