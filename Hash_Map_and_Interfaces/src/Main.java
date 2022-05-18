import Hash_Maps.Book;
import Hash_Maps.Library;
import Hash_Maps.Person;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> postalCodes = new HashMap<>();
        postalCodes.put("00710", "Helsinki");
        postalCodes.put("90014", "Oulu");
        postalCodes.put("33720", "Tampere");
        postalCodes.put("33014", "Tampere");

        System.out.println(postalCodes.get("00710"));
        System.out.println();

        // If the hash map does not contained the key used for the search, its get method returns a null reference.
        HashMap<String, String> numbers = new HashMap<>();
        numbers.put("One", "Uno");
        numbers.put("Two", "Dos");

        String translation = numbers.get("One");
        System.out.println(translation);

        System.out.println(numbers.get("Two"));
        System.out.println(numbers.get("Three"));
        System.out.println(numbers.get("Uno"));
        System.out.println();

        // Which command retrieves the value 3 from the hash map?
        HashMap<String, Integer> conversionMap = new HashMap<>();

        conversionMap.put("3", 9);
        conversionMap.put("6", 6);
        conversionMap.put("9", 3);

        if (conversionMap.get("9") == 3) {
            System.out.println("Correct!");
            System.out.println();
        }
        // The hash map has a maximum of one value per key.
        // If a new key-value pair is added to the hash map,
        // but the key has already been associated with some other value stored in the hash map,
        // the old value will vanish from the hash map.

        HashMap<String, Book> directory = new HashMap<>();

        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");

//        HashMap<String, Hash_Maps.Book> directory = new HashMap<>();
        System.out.println(directory.put(senseAndSensibility.getName(), senseAndSensibility));
        System.out.println(directory.put(prideAndPrejudice.getName(), prideAndPrejudice));

        Book book = directory.get("Persuasion");
        System.out.println(book);


        book = directory.get("Pride and Prejudice");
        System.out.println(book);
        System.out.println();

        Library library = new Library();
        library.addBook(senseAndSensibility);
        library.addBook(prideAndPrejudice);

        System.out.println(library.getBook("pride and prejudice"));


        System.out.println(library.getBook("PRIDE AND PREJUDICE"));


        System.out.println(library.getBook("SENSE"));
        System.out.println();



        HashMap<String, Person> personMap = new HashMap<>();

        Person casper = new Person("Casper", 55);
        Person mike = new Person("Mike", 4);
        Person matt = new Person("Matt", 12);

        personMap.put(casper.getName(), casper);
        personMap.put(mike.getName(), mike);
        personMap.put(matt.getName(), matt);

        if(personMap.get("Mike").getAge() == 4) {
            System.out.println("Correct2!");
        }



    }

}
