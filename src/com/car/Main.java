package com.car;

///Composição e Delegação
public class Main {

    public static void main(String[] args) {
	// write your code here

     /*
     * Create class Car
     *
     * Create method  move();
     *
     * Carro tem tyre
     * quando o carro se move o valor do tyre decrementa
     *quando o tyre chegar a zero explode
     * quando o tyre explodir o rádio tem que  tocar
     * quando o pneu explodir o carro não  pode andar;
     * */


        int MILES=304;
        Car myCar=new Car();

        for (int i = 1; i <= MILES; i++) {
            myCar.move();
            if(!myCar.getCanCarMove()){
                myCar.changeTyre();
                myCar.radio.play("You've changed my tyre at  mile "+ i +". Continue your journey");
                myCar.move();

            }
        }

        myCar.radio.play("You've finish your trip");
        myCar.radio.play("My miles meter says: " + myCar.getMilesDriven());
    }
}
