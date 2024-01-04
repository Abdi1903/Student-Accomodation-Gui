/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uweaccomodationsystem.model;
import java.util.ArrayList;

/**
 *
 * @author 44750
 */
public class AccomodationSystem {
    
    private ArrayList<Hall> halls;
    private ArrayList<HallWarden> hallWardens;
    private HallManager hallManager;
    
 
    public AccomodationSystem(){
        halls = new ArrayList<Hall>();
        hallWardens = new ArrayList<HallWarden>();
        hallManager = new HallManager();
    }
    public void addHall(Hall hall)
    {
        halls.add(hall);
    }
    public ArrayList<Hall> getHalls()
    {
        return halls;
    }
    public ArrayList<HallWarden> getHallWardens()
    {
        return hallWardens;
    }
    
}
