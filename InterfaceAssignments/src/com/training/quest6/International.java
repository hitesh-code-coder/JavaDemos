package com.training.quest6;

public class International implements ICuisine {

	@Override
	public String[] showMenus(String type) {
		 if (type.equalsIgnoreCase("starters")) {
	            return new String[]{"Bruschetta", "Garlic Bread"};

	        } else if (type.equalsIgnoreCase("maincourse")) {
	            return new String[]{"Pasta", "Pizza"};

	        } else if (type.equalsIgnoreCase("desserts")) {
	            return new String[]{"Tiramisu", "Cheesecake"};

	        } else {
	            return new String[]{"Invalid menu category"};
	        }
	    }

}
