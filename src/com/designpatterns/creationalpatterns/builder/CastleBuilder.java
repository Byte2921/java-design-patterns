package com.designpatterns.creationalpatterns.builder;

public class CastleBuilder implements Builder {
    private int towerCount;
    private boolean moat;
    private CastleType castleType;
    private boolean escapeRoute;
    private Wizard wizard;

    public Castle getCastle() {
        return new Castle(towerCount, moat, castleType, escapeRoute, wizard);
    }

    @Override
    public void setTowerCount(int towerCount) {
        towerCount = towerCount;
    }

    @Override
    public void hasMoat(boolean hasMoat) {
        moat = hasMoat;
    }

    @Override
    public void setCastleType(CastleType castleType) {
        castleType = castleType;
    }

    @Override
    public void hasEscapeRoute(boolean escapeRoute) {
        escapeRoute = escapeRoute;
    }

    @Override
    public void setWizardTower() {
        wizard = new Wizard();
    }
}
