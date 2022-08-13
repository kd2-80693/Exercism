
class ReverseString {

    String reverse(String inputString) {
        String s = "";
        for(char c : inputString.toCharArray()){
            s = c + s ;
        }
        return s;
    }
  
}
