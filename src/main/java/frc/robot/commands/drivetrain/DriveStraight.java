package frc.robot.commands.drivetrain;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import frc.robot.Robot;
import frc.robot.subsystems.DriveTrain;

public class DriveStraight extends PIDCommand {
    private final DriveTrain driveTrain;
    private final double target;

    public DriveStraight(DriveTrain driveTrain, double distance, double current) {
        super(new PIDController(0.005, 0.001, 0),
            () -> driveTrain.getAverageDistance(),
            current + distance,
            (output) -> driveTrain.drive(output, 0),
            driveTrain);

            // getController().enableContinuousInput(-180, 180);
            getController().setTolerance(1, 0);

            this.driveTrain = driveTrain;
            this.target = current + distance;
    }

    @Override
    public void initialize() {
        // drive.resetEncoders();
    }

    @Override
    public boolean isFinished() {
        return Robot.drive.getAverageDistance() >= target - 2 &&  Robot.drive.getAverageDistance() <= target + 2;
    }

    @Override
    public void end(boolean interrupted) {
        System.out.println("end");
    }
}
