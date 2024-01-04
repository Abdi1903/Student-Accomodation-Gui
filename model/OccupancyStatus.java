/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uweaccomodationsystem.model;

/**
 *
 * @author anour
 */
public enum OccupancyStatus 
{
    OCCUPIED("Occupied"),
    UNOCCUPIED("Unoccupied");
        
    private String description;
        
    OccupancyStatus(String description)
    {
        this.description = description;
    }
        
    public String getDescription()
    {
        return description;
    }

}
