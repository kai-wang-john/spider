package com.base.test;


import com.com.spider.downloader.DownloadManager;
import com.com.spider.downloader.Downloader;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by kai.wang on 12/26/13.
 */
public class DownloaderTest {
	public static void main(String args[]) throws MalformedURLException {
//		Downloader downloader = new D
		URL url = new URL("https://www.google.com.hk/logos/doodles/2013/holiday-series-2013-3-4504416610680832-res.png");
		Downloader download = DownloadManager.getInstance().createDownload(url, "a.png", "/");
		download.run();
	}
}
