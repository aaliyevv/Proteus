package lesson18.task1;

public class GameSettings {

    private int soundVolume;
    private String difficulty;

    private GameSettings(int soundVolume, String difficulty) {
        this.soundVolume = soundVolume;
        this.difficulty = difficulty;
    }

    private static GameSettings instance;

    public static GameSettings getInstance() {
        if (instance==null){
            instance = new GameSettings(50, "Normal");
        }
        return instance;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        this.soundVolume = soundVolume;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public void displaySettings(){
        System.out.println(soundVolume);
        System.out.println(difficulty);
    }
}
