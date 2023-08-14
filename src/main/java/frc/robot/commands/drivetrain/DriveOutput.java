package frc.robot.commands.drivetrain;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;

public class driveOutput extends CommandBase {
    private DriveTrain drive;
    private double max;

    public driveOutput(DriveTrain subsystem, double max) {
        addRequirements(subsystem);
        this.drive = subsystem;
        this.max = max;
    }

    @Override
    public void execute() {
        drive.setMaxOutput(max);
    }

    @Override
    public void end(boolean interrupted) {
        drive.setMaxOutput(1);
    }
}
