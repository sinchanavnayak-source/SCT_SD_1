import java.util.*;

class task1 {
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double c) {
        return c + 273.15;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double fahrenheitToKelvin(double f) {
        return (f - 32) * 5 / 9 + 273.15;
    }

    public static double kelvinToCelsius(double k) {
        return k - 273.15;
    }

    public static double kelvinToFahrenheit(double k) {
        return (k - 273.15) * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit and Kelvin");
        System.out.println("2. Fahrenheit to Celsius and Kelvin");
        System.out.println("3. Kelvin to Fahrenheit and Celsius");
        System.out.print("Enter your choice (1/2/3): ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the temperature in Celsius: ");
                double c = sc.nextDouble();
                System.out.println(c + " °C = " + celsiusToFahrenheit(c) + " °F");
                System.out.println(c + " °C = " + celsiusToKelvin(c) + " K");
                break;

            case 2:
                System.out.print("Enter the temperature in Fahrenheit: ");
                double f = sc.nextDouble();
                System.out.println(f + " °F = " + fahrenheitToCelsius(f) + " °C");
                System.out.println(f + " °F = " + fahrenheitToKelvin(f) + " K");
                break;

            case 3:
                System.out.print("Enter the temperature in Kelvin: ");
                double k = sc.nextDouble();
                System.out.println(k + " K = " + kelvinToCelsius(k) + " °C");
                System.out.println(k + " K = " + kelvinToFahrenheit(k) + " °F");
                break;

            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}

