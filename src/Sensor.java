
public class Sensor extends SensorSubject {

    @Override
    public void addObserver(Observer observer) {
        OBSERVERS.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        OBSERVERS.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : OBSERVERS) {
            observer.update(this);
        }
    }

    @Override
    public void change(double temperature) {
        this.sensorTemperature = temperature;
        this.notifyObservers();
    }


}
