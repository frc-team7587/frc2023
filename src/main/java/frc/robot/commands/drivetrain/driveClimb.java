package frc.robot.commands.drivetrain;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import frc.robot.Robot;
import frc.robot.subsystems.drivetrain;

public class driveClimb extends PIDCommand {

    public driveClimb(drivetrain m_drive) {
        super(new PIDController(0.01, 0, 0),
        
            () -> Robot.pos[2],
            0,
            (output) -> m_drive.drive(output, 0),
            m_drive);

            getController().enableContinuousInput(-180, 180);
            getController().setTolerance(2, 0);

    }

    @Override
    public void initialize() {
    }

    @Override
    public boolean isFinished() {
        return getController().atSetpoint();
    }
}
