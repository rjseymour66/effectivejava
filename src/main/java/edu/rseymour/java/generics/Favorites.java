package edu.rseymour.java.generics;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Demonstrates typesafe heterogeneous containers. The normal use of generics
 * restricts you to a fixed number of type parameters per container. You can
 * get around that by placing the type paramter on the key rather than the container.
 *
 * Every key in the Map can have a different paramterized type, which
 * makes it heteerogeneous.
 */
public class Favorites {
    private Map<Class<?>, Object> favorites = new HashMap<>();

    public <T> void putFavorite(Class<T> type, T instance) {
        favorites.put(Objects.requireNonNull(type), instance);
    }

    // Achieving runtime type safety with a dynamic cast
    public <T> void putFavorite2(Class<T> type, T instance) {
        favorites.put(type, type.cast(instance));
    }

    /**
     * 1. Gets the value correspoding to the given Class object from the
     *    favorites map.
     * 2. type.cast checks that the argument is a Class of the type represented
     * @param type
     * @param <T>
     * @return
     */
    public <T> T getFavorite(Class<T> type) {
        return type.cast(favorites.get(type));
    }

    public static void main(String[] args) {
        Favorites f = new Favorites();
        f.putFavorite(String.class, "Java");
        f.putFavorite(Integer.class, 0xcafebabe);
        f.putFavorite(Class.class, Favorites.class);
        String favoriteString = f.getFavorite(String.class);
        int favoriteInteger = f.getFavorite(Integer.class);
        Class<?> favoriteClass = f.getFavorite(Class.class);
        System.out.printf("%s %x %s%n", favoriteString, favoriteInteger, favoriteClass.getName());
    }
}
