package com.appnetics;

public class Ventilation {
    private boolean isOpen;

    public Ventilation(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public boolean isVentilationOpen(){
        if(isOpen ==true){
            System.out.println("The ventilation is open");
        }return false;
    }
}
