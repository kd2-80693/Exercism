public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int timeAlreadyTaken){
        int n =expectedMinutesInOven();
        return n-timeAlreadyTaken;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        return layers*2;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public static int totalTimeInMinutes(int layers, int timeAlreadyTaken){
        int timeInPrepL = layers*2;
        return timeAlreadyTaken + timeInPrepL;
    }
    public static void main(String args[]){
        Lasagna lasagna = new Lasagna();
        lasagna.expectedMinutesInOven();
         lasagna.remainingMinutesInOven(30);
         lasagna.preparationTimeInMinutes(2);
         totalTimeInMinutes(8, 8);
    }
}
