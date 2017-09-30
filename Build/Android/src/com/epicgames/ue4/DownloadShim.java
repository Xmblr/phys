package com.epicgames.ue4;

import com.KwarkGames.phys_3dperson_01.OBBDownloaderService;
import com.KwarkGames.phys_3dperson_01.DownloaderActivity;


public class DownloadShim
{
	public static OBBDownloaderService DownloaderService;
	public static DownloaderActivity DownloadActivity;
	public static Class<DownloaderActivity> GetDownloaderType() { return DownloaderActivity.class; }
}

