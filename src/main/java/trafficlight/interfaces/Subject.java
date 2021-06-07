package trafficlight.interfaces;

import trafficlight.gui.TrafficLight;
import trafficlight.states.State;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Subject  {
     List<TrafficLight> colors  = new ArrayList<>();

    public void notifyObservers(String s) {
        for (TrafficLight color : this.colors) {
            color.update(s);
        }
    }

    public void addObserver(TrafficLight c) {
      colors.add(c);
    }

   public void removeObserver(TrafficLight c) {
        colors.remove(c);

    }
}
