public abstract class Observer {
    protected double temperature;

    abstract void update(SensorSubject subject);
}
