package algoritmi;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import Modelli.User;

public class Reflaction {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		User user = new User();
		user.setName("ciccio");
		user.setIdutente(111);
		getPippo(user);

	}

	public static <T> T getPippo(T t) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		for(Field field : t.getClass().getDeclaredFields()) {
			field.setAccessible(true);
			System.out.println(field.getType());
			if(field.getType().toString().equals("class java.lang.Integer")) {
				field.set(t, 13);
				System.out.println(field.get(t));
			}
			if(field.getType().toString().equals("class java.lang.String")) {
				field.set(t, "sello"); // setta il campo
				System.out.println(field.get(t)); // dammi il valore del campo
			}
		}
		User user = new User();
		System.out.println(user.getIdutente());
		return null;
	}

}
