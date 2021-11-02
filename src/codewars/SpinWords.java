package codewars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SpinWords {
    /**
     * 2021.11.02
     * Stop gninnipS My sdroW!
     * https://www.codewars.com/kata/5264d2b162488dc400000001/train/java
     */
    public String spinWords(String sentence) {
        String[] strArry = sentence.split(" ");
        for(String word : strArry) {
            if (word.length() >= 5 ) {
                word = new StringBuilder(word).reverse().toString();
            }
        }
        return String.join(" ", strArry);

//        String[] strArry = sentence.split(" ");
//        String[] result = new String[strArry.length];
//        String str = "";
//        for(int i=0; i<strArry.length; i++) {
//            String word = strArry[i];
//            if (word.length() >= 5) {
//                StringBuilder piece = new StringBuilder();
//                piece.append(word);
//                str = piece.reverse().toString();
//            }else {
//                str = word;
//            }
//            result[i] = str;
//        }
//        List<String> strings = Arrays.asList(result);
//        return strings.stream().collect(Collectors.joining(" "));
    }
}
