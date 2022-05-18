package Hash_Maps;

import Hash_Maps.Program;

import java.util.HashMap;

public class Hash_Map_Programing_Exercises {

    public static void main(String[] args) {

        //NickName Exercise
        HashMap<String, String> nickNames = new HashMap<>();
        nickNames.put("matthew", "matt");
        nickNames.put("michael", "mix");
        nickNames.put("arthur", "artie");

        System.out.println(nickNames.get("matthew"));
        System.out.println();
        System.out.println();
        System.out.println();

        // Hash_Maps.Abbreviations Exercise
       Abbreviations abbreviations = new Abbreviations();

        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String part : text.split(" ")) {
            if (abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();
        System.out.println();
        System.out.println();


        // Print me my hash map Exercise
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        Program.printKeys(hashmap);
        System.out.println("---");
        Program.printKeysWhere(hashmap, "i");
        System.out.println("---");
        Program.printValuesOfKeysWhere(hashmap, ".e");

        System.out.println();
        System.out.println();



        HashMap<String, Book> hashmap1 = new HashMap<>();
        hashmap1.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap1.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        Program.printValues(hashmap1);
        System.out.println("---");
        Program.printValueIfNameContains(hashmap1, "prejud");


        System.out.println();
        System.out.println();

        //I owe you
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));



    }
}
