/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practiceRobot.subsystems.interfaces;

/**
 * The interface for the ArticulateShooter subsystem. 
 * @author Manu S.
 */
public interface IArticulateShooter 
{
    /**
     * Angles the shooter up.
     */
    public void raiseShooter();
    
    /**
     * Angles the shooter down.
     */
    public void lowerShooter();
    
    /**
     * Specifies the speed that the shooter
     * should move at.
     * @param speed the speed between -1.0 and 1.0
     * negative for down and positive for up
     */
    public void moveShooter(double speed);
    
}
