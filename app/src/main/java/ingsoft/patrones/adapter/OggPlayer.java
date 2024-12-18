package ingsoft.patrones.adapter;

public class OggPlayer implements AdvancedMediaPlayer {
    @Override
    public String playMedia(String fileName) {
        return "Playing ogg file. Name: " + fileName;
    }
}
