public class WeatherWarning implements Observer {
    private static final int TEMP = 30;

    @Override
    public void update(int temperature) {
        if (temperature > TEMP) {
            System.out.println("WeatherWarning: CUIDADO, La temperatura está por arriba de: " + TEMP + " grados.");
        }
    }
}