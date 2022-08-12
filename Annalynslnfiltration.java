class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        if(knightIsAwake == true){
            return false;
        }
        else{
            return true;
        }
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if(knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == false){
            return false;
        }
        else{
            return true;
        }
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if(archerIsAwake == false && prisonerIsAwake == true){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if(petDogIsPresent == true && archerIsAwake== false ){
            return true;
        }
        else if(petDogIsPresent == false && archerIsAwake== false && knightIsAwake == false && prisonerIsAwake == true){
            return true;
        }
             else if(petDogIsPresent == false && archerIsAwake== false && knightIsAwake == false && prisonerIsAwake == false){
            return false;
        }
        else{
            return false;
        }
    }
}
