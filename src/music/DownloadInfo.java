package music;

public class DownloadInfo {
	
	private String title;
	private int timesDownloaded = 1;
	
	public DownloadInfo(String title){
		this.title = title;
	}
	
	public String getTitle(){
		return title;
	}
	
	public void incrementTimesDownloaded(){
		timesDownloaded++;
	}
	
	public static void main(String[] args){
		
	}
}