public class TemperatureConverter {

    private int temperatureCelsius;
    private int temperatureFahrenheit;
    private int x;
    private int y;
    private int a = 5;
    private int b = 9;
    private int c = 32;

    public TemperatureConverter(int x, int y) {
        temperatureCelsius = x;
        temperatureFahrenheit = y;
    }
    public float toFahrenheit() {
        float toFahrenheit;
        toFahrenheit = (b * temperatureCelsius + ( c * a)) / a;
        return toFahrenheit;
    }
    public float toCelsius() {
        float toCelsius;
        toCelsius = a * (temperatureFahrenheit - c) / b;
        return toCelsius;
    }
}
