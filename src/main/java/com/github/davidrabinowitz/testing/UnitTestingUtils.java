package com.github.davidrabinowitz.testing;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Various utilities used in unit testing
 * @author david
 *
 */
public final class UnitTestingUtils {
	
	/**
	 * Replacing a value of a final static member of a class. Taken from here: 
	 * http://stackoverflow.com/questions/14102000/cannot-change-static-final-field-using-java-reflection
	 * @param clazz The owning class
	 * @param fieldName The name of the field
	 * @param newValue The new value of the static field
	 * @throws NoSuchFieldException if a field with the specified name is not found 
	 * @throws IllegalAccessException if this Field object is enforcing Java language access control and the underlying field is either inaccessible
	 */
    public static void setFinalStatic(Class<?> clazz, String fieldName, Object newValue) throws NoSuchFieldException, IllegalAccessException {
        Field field = clazz.getDeclaredField(fieldName);
        field.setAccessible(true);
        Field modifiers = field.getClass().getDeclaredField("modifiers");
        modifiers.setAccessible(true);
        modifiers.setInt(field, field.getModifiers() & ~Modifier.FINAL);
        field.set(null, newValue);
    }


}
