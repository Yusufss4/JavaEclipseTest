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
		System.out.println("\n\n-- Event Details --");
		System.out.println("Event Name:" + eventName);
		System.out.println("Event Type:" + eventType);
		System.out.println("Singer Name:" + singerName);
		System.out.println("Ticket Price:" + eventTicketPrice + "$");
		System.out.printf("Event Code: %c\n",eventCode);
		System.out.println("Event Visibilty:" + isEventVisible);
		System.out.println("Manager of the Event: " + managerOfTheEvent.getManagerFullName());
		System.out.println("");
		concertMenu.getMenu();
		System.out.println("\n-- Atendee Details --");
		super.getAtendees();
	}

}
