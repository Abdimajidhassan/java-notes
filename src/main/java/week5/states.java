package week5;

import java.util.HashMap;
import java.util.Map;

public class states {
    public static void main(String[] args) {
        Map<String, String> stateAbbreviations = new HashMap<>();
        stateAbbreviations.put("Minnesota", "MN");
        stateAbbreviations.put("Wisconsin", "WI");
        stateAbbreviations.put("Michigan", "MI");
        stateAbbreviations.put("Iowa", "IA");
        System.out.println(stateAbbreviations);
        System.out.println(stateAbbreviations.get("Minnesota"));
        System.out.println(stateAbbreviations.get("Iowa"));
        String WisconsinAbbreviation = stateAbbreviations.get("Wisconsin");
        System.out.println(WisconsinAbbreviation);

        for (String stateName : stateAbbreviations.keySet()) {
            System.out.println(stateName);
            System.out.println(stateAbbreviations.get(stateName));
        }
        for (String Abbreviation : stateAbbreviations.values()) {
            System.out.println(Abbreviation);
        }
        String searchAbbreviation = "MI";
        for (String stateName : stateAbbreviations.keySet()) {
            System.out.println(stateName);
            String abbreviation = stateAbbreviations.get(stateName);
            if(abbreviation.equals(searchAbbreviation)) {
            System.out.println("found it! The state for " + searchAbbreviation + " is " + stateName);}
        }
        Map<String, String> abbreviationsStateName = new HashMap<>();
        for (Map.Entry<String, String> entry: stateAbbreviations.entrySet()){
            String state = entry.getKey();
            String abbreviation = entry.getValue();
            abbreviationsStateName.put(abbreviation, state);

        }
        System.out.println(stateAbbreviations);
        System.out.println(abbreviationsStateName);

        System.out.println("there are " + stateAbbreviations.size() + " states List");
    }



}



