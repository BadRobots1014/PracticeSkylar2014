/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practiceRobot.subsystems;

import com.practiceRobot.RobotMap;
import com.practiceRobot.subsystems.interfaces.IShooter;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

/**
 * This class controls the Shooter subsystem. It has methods
 * for shooting frisbees in the 2013 FRC Challenge: Ultimate Ascent.
 * @author Manu S.
 */
public class Shooter extends BadSubsystem implements IShooter
{
    private SpeedController controllerBack;
    private SpeedController controllerFront;
    private static Shooter instance;
    
    /**
     * Gets the Shooter instance. If instance hasn't been
     * initialized, construct a new one and return it.
     * @return instance - the current instance
     */
    public Shooter getInstance()
    {
        if(instance == null)
        {
            instance = new Shooter();
        }
        
        return instance;
    }
    
    /**
     * Constructor. Makes a new Shooter object and
     * initializes the two speed controllers.
     */
    private Shooter()
    {
        controllerBack = new Talon(RobotMap.shooterBackSpeedPort);
        controllerFront = new Talon(RobotMap.shooterFrontSpeedPort);
    }
    
    protected void initialize() 
    {
    }

    /**
     * Returns the console identity. In most cases,
     * this will be the class name
     * @return 
     */
    public String getConsoleIdentity() 
    {
        return "Shooter";
    }

    protected void initDefaultCommand() 
    {
    }

    /**
     * Sets the speed of the two motors that give the
     * motors their speed. 
     * @param speed - speed of the motors between
     * -1.0 and 1.0
     */
    public void setSpeed(double speed) 
    {
        controllerBack.set(speed); // set to the same speed, otherwise
        controllerFront.set(speed); // frisbee would have problems shooting
    }
    
}
