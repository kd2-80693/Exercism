class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        
        stringToVerify = stringToVerify.replaceAll("-","");
        if(stringToVerify.length()<9 || stringToVerify.length()>10){
            return false;
        }
        if(isISBN(stringToVerify)){
            
            if(stringToVerify.length()==9){
                stringToVerify = "0"+stringToVerify;
            }
            String[] splitArray = stringToVerify.split("");
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                if(splitArray[i].equals("X")){
                    sum += 10*(10-i);
                }
                else{
                 sum += Integer.parseInt(splitArray[i])*(10-i) ;
                }
            }
            return sum%11==0 ;
        }
        return false;
    }
    static boolean isISBN(String str){
        if(str.charAt(str.length()-1)=='X'){
        str = str.replaceAll("X","0");
            }
        
        for(char c : str.toCharArray()){
            if(!Character.isDigit(c)){
                return false;
            }
        
        }
        return true;
    }

}
