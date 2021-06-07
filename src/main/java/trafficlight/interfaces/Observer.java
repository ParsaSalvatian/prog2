package trafficlight.interfaces;

import trafficlight.gui.TrafficLight;
import trafficlight.states.State;

import java.awt.*;

public interface Observer {
    void update(String c);
}
