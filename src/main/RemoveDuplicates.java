package main;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class RemoveDuplicates {
    private String s;

    // this is a contructor
    public RemoveDuplicates(String input) {
        //System.out.println("Remove Object Created");
        s = input;
    }

    public String getS() {
        return s;
    }

    //This method should remove duplicates from the String s
    public void RemoveMethod(){
        //Create a linked hashmap object
        LinkedHashMap<Integer, String> lhmap = new LinkedHashMap<Integer, String>();

        //parse the string and add
        for (int i = 0; i < s.length(); i++){
            //Find the character at the specified index
            char ch = s.charAt(i);
            //System.out.println(ch);
            //if the hash map does not contain the character
            if(!(lhmap.containsValue(Character.toString(ch)))) {
                lhmap.put(i, Character.toString(ch));
            }
        }
        s = String.join("",lhmap.values());
        //System.out.println(s);
    }

}
