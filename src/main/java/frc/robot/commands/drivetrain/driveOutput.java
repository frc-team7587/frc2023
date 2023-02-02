package frc.robot.commands.drivetrain;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drivetrain;

public class driveOutput extends CommandBase {
    private drivetrain m_drive;
    private double m_max;

    public driveOutput(drivetrain subsystem, double max) {
        addRequirements(subsystem);
        m_drive = subsystem;
        m_max = max;
    }

    @Override
    public void execute() {
        m_drive.setMaxOutput(m_max);
    }

    @Override
    public void end(boolean interrupted) {
        m_drive.setMaxOutput(1);
    }
}
