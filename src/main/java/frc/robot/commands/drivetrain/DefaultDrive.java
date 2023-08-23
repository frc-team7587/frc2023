package frc.robot.commands.drivetrain;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.subsystems.DriveTrain;

public class DefaultDrive extends CommandBase {
    private DriveTrain drive;

    public DefaultDrive(DriveTrain subsystem) {
        addRequirements(subsystem);
        drive = subsystem;
    }

    @Override
    public void execute() {
        drive.drive(Robot.joystick.getY() * Robot.joystick.getThrottle(), .6 * Robot.joystick.getTwist() * 0.85 * Robot.joystick.getThrottle());
    }

    @Override
    public void end(boolean interrupted) {
        drive.drive(0, 0);
    }
}
