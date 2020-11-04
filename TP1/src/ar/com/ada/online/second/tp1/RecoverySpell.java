package ar.com.ada.online.second.tp1;

public class RecoverySpell extends Spell {
    private int energyRecovered;

    // Constructor
    public RecoverySpell(String name, int magicEnergySpent, int energyRecovered) {
        super(magicEnergySpent);
        this.name = name;
        this.energyRecovered = energyRecovered;
    }


    //Getter & Setter
    public int getEnergyRecovered() {
        return energyRecovered;
    }

    public void setEnergyRecovered(int energyRecovered) {
        this.energyRecovered = energyRecovered;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    @Override
    public void setMagicEnergySpent(int magicEnergySpent) {
        super.setMagicEnergySpent(magicEnergySpent);
    }

    @Override
    public int getMagicEnergySpent() {
        return super.getMagicEnergySpent();
    }

    @Override
    public String toString() {
        return "Recovery Spell {" +
                " name: " + name +
                ", energy recovered: " + energyRecovered +
                ", magic energy spent: " + magicEnergySpent +
                "} ";
    }
}

