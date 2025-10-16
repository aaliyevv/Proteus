package lesson18.task1Review;

public class GameSettings {

    private int soundVolume;
    private String difficulty;

    private static GameSettings instance;

    public GameSettings() {
        soundVolume = 50;
        difficulty = "Normal";
    }

    public static GameSettings getInstance(){
        if (instance == null){
            instance = new GameSettings();
        }
        return instance;
    }

    public void setSoundVolume(int soundVolume) {
        this.soundVolume = soundVolume;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void displaySettings() {
        System.out.println("Difficulty: " + difficulty +"\nSoundVolume: " + soundVolume);
    }
}
