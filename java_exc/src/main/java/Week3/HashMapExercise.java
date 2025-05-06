package Week3;

import java.util.HashMap;

public class HashMapExercise {

    public static void main(String[] args) {

        HashMap<String, String> familyMembers = new HashMap<>();

        familyMembers.put("bro", "Melvin");
        familyMembers.put("dad", "Mauricio");
        familyMembers.put("mom", "Linda");

        System.out.println(familyMembers.get("mom"));

        familyMembers.put("bro", "Henry");

        System.out.println(familyMembers.get("bro"));

        for (String string : familyMembers.keySet()) {
            System.out.println(string);
        }
        for (String string : familyMembers.values()) {
            System.out.println(string);
        }

        HashMap <String, Integer> peopleAndAge = new HashMap<>();

        peopleAndAge.put("wilmer", 2);
        peopleAndAge.put("samantha", 3);
        peopleAndAge.put("preston", 4);
        peopleAndAge.put("Ryan", 5);

        System.out.println(peopleAndAge.get("wilmer"));






    }
}
