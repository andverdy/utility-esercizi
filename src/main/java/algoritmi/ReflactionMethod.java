package algoritmi;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import Modelli.User;

public class ReflactionMethod {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		User user = new User();
		user.setName("ciccio");
		user.setIdutente(113);
		getPippo(user);
	}

	public static <T> T getPippo(T t) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, InvocationTargetException, NoSuchMethodException {
		for(Method method : t.getClass().getDeclaredMethods()) {
			method.setAccessible(true);

			System.out.println(method.getName());
			System.out.println(method.getParameterCount());
			System.out.println(method.getReturnType());
			Method method2 = method.getClass().getDeclaredMethod("getName");
			String ciccio = method2.invoke(method).toString();
			System.out.println();
			/*
			 * Method method = anagrafica.getClass().getDeclaredMethod("getCodiceAnagrafico");
		String codiceAnagraficoToSearch = method.invoke(anagrafica).toString();*/
			// if(field.getType().toString().equals("class java.lang.Integer")) {
			// field.set(t, 13);
			// System.out.println(field.get(t));
			// }
			// if(field.getType().toString().equals("class java.lang.String")) {
			// field.set(t, "sello"); // setta il campo
			// System.out.println(field.get(t)); // dammi il valore del campo
			// }
		}
		User user = new User();
		System.out.println(user.getIdutente());
		return null;
	}

}
