/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practiceRobot.subsystems.interfaces;

/**
 *
 * @author rsinghal
 */
public interface IArticulateShooter 
{
    public void raiseShooter();
    
    public void lowerShooter();
    
    public void moveShooter(double speed);
    
}
