package com.designpatterns.creationalpatterns.builder;

public class Castle {
    private final int towerCount;
    private final boolean moat;
    private final CastleType castleType;
    private final boolean escapeRoute;
    private final Wizard wizard;

    public Castle(int towerCount, boolean moat, CastleType castleType, boolean escapeRoute, Wizard wizard) {
        this.towerCount = towerCount;
        this.moat = moat;
        this.castleType = castleType;
        this.escapeRoute = escapeRoute;
        this.wizard = wizard;
    }

    public int getTowerCount() {
        return towerCount;
    }

    public boolean getMoat() {
        return moat;
    }

    public CastleType getCastleType() {
        return castleType;
    }


    public boolean getEscapeRoute() {
        return escapeRoute;
    }

    public Wizard getWizard() {
        return wizard;
    }
}
