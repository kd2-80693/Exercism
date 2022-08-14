class SqueakyClean {
    static String clean(String identifier) {
        String s  = "";
        int a = 0;
        for(int i = 0 ; i < identifier.length() ; i++){
            if (identifier.charAt(i) == ' '){
                s+="_";
            }
            else if (Character.getType(identifier.charAt(i)) == Character.CONTROL){
                s += "CTRL";
                
                
            }
            else if(identifier.charAt(i) == '-'){
                if(!Character.isDigit(identifier.charAt(i+1))){
                String v = ""+ identifier.charAt(i+1);
                s += v.toUpperCase();
                
                }
                i++;
            }
            else if (Character.isLetter(identifier.charAt(i)) && !(identifier.charAt(i) >= 945 && identifier.charAt(i) <= 969 )) {
                s+=identifier.charAt(i);
            }
        }
        return s;
    }
}
