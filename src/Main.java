public class Main {
    public static void main(String[] args) {
        TemperatureConverter temperatureConverter1 = new TemperatureConverter(35, 0);
        TemperatureConverter temperatureConverter2 = new TemperatureConverter(0, 95);
        temperatureConverter1.toFahrenheit();
        temperatureConverter2.toCelsius();
        System.out.println("Degrees Fahrenheit = " + temperatureConverter1.toFahrenheit() + ", Degrees Celsius = " + temperatureConverter2.toCelsius());
    }

}