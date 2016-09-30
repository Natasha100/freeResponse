package music;

import java.util.ArrayList;
import java.util.List;


public class MusicDownloads {
	
	private List<DownloadInfo> downloadList;
	
	public MusicDownloads(){
		downloadList = new ArrayList<DownloadInfo>(); 
	}
	
	public DownloadInfo getDownloadInfo(String title) {
		for (DownloadInfo song : downloadList){
			if (song.getTitle().equals(title)){
				//return object reference
				return song;
			}
		} return null;
		
	}
	
	public void updateDownloads(List<String> titles){
		//use method from part a
		for (String title : titles){
			DownloadInfo foundInfo = getDownloadInfo(title);
			if (foundInfo == null){
				downloadList.add(new DownloadInfo(title));
			} else {
				//interesting:
				foundInfo.incrementTimesDownloaded();
			}
		}
			
		
	}
}