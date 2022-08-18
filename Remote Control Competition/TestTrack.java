import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class TestTrack {
    public static void race(RemoteControlCar car) {
        car.drive();
    }
    public static List<ProductionRemoteControlCar> getRankedCars(ProductionRemoteControlCar prc1,
                                                                 ProductionRemoteControlCar prc2) {
        List<ProductionRemoteControlCar> carList = new ArrayList<>(Arrays.asList(prc1, prc2));
        carList.sort(ProductionRemoteControlCar::compareTo);
        return carList;
    }
}
