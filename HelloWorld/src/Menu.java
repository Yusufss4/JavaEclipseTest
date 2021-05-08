public interface Menu {
public void addItemsToTheMenu(String menuStyle);
public void changeMenuStyle(String menuStyle);
public void getMenu();
public void getAvailableMenuStyles();
}

class ConcertMenu implements Menu {
    String appetizer;
    String beverage;
    String sandwich;
    String menuStyle;
    String[] menuStyles = {"Menu1","Menu2"};

	public void addItemsToTheMenu(String menuStyle) {
		this.menuStyle = menuStyle;
		switch (menuStyle) {
		  case "Menu1":
		    this.appetizer  ="Food1";
		    this.beverage  ="Food1";
		    this.sandwich  ="Food1";
		    break;
		  case "Menu2":
			    this.appetizer ="Food2";
			    this.beverage  ="Food2";
			    this.sandwich  ="Food2";
		    break;
		   default:
			   System.out.println("\nMenu style cant be empty."); 
		}
	}
	public void getMenu() {
		System.out.println("\nMenuStyle: "+ menuStyle);
		 System.out.println("\nAppetizer: "+ appetizer);
		 System.out.println("\nBeverage: "+ beverage);
		 System.out.println("\nSandwich: "+ sandwich); 
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
}


class WeddingMenu implements Menu {
    String appetizer;
    String beverage;
    String mainCourse;
    String side;
    String dessert;
	public void addItemsToTheMenu(String appetizer) {}
    public void getMenu() {}
    public void changeMenuStyle(String menuStyle) {}
    public void getAvailableMenuStyles() {}
}


class NormalMenu implements Menu {
    String appetizer;
    String beverage;
    String mainCourse;
    String side;
    String dessert;
    String menuStyle;
    String[] menuStyles = {"Menu1","Menu2"};
    
	public void addItemsToTheMenu(String menuStyle) {}
    public void getMenu() {}
    public void changeMenuStyle(String menuStyle) {}
    public void getAvailableMenuStyles() {}
}


