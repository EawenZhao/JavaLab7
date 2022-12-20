public class Lamp extends Observer {
    @Override
    public void update(SensorSubject subject) {
        this.temperature = subject.sensorTemperature;
        if (this.temperature >= 50) {
            System.out.println("报警灯亮了");
        }
    }
}
