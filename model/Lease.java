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
public class Lease {
        private int leaseID;
        private Student student;
        private int duration;
        
        public Lease{
            int leaseID,
            Student student,
            int duration}
        {
            this.leaseID = leaseID;
            this.student = student;
            this.duration = duration;
        }
        public int getLeaseID(){
            return leaseID;
        }
        public Student getStudent(){
            return student;
        }
        public int getDuration(){
            return duration;
        }
    
}
