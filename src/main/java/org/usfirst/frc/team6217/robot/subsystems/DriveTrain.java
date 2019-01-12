package org.usfirst.frc.team6217.robot.subsystems;

import org.usfirst.frc.team6217.robot.commands.JoystickDrive;

import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {
	private WheelDrive backRight = new WheelDrive(40, 43, 3);
	private WheelDrive backLeft = new WheelDrive(45, 46, 2);
	private WheelDrive frontRight = new WheelDrive(42, 41, 1);
	private WheelDrive frontLeft = new WheelDrive(47, 44, 0);

	private SwerveDriveClass swerveDrive = new SwerveDriveClass(backRight, backLeft, frontRight, frontLeft);

	public void initDefaultCommand() {
		setDefaultCommand(new JoystickDrive());

	}

	public void Drive(double x, double y, double z) {
		swerveDrive.drive(x, y, z);
	}
}