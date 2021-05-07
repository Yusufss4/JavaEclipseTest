public class Concert extends Event {
	
	protected String singerName;
	protected int musicType;

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
	
	void getEventDetails() {
		System.out.println("Event Name:" + eventName);
		System.out.println("Event Type:" + eventType);
		System.out.println("Singer Name:" + singerName);
	}


}
