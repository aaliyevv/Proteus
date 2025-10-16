package lesson18.task3;

public class Main {
    public static void main(String[] args) {


        WeatherStation weatherStation = new WeatherStation();

        PhoneDisplay phoneScreen1 = new PhoneDisplay("Phone 1");
        PhoneDisplay phoneScreen2 = new PhoneDisplay("Phone 2");

        weatherStation.addObserver(phoneScreen1);
        weatherStation.addObserver(phoneScreen2);

        weatherStation.setTemperature(23);
    }
}
