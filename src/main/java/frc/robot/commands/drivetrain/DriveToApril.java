package frc.robot.commands.drivetrain;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import frc.robot.subsystems.DriveTrain;
import frc.robot.Robot;

public class DriveToApril extends PIDCommand {
    public DriveToApril(DriveTrain driveTrain) {
        super(new PIDController(0.01, 0, 0),
            () -> Robot.photon.getDistance(),
            0.5, // how far we want to be from april tag in meters
            (output) -> driveTrain.drive(output, 0),
            driveTrain);
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
