package frc.robot.commands.drivetrain;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import frc.robot.subsystems.DriveTrain;
import frc.robot.Robot;

public class driveTrackReflective extends PIDCommand {
    public driveTrackReflective(DriveTrain m_drive) {
        super(new PIDController(0.01, 0, 0),
        
            () -> Robot.photon.getYaw(),
            0,
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
        return getController().atSetpoint();
    }
}
