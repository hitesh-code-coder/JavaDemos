package com.training.quest6;

public class Indian implements ICuisine {

	@Override
	public String[] showMenus(String type) {
		if (type.equalsIgnoreCase("starters")) {

            return new String[]{"Samosa", "Paneer Tikka"};

        } else if (type.equalsIgnoreCase("maincourse")) {

            return new String[]{"Biryani", "Dosa"};

        } else if (type.equalsIgnoreCase("desserts")) {

            return new String[]{"Gulab Jamun", "Rasmalai"};

        } else {

            return new String[]{"Invalid menu category"};
        }
    }

}
