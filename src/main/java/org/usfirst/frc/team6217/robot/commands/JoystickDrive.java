package org.usfirst.frc.team6217.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6217.robot.Robot;

/**
 *
 */
public class JoystickDrive extends Command {
    
    private double x;
    private double y;
    private double z;
    
    public JoystickDrive() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.m_driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        x = Robot.m_oi.joystick.getRawAxis(0);
        y = Robot.m_oi.joystick.getRawAxis(1);
        z = Robot.m_oi.joystick.getRawAxis(2);
        
        x = (Math.abs(x) > .15 ? x : 0.0);
        y = (Math.abs(y) > .15 ? y : 0.0);
        z = (Math.abs(z) > .15 ? z : 0.0);

        Robot.m_driveTrain.Drive (x, y, z);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	isFinished();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
