package com.designpatterns.creationalpatterns.builder;

public class CastleDirector {
    public void constructSmallCastle(Builder builder) {
        builder.setTowerCount(0);
        builder.hasEscapeRoute(false);
        builder.hasMoat(false);
        builder.setCastleType(CastleType.MOTTE_BAILEY);
    }

    public void constructMediumCastle(Builder builder) {
        builder.setTowerCount(2);
        builder.hasEscapeRoute(false);
        builder.hasMoat(true);
        builder.setCastleType(CastleType.STONE_KEEP);
    }

    public void constructBigCastle(Builder builder) {
        builder.setTowerCount(4);
        builder.hasEscapeRoute(true);
        builder.hasMoat(true);
        builder.setCastleType(CastleType.CONCENTRIC);
    }

    public void constructWizardCastle(Builder builder) {
        builder.setTowerCount(4);
        builder.hasEscapeRoute(true);
        builder.hasMoat(true);
        builder.setCastleType(CastleType.CONCENTRIC);
        builder.setWizardTower();
    }
}
