abstract class Fighter {

    boolean isVulnerable() {
        return false;
    }
    @Override
    public String toString() {
        return "Fighter is a Wizard" ;
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior" ;
    }

    @Override
    int damagePoints(Fighter wizard) {
         return wizard.isVulnerable() ? 10 : 6;
    }
}

class Wizard extends Fighter {
    private boolean spell = true;

    @Override
    boolean isVulnerable() {
        return spell ;
    }

    @Override
    int damagePoints(Fighter warrior) {
        return spell ? 3:12 ;
        
    }

    void prepareSpell() {
        spell = false;
    }

}
