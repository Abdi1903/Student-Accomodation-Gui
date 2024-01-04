/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uweaccomodationsystem.model;
import java.util.ArrayList;

/**
 *
 * @author callumjones
 */

public class Hall implements AccomodationSystem {
    private String name;
    private int number;
    private String address;
    private String telephoneNumber;
    private ArrayList<Room> rooms;
    
    public Hall(String name, 
                int number, 
                String address, 
                String telephoneNumber, 
                ArrayList<Room> rooms)
    {
        this.name = name;
        this.number = number;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.rooms = rooms;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getNumber()
    {
        return number;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public String telephoneNumber()
    {
        return telephoneNumber;
    }
    
    public ArrayList<Room> getRooms()
    {
        return rooms;
    }
    
    public int getTotalNumberOfRooms()
    {
        return rooms.size();
    }
    
//    public findRoom(int roomNumber)
//    {
//        return room;
//    }

}