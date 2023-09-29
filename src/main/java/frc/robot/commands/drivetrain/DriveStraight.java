package frc.robot.commands.drivetrain;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import frc.robot.Robot;
import frc.robot.subsystems.drivetrain;

public class driveStraight extends PIDCommand {
    
    private final drivetrain m_drive;
    private final double target;

    public driveStraight(drivetrain m_drive, double distance, double current) {
        super(new PIDController(0.005, 0.001, 0),
        
            () -> m_drive.getAverageDistance(),
            current + distance,
            (output) -> m_drive.drive(output, 0),
            m_drive);

            // getController().enableContinuousInput(-180, 180);
            getController().setTolerance(1, 0);

            this.m_drive = m_drive;
            this.target = current + distance;
    }

    @Override
    public void initialize() {
        // m_drive.resetEncoders();
    }

    @Override
    public boolean isFinished() {
        return Robot.m_drive.getAverageDistance() >= target - 2 &&  Robot.m_drive.getAverageDistance() <= target + 2;
    }

    @Override
    public void end(boolean interrupted) {
        System.out.println("end");
    }
}
