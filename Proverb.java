import java.util.*;
class Proverb {
    ArrayList<String> words = new ArrayList<String>();

    Proverb(String[] words) {
        Collections.addAll(this.words, words);
    }

    String recite() {
        if(this.words.size()==0){
            return "";
        }
        String s = "And all for the want of a "+ this.words.get(0)+".";
        
        String s1 = "";
        if(this.words.size()>1){
            
            for(int i = 0 ; i < this.words.size()-1 ; i++ ){
                s1 += "For want of a "+this.words.get(i) + " the "+this.words.get(i+1) + " was lost.\n" ;
            }
        }
        s = s1+s;
        return s;

}
}
