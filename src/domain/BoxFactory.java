package domain;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import util.DefaultValue;

public class BoxFactory {
	
	public static final BoxFactory INSTANCE = new BoxFactory();
	
	public BoxFactory() {
		
	}
	
	public Box getBox(){
		Box box = new Box();
		
		for (Field f : Box.class.getDeclaredFields()) {
			
			if (f.isAnnotationPresent(DefaultValue.class)) {
				DefaultValue dv = f.getAnnotation(DefaultValue.class);
				try {
					for (Method m : Box.class.getDeclaredMethods()) {
					 if (m.getName().equalsIgnoreCase("set" + f.getName())) {
						 m.invoke(box, dv.value());
					 }
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
		return box;
	}
	
	public static BoxFactory getBoxFactory() {
		return INSTANCE;
	}

}
