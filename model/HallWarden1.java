/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uweaccomodationsystem.model;

/**
 *
 * @author 44750
 */
public class HallWarden {
    private ArrayList<Hall> halls;
    
     public HallWarden () {
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
