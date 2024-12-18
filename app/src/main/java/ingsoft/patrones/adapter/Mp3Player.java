package ingsoft.patrones.adapter;

public class Mp3Player implements  AdvancedMediaPlayer{
    @Override
    public String playMedia(String fileName) {
        return "Playing mp3 file. Name: " + fileName;
    }
}
