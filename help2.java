class ProductionRemoteControlCar  implements RemoteControlCar,Comparable<ProductionRemoteControlCar>{
    private final int speed = 10;
    private int distanceTravelled = 0;
    private int numberOfVictories = 0 ;
    @Override
    public void drive() {
        this.distanceTravelled+=speed;
    }
    @Override
    public int getDistanceTravelled() {
        return this.distanceTravelled ; 
    }

    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberofVictories) {
        this.numberOfVictories = numberOfVictories ;
    }
    @Override
    public int compareTo(ProductionRemoteControlCar that) {
        return this.numberOfVictories - that.getNumberOfVictories();
    }
}
