package org.usfirst.frc.team6217.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Compressor;;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team6217.robot.commands.Grabbers;

public class Pneumatics extends Subsystem{
    private DoubleSolenoid sol1 = new DoubleSolenoid(1, 2);
    private Compressor c = new Compressor(0);
    
    
    
    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new Grabbers());
    }

    public void setUpCompressor(){
        c.setClosedLoopControl(true);
    }

    public void runSolenoid(DoubleSolenoid.Value direction){
        sol1.set(direction);
    }

}