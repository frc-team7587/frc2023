package frc.robot.commands.drivetrain;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import frc.robot.subsystems.DriveTrain;
import frc.robot.Robot;

public class DriveToReflective extends PIDCommand {
    public DriveToReflective(DriveTrain drivedriveTrain) {
        super(new PIDController(0.01, 0, 0),
            () -> Robot.photon.getReflectiveDistance(),
            0, //how far we want to be from reflective tape in meters
            (output) -> drivedriveTrain.drive(output, 0),
            drivedriveTrain);
        
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
