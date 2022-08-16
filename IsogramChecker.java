import java.util.*;
class IsogramChecker {

    boolean isIsogram(String phrase) {
        phrase = phrase.toLowerCase();
        phrase = phrase.replaceAll("-"," ");
        char[] ch = phrase.toCharArray();
        for(int i = 0 ; i < ch.length ; i++){
            String c = ""+ ch[i];
            ch[i] = ' ';
            if(!c.equals(" ")  && new String(ch).contains(c)){
                return false;
            }
        }
        return true;
    }

}


// or 

// class IsogramChecker {
//     boolean isIsogram(String phrase) {
//         phrase = phrase.replace("-", "").replace(" ", "").toLowerCase();
//         return (phrase.chars().distinct().count() == phrase.length());
//     }
// }
