package com.co.manuel.patterns.structural.proxy;

import java.util.Map;

public class YouTubeDownloader {
  private ThirdPartyYouTubeLib api;

  public YouTubeDownloader(ThirdPartyYouTubeLib api) {
    this.api = api;
  }

  public void renderVideoPage(String videoId) {
    Video video = api.getVideo(videoId);
    System.out.println("----- Video Page -------");
    System.out.println("ID " + video.id);
    System.out.println("Title " + video.title);
    System.out.println("-----------------------");
  }

  public void renderPopularVideo() {
    Map<String, Video> list = api.popularVideo();
    System.out.println("------------ popular videos -----------");
    for (Video video : list.values()) {
      System.out.println("Id: " + video.id + ", title: " + video.title);
    }
    System.out.println("-----------------------");
  }

}
