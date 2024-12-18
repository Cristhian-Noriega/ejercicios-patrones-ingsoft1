package ingsoft.patrones.adapter;

public class WavPlayer implements AdvancedMediaPlayer {
  @Override
  public String playMedia(String fileName) {
    return "Playing wav file. Name: " + fileName;
  }
}
