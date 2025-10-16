package lesson18.task3;

public class PhoneDisplay implements Observer{
    private String phoneScreen;

    public PhoneDisplay(String phoneScreen) {
        this.phoneScreen = phoneScreen;
    }

    @Override
    public void update(int temperature) {
        System.out.println(phoneScreen + ": New temperature " + temperature + " degree.");
    }
}
