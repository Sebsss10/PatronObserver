import java.util.ArrayList;
import java.util.List;

    public class WeatherStation implements Subject {
        private List<Observer> observers;
        private int temperatura;

        public WeatherStation() {
            observers = new ArrayList<>();
        }

        @Override
        public void addObserver(Observer observer) {
            observers.add(observer);
        }

        @Override
        public void removeObserver(Observer observer) {
            observers.remove(observer);
        }

        @Override
        public void notifyObservers() {
            for (Observer observer : observers) {
                observer.update(temperatura);
            }
        }

        public void setTemperature(int temp) {
            System.out.println("WeatherStation: Dejando la temperatura a  " + temperatura + " grados.");
            this.temperatura = temp;
            notifyObservers();
        }
    }


