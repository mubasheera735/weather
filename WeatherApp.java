import java.util.Scanner;

public class WeatherApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Simple Weather App ===");
        System.out.print("Enter city name: ");
        String city = sc.nextLine().trim().toLowerCase();

        String weatherCondition;
        int temperature;

        switch (city) {
            case "chennai":
                weatherCondition = "Sunny ☀️";
                temperature = 34;
                break;
            case "mumbai":
                weatherCondition = "Humid 🌤️";
                temperature = 32;
                break;
            case "delhi":
                weatherCondition = "Hot 🌞";
                temperature = 36;
                break;
            case "bangalore":
                weatherCondition = "Pleasant 🌦️";
                temperature = 27;
                break;
            case "hyderabad":
                weatherCondition = "Warm 🌤️";
                temperature = 30;
                break;
            default:
                weatherCondition = "Data not available 🌫️";
                temperature = 0;
        }

        System.out.println("\nWeather Report for " + capitalize(city) + ":");
        System.out.println("Condition: " + weatherCondition);
        if (temperature != 0)
            System.out.println("Temperature: " + temperature + "°C");
        else
            System.out.println("Please try another city.");

        sc.close();
    }

    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
