package com.car;

public class Car {

    private Tyre tyre ;
    public Radio radio;
    private boolean canCarMove;
    private int milesDriven;

    public Car(){
        tyre=new Tyre();
        radio= new Radio();
        tyre.connectRadioViaBluetooth(radio);
        canCarMove=true;
    }


    public void move(){
        canCarMove = tyre.rotate();
        if(!canCarMove){
           radio.play("I can't move. The tyre is not rotating. Change my tyre");
            return;
        }
        milesDriven++;

    }

    public void changeTyre(){
        tyre=new Tyre();
        tyre.connectRadioViaBluetooth(radio);
        canCarMove=true;
    }

    public int getMilesDriven() {
        return milesDriven;
    }


    public boolean getCanCarMove(){
        return canCarMove;
    }

}
