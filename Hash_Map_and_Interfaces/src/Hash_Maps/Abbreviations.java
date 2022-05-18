package Hash_Maps;

import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> word;


    public Abbreviations() {
        this.word =  new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        word.put(abbreviation,explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
//        if(word.containsKey(abbreviation)) {
//            return true;
//        }
//        else {
//            return false;
//        }

        // this is a simplified version of what's above
        return word.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation){
        if(word.containsKey(abbreviation)){
            return word.get(abbreviation);
        }
        return null;
    }


}
