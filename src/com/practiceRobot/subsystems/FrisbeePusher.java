/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practiceRobot.subsystems;

import com.practiceRobot.RobotMap;
import com.practiceRobot.subsystems.interfaces.IFrisbeePusher;
import edu.wpi.first.wpilibj.Relay;

/**
 * This class controls the FrisbeePusher subsystem. The FrisbeePusher
 * pushes frisbees into the shooter, which shoots them out.
 * @author Manu S.
 */
public class FrisbeePusher extends BadSubsystem implements IFrisbeePusher
{
    Relay frisbeePusher;
    
    private static FrisbeePusher instance;
    
    /**
     * Gets the current instance of the class.
     * If instance hasn't been initialized, 
     * construct a new FrisbeePusher and return it
     * @return the current instance of FrisbeePusher
     */
    public FrisbeePusher getInstance()
    {
        if(instance == null)
        {
            instance = new FrisbeePusher();
        }
        return instance;
    }
    
    /**
     * Constructor. Creates a new FrisbeePusher object.
     */
    public FrisbeePusher()
    {
        frisbeePusher = new Relay(RobotMap.frisbeePusherPort);
    }
    
    protected void initialize() 
    {
    }

    /**
     * Gets the console identity of this class. 
     * Usually the name of the class. 
     * @return the class name.
     */
    public String getConsoleIdentity() 
    {
        return "FrisbeePusher";
    }

    protected void initDefaultCommand() {
    }

    /**
     * As it's name might suggest,
     * pushes the frisbees into the 
     * Shooter system.
     */
    public void push() 
    {
        // Sets the Relay to push the frisbees
        // forward and into the Shooter
        frisbeePusher.set(Relay.Value.kOn);
    }
    
}
