package lesson18.task1;

public class Main {
    public static void main(String[] args) {
        GameSettings settings1 = GameSettings.getInstance();
        GameSettings settings2 = GameSettings.getInstance();

        settings1.setSoundVolume(80);
        settings2.setDifficulty("Hard");
        settings2.displaySettings();

        if (settings1==settings2){
            System.out.println("Singleton was successful.");
        }

    }
}
