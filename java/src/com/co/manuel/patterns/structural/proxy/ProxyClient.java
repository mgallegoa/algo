package com.co.manuel.patterns.structural.proxy;

public class ProxyClient {

  public static void main(String[] args) {
    System.out.println("Structural patterns - Proxy pattern");
    YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
    YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeProxyCache());

    long naive = test(naiveDownloader);
    long smart = test(smartDownloader);
    System.out.println("The saved time by caching proxy: " + (naive - smart) + "ms");

  }

  public static long test(YouTubeDownloader downloader) {
    long startTime = System.currentTimeMillis();

    downloader.renderPopularVideo();
    downloader.renderVideoPage("10");
    downloader.renderPopularVideo();
    downloader.renderVideoPage("12");
    downloader.renderVideoPage("13");
    downloader.renderVideoPage("14");

    long estimateTime = System.currentTimeMillis() - startTime;
    return estimateTime;
  }
}
