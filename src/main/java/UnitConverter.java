public class UnitConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius*9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit-32)*5/9;
    }

    public static double degreesToRadians(double degrees) {
        return (degrees * Math.PI) / 180;
    }

    public static double radiansToDegrees(double radians) {
        return (radians * 180) / Math.PI;
    }


    public static void main(String[] args) {
        double celsius = 37.5;
        double fahrenheit = 108.3;
        double degrees = 360;
        double radians = 6.2832;

        System.out.println(celsius + " Celsius is equal to " + celsiusToFahrenheit(celsius) + " Fahrenheit");
        System.out.println(fahrenheit + " Fahrenheit is equal to " + fahrenheitToCelsius(fahrenheit) + " Celsius");
        System.out.println(degrees + " degrees is equal to " + degreesToRadians(degrees) + " radians");
        System.out.println(radians + " radians is equal to " + radiansToDegrees(radians) + " degrees");
    }
}
