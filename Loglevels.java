public class LogLevels {
    
    public static String message(String logLine) {
        if(logLine.substring(0,7).compareTo("[ERROR]") == 0){
            String output = logLine.substring(logLine.indexOf(" ")+1,logLine.length());
            return output;
        }
        else if(logLine.substring(0,6).compareTo("[INFO]") == 0){
            String output = logLine.substring(logLine.indexOf(" ")+1,logLine.length());
            return output;
        }
        else if(logLine.substring(0,9).compareTo("[WARNING]") == 0){
            String output = logLine.substring(logLine.indexOf(" ")+1,logLine.length()).trim();
            return output;
        }
        return "";
    }

    public static String logLevel(String logLine) {
        if(logLine.substring(0,7).compareTo("[ERROR]") == 0){
            String input = logLine.substring(1,6).toLowerCase() ;
            return input;
        }
        else if(logLine.substring(0,6).compareTo("[INFO]") == 0){
            String input = logLine.substring(1,5).toLowerCase() ;
            return input;
        }
        else if(logLine.substring(0,9).compareTo("[WARNING]") == 0){
            String input = logLine.substring(1,8).toLowerCase() ;
            return input;
        }
        return "";
    }

    public static String reformat(String logLine) {
         String input = "";
        if(logLine.substring(0,7).compareTo("[ERROR]") == 0){
            input = input  + " " + "(" + logLine.substring(1,6).toLowerCase() + ")" ;
            String output = logLine.substring(logLine.indexOf(" ")+1,logLine.length()).trim() + input;
            return output;
        }
        else if(logLine.substring(0,6).compareTo("[INFO]") == 0){
            input = input + " " + "(" + logLine.substring(1,5).toLowerCase() + ")" ;
            String output = logLine.substring(logLine.indexOf(" ")+1,logLine.length()).trim() + input;
            return output;
        }
        else if(logLine.substring(0,9).compareTo("[WARNING]") == 0){
            input = input  + " " + "(" + logLine.substring(1,8).toLowerCase() + ")" ;
            String output = logLine.substring(logLine.indexOf(" ")+1,logLine.length()).trim() + input ;
            return output;
        }
        return "";
    }
}
