/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uweaccomodationsystem.model;

/**
 *
 * @author callumjones
 */
public enum CleaningStatus 
{
    CLEAN("Clean"),
    DIRTY("Dirty"),
    OFFLINE("Offline");
        
    private String description;
        
    CleaningStatus(String description)
    {
        this.description = description;
    }
        
    public String getDescription()
    {
        return description;
    }

}