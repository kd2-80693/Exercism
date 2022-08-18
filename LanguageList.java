import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();
    private int count = 0;

    public boolean isEmpty() {
        if(languages.size()<=0){
            count = 0;
            return true;
        }
        return false;
        
    }

    public void addLanguage(String language) {
        count++;
        this.languages.add(language);
    }

    public void removeLanguage(String language) {
        if(this.languages.contains(language)){
            count--;
            this.languages.remove(language);
        }
        
        }

    public String firstLanguage() {
        if(this.languages.size()>0)
        return this.languages.get(0);
        return null;
        }

    public int count() {
        return this.count;
    }

    public boolean containsLanguage(String language) {
        if(this.languages.contains(language)){
            return true;
        }
        return false;
        }

    public boolean isExciting() {
        for(String s:this.languages){
            if(s=="Java"||s=="Kotlin"){
                return true;
            }
        }
        return false;
    }
}
