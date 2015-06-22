package project_hero;

public class Menu {

	public String[] getMenu() {
		String menu[] = new String[5];
		
		if (Hero.loc == Location.HOME_TOWN) {
			menu[0] = "shop";
			menu[1] = "wooded trail 01";
			menu[2] = "wooded path 01";

		}
		if (Hero.loc == Location.WOODED_TRAIL_01) {
			menu[0] = "fight";
			menu[1] = "home town";
			menu[2] = "forest shrine";

		}
		if (Hero.loc == Location.WOODED_TRAIL_02) {

		}
		if (Hero.loc == Location.FOREST_SHRINE) {

		}
		if (Hero.loc == Location.ANIMAL_TRAIL_01) {

		}
		if (Hero.loc == Location.ANIMAL_TRAIL_02) {

		}
		if (Hero.loc == Location.CAVE) {
			menu[0] = "fight";
			menu[1] = "animal trail 01";
			menu[2] = "animal trail 02";
		}
		if (Hero.loc == Location.WOODED_PATH_01) {
			menu[0] = "fight";
			menu[1] = "home town";
			menu[2] = "bridge";

		}		
		if (Hero.loc == Location.WOODED_PATH_02) {
			menu[0] = "fight";
			menu[1] = "bridge";
			menu[2] = "waytown";
		}
		if (Hero.loc == Location.BRIDGE) {
			menu[0] = "fight";
			menu[1] = "wooded path 01";
			menu[2] = "wooded path 02";

		}
		if (Hero.loc == Location.WAYTOWN) {
			menu[0] = "shop";
			menu[1] = "wooded path 02";
			menu[2] = "wooded trail 02";
		}
		if (Hero.loc == Location.WATERFALL) {
			menu[0] = "fight";
			menu[1] = "wooded path 01";
			menu[2] = "wooded path 02";
		}
		return menu;
		
		// public void map(){
			// home town ---	wt01	----	forest shrine
			//    |									|
			// wp01								at01
			//    |									|
			// bridge							cave
			//    |									|
			// wp02								at02
			//    |									|
			// waytown	----	wt02	-----	waterfall
		// }
		
	}

}
