package frc.robot.commands.drivetrain;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import frc.robot.subsystems.drivetrain;
import frc.robot.Robot;

public class driveTrack extends PIDCommand {
    
    public driveTrack(drivetrain m_drive) {
        super(new PIDController(0.01, 0, 0),
        
            () -> Robot.limelight.getTX(),
            0,
            (output) -> m_drive.drive(0, output),
            m_drive);
        
            getController().enableContinuousInput(-180, 180);
            getController().setTolerance(1, 0);

    }

    @Override
    public void initialize() {
        Robot.gyro.reset();
    }

    @Override
    public boolean isFinished() {
        return getController().atSetpoint();
    }
}
