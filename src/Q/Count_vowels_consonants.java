package Q;

import java.util.List;
import java.util.stream.Collectors;

public class Count_vowels_consonants {
    static void main() {
        String str = "Abcaabudef";
        List<Character> vowels = str.chars().mapToObj(c -> (char) c)
                .filter(Count_vowels_consonants::isVowel)
                .collect(Collectors.toUnmodifiableList());
        System.out.println(vowels);
    }

    static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return "aeiou".indexOf(ch) != -1;
    }
}
