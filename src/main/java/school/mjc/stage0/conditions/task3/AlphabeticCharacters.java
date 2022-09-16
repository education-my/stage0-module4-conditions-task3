package school.mjc.stage0.conditions.task3;

import java.util.Locale;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        String charAsString = (character + "").toLowerCase();
        if (charAsString.matches("[aeiou]")) {
            System.out.println("Vowel");
        } else if (charAsString.matches("[bcdfghjklmnpqrstvwxys]")) {
            System.out.println("Consonant");
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
