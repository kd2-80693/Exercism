class ReverseString {

    String reverse(String inputString) {
        String output = "";
        for(int i=0;i<inputString.length();i++){
            output = inputString.charAt(i) + output;
        }
        return output;

        
    }
  
}
