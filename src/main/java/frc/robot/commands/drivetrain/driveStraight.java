package frc.robot.commands.drivetrain;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import frc.robot.subsystems.drivetrain;

public class driveStraight extends PIDCommand {
    
    private final drivetrain m_drive;

    public driveStraight(drivetrain m_drive, double distance) {
        super(new PIDController(0.01, 0, 0),
        
            () -> m_drive.getAverageDistance(),
            distance,
            (output) -> m_drive.drive(output, 0),
            m_drive);

            // getController().enableContinuousInput(-180, 180);
            getController().setTolerance(1, 0);

            this.m_drive = m_drive;
    }

    @Override
    public void initialize() {
        m_drive.resetEncoders();
    }

    @Override
    public boolean isFinished() {
        return getController().atSetpoint();
    }
}
