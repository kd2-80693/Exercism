class NeedForSpeed {
    private int speed;
    private int batteryDrain ;
    public int battery = 100;
    public int distance = 0;
    // TODO: define the constructor for the 'NeedForSpeed' class
    public NeedForSpeed(int s , int bd){
        this.speed = s ;
        this.batteryDrain = bd;
        
    }
    public boolean batteryDrained() {
        if(this.battery<=0){
            return true;
        }
        return false;
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        if(!batteryDrained()){
            this.distance += this.speed ;
            this.battery -= this.batteryDrain ;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {
    private int distance ;
    public RaceTrack(int d){
        this.distance = d;
    }
    
    // TODO: define the constructor for the 'RaceTrack' class

    public boolean tryFinishTrack(NeedForSpeed car) {
         while(car.battery>0){
             car.drive();
             if(car.distance>=this.distance){
                 return true;
             }
         }
        return false;
    }
}
