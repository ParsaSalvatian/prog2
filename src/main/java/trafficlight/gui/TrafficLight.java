package trafficlight.gui;


import trafficlight.interfaces.Observer;
import trafficlight.states.State;

import java.awt.*;

public class TrafficLight extends Light implements Observer{

   public TrafficLight(Color color) {
        super(color);
    }

    public void turnOn(boolean a) {
        isOn = a;
        repaint();
    }


    public boolean isOn() {
        return isOn;
    }



    @Override
    public void update(String c) {
        //TODO implement a part of the pattern here
        turnOn((c.equalsIgnoreCase("RED") && Color.RED.getRGB() == super.on.getRGB() )
                || (c.equalsIgnoreCase("YELLOW") && Color.YELLOW.getRGB() == super.on.getRGB())
                || ( c.equalsIgnoreCase("GREEN") && Color.GREEN.getRGB() == super.on.getRGB() ));
    }






    
    

}
