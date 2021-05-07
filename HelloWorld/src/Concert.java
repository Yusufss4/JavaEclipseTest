public class Concert extends Event {
	
	private String singerName;
	private int musicType;

	Concert() {
		super.eventType = 1;
	}
	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}
	
	public void setMusicType(int musicType)
	{
		this.musicType = musicType;
	}


}
