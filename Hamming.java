public class Hamming {
    private String leftStrand ;
    private String rightStrand ; 
    public Hamming(String leftStrand, String rightStrand) {
        if(leftStrand.length()==0 && rightStrand.length()!=0)
            throw new IllegalArgumentException("left strand must not be empty.");
        if(rightStrand.length()==0 && leftStrand.length()!=0)
            throw new IllegalArgumentException("right strand must not be empty.");
        
        if(leftStrand.length() != rightStrand.length() ){
        throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
    }
        this.leftStrand = leftStrand ;
        this.rightStrand = rightStrand ;
    }

    public int getHammingDistance() {
        int count = 0 ;
        for(int i = 0 ; i < rightStrand.length() ; i++){
            if(rightStrand.charAt(i) != leftStrand.charAt(i)){
                count++;
            }
        }
        return count;
    }
}
