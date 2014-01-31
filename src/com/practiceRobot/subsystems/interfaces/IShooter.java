/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practiceRobot.subsystems.interfaces;

/**
 * The interface for the Shooter subsystem.
 * @author Manu S.
 */
public interface IShooter 
{
    /**
     * Moves the shooter at the specified speed.
     * @param speed the speed we want the
     * Shooter to shoot the frisbees at (between
     * -1.0 and 1.0)
     */
    public void setSpeed(double speed);
}
