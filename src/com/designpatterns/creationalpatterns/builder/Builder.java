package com.designpatterns.creationalpatterns.builder;

public interface Builder {
    void setTowerCount(int towerCount);
    void hasMoat(boolean moat);
    void setCastleType(CastleType castleType);
    void hasEscapeRoute(boolean escapeRoute);
    void setWizardTower();
    Castle getCastle();
}
