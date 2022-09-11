public class LogLevels {
    
    public static String message(String logLine) {
        if(logLine.charAt(1) == 'E'){
            String s = logLine.substring(9,logLine.length()).trim();
            return s;
        }
        else if(logLine.charAt(1) == 'W'){
            String s = logLine.substring(11,logLine.length()).trim();
            return s;
        }
        else{
            String s = logLine.substring(8,logLine.length()).trim();
            return s;
        }
    }

    public static String logLevel(String logLine) {
        if(logLine.charAt(1) == 'E'){
            return "error";
        }
        else if(logLine.charAt(1) == 'W'){
            return "warning";
        }
        else{
            return "info";
        }
        
    }

    public static String reformat(String logLine) {
        if(logLine.charAt(1) == 'E'){
            String s = logLine.substring(9,logLine.length()).trim()+ " (error)";
            return s;
        }
        else if(logLine.charAt(1) == 'W'){
            String s = logLine.substring(11,logLine.length()).trim()+" (warning)";
            return s;
        }
        else{
            String s = logLine.substring(8,logLine.length()).trim()+ " (info)";
            return s;
        }
        
    }
}
