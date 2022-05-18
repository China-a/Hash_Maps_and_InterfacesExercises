package Hash_Maps;

import java.util.HashMap;

public class Program {

    public static void printKeys(HashMap<String,String> hashmap) {
        for(String theHashMapKeys: hashmap.keySet() ) {
            System.out.println(theHashMapKeys);
        }
    }

    public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
            for(String theHashMapKeys: hashmap.keySet()) {
                if(theHashMapKeys.contains(text)) {
                    System.out.println(theHashMapKeys);
                }
            }
    }

    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
        for(String theHashMapKeys: hashmap.keySet()) {
            if(theHashMapKeys.contains(text)) {
                System.out.println(hashmap.get(theHashMapKeys));
            }
        }
    }

    public static void printValues(HashMap<String, Book> hashmap1) {
        for(Book bookObject: hashmap1.values()) {
                System.out.println(bookObject);
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap1, String text) {
        for(Book bookObject: hashmap1.values()) {
            if(bookObject.getName().contains(text)) {
                System.out.println(bookObject.toString());
            }
        }
    }

}
