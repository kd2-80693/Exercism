public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double s = (double ) speed;
        if(speed <= 4){
            return  ss* 221;
        }
            
        else if (speed <=8){
            return  ss * 221 * 90 /100 ; 
            
        }
        
        else if (speed ==9){
            return  ss * 221 * 80 /100 ; 
            
        }
        
        else {
            return  ss * 221 * 77 /100 ; 
            
        }
        
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed)/60);
        
    }
}
