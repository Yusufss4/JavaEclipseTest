public class Concert extends Event {

	protected String singerName;
	protected int musicType;
	protected ConcertMenu concertMenu = new ConcertMenu();

	Concert() {
		super.eventType = 1;
	}

	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}

	public void setMusicType(int musicType) {
		this.musicType = musicType;
	}

	public void setMenuStyle(ConcertMenu concertMenu) {
		this.concertMenu = concertMenu;
	}
	
	

	public void getEventDetails() {
		System.out.println("Event Name:" + eventName);
		System.out.println("Event Type:" + eventType);
		System.out.println("Singer Name:" + singerName);
		System.out.println("Menu Details2");
		concertMenu.getMenu();
		super.getAtendees();

	}

}
