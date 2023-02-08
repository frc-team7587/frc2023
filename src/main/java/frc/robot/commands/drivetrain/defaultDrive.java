package frc.robot.commands.drivetrain;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.subsystems.drivetrain;

public class defaultDrive extends CommandBase {
    private drivetrain m_drive;

    public defaultDrive(drivetrain subsystem) {
        addRequirements(subsystem);
        m_drive = subsystem;
    }

    @Override
    public void execute() {
        m_drive.drive(Robot.logi.getY() * Robot.logi.getThrottle(), -Robot.logi.getTwist() * Robot.logi.getThrottle());
    }

    @Override
    public void end(boolean interrupted) {
        m_drive.drive(0, 0);
    }
}
