package com.designpatterns;

import com.designpatterns.creationalpatterns.builder.*;

public class App {

    public static void main(String[] args) {
        CastleDirector director = new CastleDirector();
        CastleBuilder builder = new CastleBuilder();
        director.constructSmallCastle(builder);
        Castle smallCastle = builder.getCastle();
    }
}
