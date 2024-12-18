package ingsoft.patrones.adapter;

import java.util.HashMap;
import java.util.Map;

public class AudioPlayer implements MediaPlayer {
  private Map<String, AdvancedMediaPlayer> mediaPlayers = new HashMap<>();

  public AudioPlayer() {
    this.addMediaPlayer("wav", new WavPlayer());
    this.addMediaPlayer("ogg", new OggPlayer());
    this.addMediaPlayer("mp3", new Mp3Player());
  }
  @Override
  public String play(String audioType, String fileName) {
    AdvancedMediaPlayer mediaPlayer = this.mediaPlayers.get(audioType);
    if (mediaPlayer == null) {
      return "Invalid media. " + audioType + " format not supported";
    } else {
      return mediaPlayer.playMedia(fileName);
    }
  }

  public void addMediaPlayer(String audioType, final AdvancedMediaPlayer advancedMediaPlayer) {
    this.mediaPlayers.put(audioType, advancedMediaPlayer);
  }
}
