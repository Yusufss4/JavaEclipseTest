public interface Menu {
	public void addItemsToTheMenu(String menuStyle);

	public void changeMenuStyle(String menuStyle);

	public void getMenu();

	public void getAvailableMenuStyles();

	public void changePreMadeMenuStyles();
	/*
	 * Not changePreMadeMenuStyles() implemented yet. Menu style should be class to
	 * implement this.
	 */

}

class ConcertMenu implements Menu {
	private String appetizer;
	private String beverage;
	private String sandwich;
	private String menuStyle;
	private String[] menuStyles = { "Menu1", "Menu2" };

	public void addItemsToTheMenu(String menuStyle) {
		this.menuStyle = menuStyle;
		switch (menuStyle) {
		case "Menu1":
			this.appetizer = "Food1";
			this.beverage = "Food1";
			this.sandwich = "Food1";
			break;
		case "Menu2":
			this.appetizer = "Food2";
			this.beverage = "Food2";
			this.sandwich = "Food2";
			break;
		default:
			System.out.println("\nMenu style cant be empty.");
		}
	}

	public void getMenu() {
		if (menuStyle == null) {
			System.out.println("Menu is not selected.");
		} else {
			System.out.println("-- Menu Details --");
			System.out.println("MenuStyle: " + menuStyle);
			System.out.println("Appetizer: " + (appetizer == null ? "Appetizer is not selected" : appetizer));
			System.out.println("Beverage: " + (beverage == null ? "Beverage is not selected" : beverage));
			System.out.println("Sandwich: " + (sandwich == null ? "Sandwich is not selected" : sandwich));
		}

	}

	public void changeMenuStyle(String menuStyle) {
		this.menuStyle = menuStyle;
		addItemsToTheMenu(menuStyle);
	}

	public void getAvailableMenuStyles() {
		for (String i : menuStyles) {
			System.out.println(i);
		}
	}

	public void changePreMadeMenuStyles() {
	}

}

class WeddingMenu implements Menu {
	private String appetizer;
	private String beverage;
	private String mainCourse;
	private String side;
	private String dessert;
	private String menuStyle;
	private String[] menuStyles = { "Menu1", "Menu2" };


	public void addItemsToTheMenu(String menuStyle) {
		this.menuStyle = menuStyle;
		switch (menuStyle) {
		case "Menu1":
			this.appetizer = "Food1";
			this.beverage = "Food1";
			this.mainCourse = "Food1";
			this.side = "Food1";
			this.dessert = "Food1";
			break;
		case "Menu2":
			this.appetizer = "Food2";
			this.beverage = "Food2";
			this.mainCourse = "Food2";
			this.side = "Food2";
			this.dessert = "Food2";
			break;
		default:
			System.out.println("\nMenu style cant be empty.");
		}
		
	}

	public void getMenu() {
		if (menuStyle == null) {
			System.out.println("Menu is not selected.");
		} else {
			System.out.println("-- Menu Details --");
			System.out.println("MenuStyle: " + menuStyle);
			System.out.println("Appetizer: " + (appetizer == null ? "Appetizer is not selected" : appetizer));
			System.out.println("Beverage: " + (beverage == null ? "Beverage is not selected" : beverage));
			System.out.println("mainCourse: " + (mainCourse == null ? "Main Course is not selected" : mainCourse));
			System.out.println("side: " + (side == null ? "Side is not selected" : side));
			System.out.println("dessert: " + (dessert == null ? "Dessert is not selected" : dessert));
		}
	}

	public void changeMenuStyle(String menuStyle) {
		this.menuStyle = menuStyle;
		addItemsToTheMenu(menuStyle);
	}

	public void getAvailableMenuStyles() {
		for (String i : menuStyles) {
			System.out.println(i);
		}
		
	}

	public void changePreMadeMenuStyles() {
	}
}

class NormalMenu implements Menu {
	private String appetizer;
	private String beverage;
	private String mainCourse;
	private String side;
	private String dessert;
	private String menuStyle;
	private String[] menuStyles = { "Menu1", "Menu2" };

	public void addItemsToTheMenu(String menuStyle) {
		this.menuStyle = menuStyle;
		switch (menuStyle) {
		case "Menu1":
			this.appetizer = "Food1";
			this.beverage = "Food1";
			this.mainCourse = "Food1";
			this.side = "Food1";
			this.dessert = "Food1";
			break;
		case "Menu2":
			this.appetizer = "Food2";
			this.beverage = "Food2";
			this.mainCourse = "Food2";
			this.side = "Food2";
			this.dessert = "Food2";
			break;
		default:
			System.out.println("\nMenu style cant be empty.");
		}
	}

	public void getMenu() {
		if (menuStyle == null) {
			System.out.println("Menu is not selected.");
		} else {
			System.out.println("-- Menu Details --");
			System.out.println("MenuStyle: " + menuStyle);
			System.out.println("Appetizer: " + (appetizer == null ? "Appetizer is not selected" : appetizer));
			System.out.println("Beverage: " + (beverage == null ? "Beverage is not selected" : beverage));
			System.out.println("mainCourse: " + (mainCourse == null ? "Main Course is not selected" : mainCourse));
			System.out.println("side: " + (side == null ? "Side is not selected" : side));
			System.out.println("dessert: " + (dessert == null ? "Dessert is not selected" : dessert));
		}
		
	}
	
	

	public void changeMenuStyle(String menuStyle) {
		this.menuStyle = menuStyle;
		addItemsToTheMenu(menuStyle);
	}

	public void getAvailableMenuStyles() {
		for (String i : menuStyles) {
			System.out.println(i);
		}
	}

	public void changePreMadeMenuStyles() {
	}
}
