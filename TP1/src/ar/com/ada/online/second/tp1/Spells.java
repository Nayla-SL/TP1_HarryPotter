package ar.com.ada.online.second.tp1;

import java.util.ArrayList;

public class Spells {

    protected int magicEnergySpent;
    protected String name;

    // Constructor

    public Spells(int magicEnergySpent, String name) {
        this.name = name;
        this.magicEnergySpent = magicEnergySpent;

    }

    public Spells(String name, int magicEnergySpent) {
        this.name = name;
        this.magicEnergySpent = magicEnergySpent;

    }

    public Spells(int magicEnergySpent) {
        this.magicEnergySpent = magicEnergySpent;
    }

    public Spells(String name) {
        this.name = name;
    }

    //Getter & Setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicEnergySpent() {
        return magicEnergySpent;
    }

    public void setMagicEnergySpent(int magicEnergySpent) {
        this.magicEnergySpent = magicEnergySpent;
    }
}