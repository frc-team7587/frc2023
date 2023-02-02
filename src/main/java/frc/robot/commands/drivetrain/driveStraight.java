package frc.robot.commands.drivetrain;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import frc.robot.subsystems.drivetrain;

public class driveStraight extends PIDCommand {
    
    private final double distance;
    private final drivetrain m_drive;

    public driveStraight(drivetrain m_drive, double distance, double speed) {
        super(new PIDController(0.01, 0, 0),
        
            () -> m_drive.getLeftEncoderDistance() - m_drive.getRightEncoderDistance(),
            0,
            (output) -> {
                if (Math.abs(m_drive.getAverageDistance()) < distance) {
                    m_drive.drive(speed, output);
                } else {
                    m_drive.drive(0, output);
                }
            },
            m_drive);
        
            getController().enableContinuousInput(-180, 180);
            getController().setTolerance(1);

            this.distance = distance;
            this.m_drive = m_drive;
    }

    @Override
    public void initialize() {
        m_drive.resetEncoders();
    }

    @Override
    public boolean isFinished() {
        return getController().atSetpoint() && Math.abs(m_drive.getAverageDistance()) >= distance;
    }
}
