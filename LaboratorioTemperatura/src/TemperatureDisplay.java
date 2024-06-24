public class TemperatureDisplay implements Observer {
    @Override
    public void update(int temperatura) {
        System.out.println("TemperatureDisplay: La temperatura actual es " + temperatura + " grados.");
    }
}
