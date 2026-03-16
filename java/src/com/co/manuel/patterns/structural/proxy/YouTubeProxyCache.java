package com.co.manuel.patterns.structural.proxy;

import java.util.HashMap;

public class YouTubeProxyCache implements ThirdPartyYouTubeLib {

  private ThirdPartyYouTubeLib youtubeService;
  HashMap<String, Video> cachePopular = new HashMap<>();
  HashMap<String, Video> cacheAll = new HashMap<>();

  public YouTubeProxyCache() {
    this.youtubeService = new ThirdPartyYouTubeClass();
  }

  @Override
  public HashMap<String, Video> popularVideo() {
    if (cachePopular.isEmpty()) {
      cachePopular = youtubeService.popularVideo();
    } else {
      System.out.println("Retrieved list from cache");
    }
    return cachePopular;
  }

  @Override
  public Video getVideo(String videoId) {
    Video video = cacheAll.get(videoId);

    if (video == null) {
      video = youtubeService.getVideo(videoId);
      cacheAll.put(videoId, video);
    } else {
      System.out.println("Retrieved video " + videoId + " from cache.");
    }
    return video;
  }

}
