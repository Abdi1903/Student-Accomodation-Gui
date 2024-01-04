/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uweaccomodationsystem.model;

/**
 *
 * @author anour
 */
public class Room implements Hall {
    private int roomNumber;
    private String description;
    private float price;
    private Lease lease;
    private OccupancyStatus occupancyStatus;
    private CleaningStatus cleaningStatus;

    public Room(int roomNumber,
                String description,
                float price,
                Lease lease,
                OccupancyStatus occupancyStatus,
                CleaningStatus cleaningStatus)
    {   
        this.roomNumber = roomNumber;
        this.description = description;
        this.price = price;
        this.lease = lease;
        this.occupancyStatus = occupancyStatus;
        this.cleaningStatus = cleaningStatus;
    }
    
    public int getRoomNumber(){
        return roomNumber;
    }
    
    public String getDescription(){
        return description;
    }
    
    public float getPrice() {
        return price;
    }
    
    public void setPrice() {
        this.price = price;
    }
    
    public CleaningStatus getCleaningStatus() {
        return cleaningStatus;
    }
    
    public void setCleaningStatus() {
        this.cleaningStatus = cleaningStatus;
    }
    
    public OccupancyStatus getOccupancyStatus() {
        return occupancyStatus;
    }
    
    public void setOccupancyStatus() {
        this.occupancyStatus = occupancyStatus;
    }
    
    public Lease getLease() {
        return lease;
    }
    
    public void setLease() {
        this.lease = lease;
    }
    
    public void cancelLease() {
        lease = null;
    }
}

