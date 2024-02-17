package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super(name,isManual);
    }

    public void accelerate(int rate){
        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        newSpeed+=rate;
        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            changeGear(1);
            stop();
        }
        //for all other cases, change the gear accordingly

        if(newSpeed > 0 && newSpeed<51) {
            changeSpeed(newSpeed, getCurrentDirection());
        }if(newSpeed > 50 && newSpeed<101) {
//            newSpeed+=rate;
            changeSpeed(newSpeed, getCurrentDirection());
        }if(newSpeed > 100 && newSpeed<151) {
//            newSpeed+=rate;
            changeSpeed(newSpeed, getCurrentDirection());
        }if(newSpeed > 151 && newSpeed<201) {
//            newSpeed+=rate;
            changeSpeed(newSpeed, getCurrentDirection());
        }if(newSpeed > 200 && newSpeed<251) {
//            newSpeed+=rate;
            changeSpeed(newSpeed, getCurrentDirection());
        }if(newSpeed > 250) {
//            newSpeed+=rate;
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
