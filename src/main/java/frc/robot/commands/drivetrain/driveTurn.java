package frc.robot.commands.drivetrain;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import frc.robot.subsystems.drivetrain;
import frc.robot.Robot;

public class driveTurn extends PIDCommand {

    private static double currentAngle;
    
    public driveTurn(drivetrain m_drive, double angle) {
        super(new PIDController(0.01, 0, 0),
        
            () -> Robot.pos[0],
            currentAngle + angle,
            (output) -> m_drive.drive(0, output),
            m_drive);
        
            getController().enableContinuousInput(-180, 180);
            getController().setTolerance(1, 0);

    }

    @Override
    public void initialize() {
        currentAngle = Robot.pos[0];
    }

    @Override
    public boolean isFinished() {
        return getController().atSetpoint();
    }
}
