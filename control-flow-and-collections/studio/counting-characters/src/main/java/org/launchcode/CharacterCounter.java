package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {
    public static void main(String[] args) {
        String hiddenFiguresQuote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInString = hiddenFiguresQuote.toCharArray();

        HashMap<Character, Integer> numChars = new HashMap<>();

        for (Character character : charactersInString) {
            Integer count = numChars.get(character);
            if (count == null) {
                count = 0;
            }
            count++;
            numChars.put(character, count);
        }

        for (Map.Entry<Character, Integer> chars : numChars.entrySet()) {
            System.out.println(chars.getKey() + ": " + chars.getValue());
        }

    }
}
