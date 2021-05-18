package com.car;

public class Tyre {

    private int integrity;
    private boolean isExploded;
    private Radio radioConnected;
    final private int MAX_INT=100;

    public Tyre(){
        integrity=MAX_INT;
        isExploded=false;
    }


    public boolean rotate(){
        wornOut();
        boolean  tyreCanRotate=!isExploded;
        return  tyreCanRotate;
    }

    private void wornOut(){
        integrity--;
        if(integrity<=0){
            integrity=0;
            explode();
            return;
        }

    }

    private void explode(){
        if(integrity==0 && !isExploded){
            isExploded=true;
            if(radioConnected!=null){
                radioConnected.play("BOOOM BOOOM BOOOM BBOOOM! Your tyre just exploded! LA LA LA LA LA LA LA");
            }

        }
    }

    public void connectRadioViaBluetooth(Radio radio){
        radioConnected=radio;
    }

}
