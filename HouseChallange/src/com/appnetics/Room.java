package com.appnetics;

import java.awt.*;

public class Room {
    private Door door;
    private Ventilation ventilation;
    private String bed;
    private String table;

    public Room(Door door, Ventilation ventilation, String bed, String table) {
        this.door = door;
        this.ventilation = ventilation;
        this.bed = bed;
        this.table = table;
    }

    public Door getDoor() {
        return door;
    }

    public Ventilation getVentilation() {
        return ventilation;
    }

    public String getBed() {
        return bed;
    }

    public String getTable() {
        return table;
    }
}
