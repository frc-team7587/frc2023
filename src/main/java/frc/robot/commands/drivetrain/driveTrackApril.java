package frc.robot.commands.drivetrain;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import frc.robot.subsystems.drivetrain;
import frc.robot.Robot;

public class driveTrackApril extends PIDCommand {
    
    public driveTrackApril(drivetrain m_drive) {
        super(new PIDController(0.0075, 0.005, 0),
        
            () -> Robot.photon.getYaw(),
            12,
            (output) -> m_drive.drive(0, output),
            m_drive);
        
            getController().enableContinuousInput(-180, 180);
            getController().setTolerance(1, 0);

    }

    @Override
    public void initialize() {
    }

    @Override
    public boolean isFinished() {
        return Robot.photon.getYaw() >= 11 && Robot.photon.getYaw() <= 13;
    }

    @Override
    public void end(boolean interrupted) {
        System.out.println("end");
    }

}
