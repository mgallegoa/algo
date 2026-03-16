package com.co.manuel.patterns.structural.proxy;

import java.util.HashMap;

public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib {

  @Override
  public HashMap<String, Video> popularVideo() {
    conectToServer("http://youtube.com");
    return getRandomVideo();
  }

  @Override
  public Video getVideo(String videoId) {
    conectToServer("http://youtube.com");
    return getSomeVideo(videoId);
  }

  private int random(int min, int max) {
    return min + (int) (Math.random() * ((max - min) + 1));
  }

  private void experienceNetworkLatency() {
    int randomLatency = random(5, 10);
    try {
      for (int i = 0; i < randomLatency; i++) {
        Thread.sleep(100);

      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  private void conectToServer(String server) {
    System.out.println("Connecting to server " + server);
    experienceNetworkLatency();
    System.out.println("Connected");

  }

  private HashMap<String, Video> getRandomVideo() {
    System.out.println("Download populars...");
    experienceNetworkLatency();
    HashMap<String, Video> map = new HashMap<>();
    map.put("1", new Video("1", "Proxy Structural pattern"));
    map.put("2", new Video("2", "Proxy Structural pattern 2"));
    map.put("3", new Video("3", "Proxy Structural pattern 3"));

    System.out.println("Done!...");
    return map;
  }

  private Video getSomeVideo(String videoId) {
    System.out.println("Download video");
    experienceNetworkLatency();
    Video video = new Video(videoId, "Some video for proxy pattern");
    System.out.println("Done!");
    return video;
  }

}
