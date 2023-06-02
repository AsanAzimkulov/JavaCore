package testing_ground;

class SiteMap {
	   // Create SiteMap object
	   private static SiteMap instance = new SiteMap();
	   // Declare private constructor
	   // to avoid creating a class instance
	   private SiteMap(){}
	   // Get the only object available
	   public static SiteMap getInstance(){
	      return instance;
	   }
	   
	    // Declare a method
	   public void showMessage(){
	      System.out.println("My Site Map!");
	   }
	   
	   
	   
	}