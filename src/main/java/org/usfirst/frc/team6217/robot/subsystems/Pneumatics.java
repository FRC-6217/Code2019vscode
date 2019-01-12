package org.usfirst.frc.team6217.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team6217.robot.commands.Grabbers;

public class Pneumatics extends Subsystem{
    DoubleSolenoid sol1;
    
    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new Grabbers());
    }

    public void runSolenoid(DoubleSolenoid.Value direction){
        sol1.set(direction);
    }

}