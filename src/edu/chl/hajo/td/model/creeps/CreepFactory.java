package edu.chl.hajo.td.model.creeps;



/*
     A Factory for creeps. Used by controls
 */

import edu.chl.hajo.td.model.Path;

public final class CreepFactory {


    public static AbstractCreep getCreep(String creepClassName, Path path) {
        switch (creepClassName) {
            case "Minions":
                return new Minions(path);
            case "Creep":
                return new Creep(path);   // TODO
            case "Boss":
                return new Boss(path);
            default:
                throw new IllegalArgumentException("No such Creep " + creepClassName);
        }
    }

    private CreepFactory() {
    }
}
