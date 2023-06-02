package testing_ground;

public class ExtendedSwitch {
  public static boolean isVowel(char c) {
	  boolean yIsVowel = true;
	  
	  boolean isVowel = switch(c) {
	  case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true;
	  case 'y', 'Y' -> {if(yIsVowel) yield true; else yield false;}
	  default -> false;
	  };
	  
	  return isVowel;
  }
}
