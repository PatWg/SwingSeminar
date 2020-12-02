package fr.patrickwang.models;

public class District {
    private Alibi alibi;
    private boolean visible;

    public District(Alibi alibi) {
        this.alibi = alibi;
    }

    public String getName() {
        return alibi.getName();
    }
}
