package Design_Pattern.Creational_Patterns.Prototype.view;

import Design_Pattern.Creational_Patterns.Prototype.contract.PrototypeCapable;
import Design_Pattern.Creational_Patterns.Prototype.model.Album;
import Design_Pattern.Creational_Patterns.Prototype.model.Movie;
import Design_Pattern.Creational_Patterns.Prototype.model.Show;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
  
  public static class ModelType {
	
	public static final String MOVIE = "movie";
	public static final String ALBUM = "album";
	public static final String SHOW = "show";
	
	
  }
  
  private static Map<String, PrototypeCapable> capableMap = new HashMap<>();
  
  static {
	
	capableMap.put(ModelType.ALBUM, new Album());
	capableMap.put(ModelType.MOVIE, new Movie());
	capableMap.put(ModelType.SHOW, new Show());
	
  }
  
  
  public static PrototypeCapable getInsatnce(final String str)
		  throws CloneNotSupportedException {
	
	return capableMap.get(str).clone();
	
  }
  
  
}
