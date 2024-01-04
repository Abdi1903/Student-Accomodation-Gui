/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uweaccomodationsystem.model;
import java.util.ArrayList;

/**
 *
 * @author anour
 */
public class HallManager {
    private ArrayList<Hall> halls;
    
    public HallManager () {
        halls = new ArrayList<Hall>();
    }
    
    public ArrayList<Hall> getHalls () {
        return halls;
    }
    
    public void addHall(Hall hall) {
        halls.add(hall);
    }
    
    public void addHalls(ArrayList<Hall> halls) {
        this.halls = halls;
    }
}


