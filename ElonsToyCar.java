public class ElonsToyCar {
    private int distance = 0;
    private int battery = 100;

    // public ElonToyCar(int d , int b ){
    //     this.distance = d ;
    //     this.battery = b ;
    // }
    public static ElonsToyCar buy() {
        return new ElonsToyCar() ; 
    }

    public String distanceDisplay() {
        return "Driven "+this.distance+" meters";
    }

    public String batteryDisplay() {
        if(this.battery == 0)
            return "Battery empty" ;
        return "Battery at "+this.battery+"%";
    }

    public void drive() {
        if(battery>0){
            this.battery --;
            this.distance+=20;
        }
        else {
            System.out.println("Battery empty");
        }
    }
}
