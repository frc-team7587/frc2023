package frc.robot.commands.drivetrain;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import frc.robot.subsystems.DriveTrain;
import frc.robot.Robot;

public class DriveTrackReflective extends PIDCommand {
    public DriveTrackReflective(DriveTrain driveTrain) {
        super(new PIDController(0.01, 0, 0),
            () -> Robot.photon.getYaw(),
            0,
            (output) -> driveTrain.drive(0, output),
            driveTrain);
        
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
