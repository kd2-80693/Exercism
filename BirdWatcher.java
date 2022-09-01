import java.lang.* ;
class BirdWatcher {
    private final int[] birdsPerDay; 

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        if(birdsPerDay.length>0)
            return birdsPerDay[birdsPerDay.length -1] ; 
        return 0;
    }
    
    
    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int i : birdsPerDay){
            if(i==0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0 ;
        for(int i = 0 ; i < Math.min(numberOfDays ,birdsPerDay.length)  ; i++){
            sum+=birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int sum = 0 ;
        for(int i : birdsPerDay){
            if(i>=5){
                sum++;
            }
        }
        return sum;
    }
}
