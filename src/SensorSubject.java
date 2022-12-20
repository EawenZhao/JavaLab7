import java.util.List;
import java.util.Vector;

public abstract class SensorSubject {
    protected double sensorTemperature;
    List<Observer> OBSERVERS = new Vector<Observer>();

    abstract void addObserver(Observer observer);

    abstract void removeObserver(Observer observer);

    abstract void notifyObservers();

    abstract void change(double temperature);

}
