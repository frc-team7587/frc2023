// package frc.robot.commands.drivetrain;

// import edu.wpi.first.math.controller.PIDController;
// import edu.wpi.first.wpilibj2.command.PIDCommand;
// import frc.robot.Robot;
// import frc.robot.subsystems.DriveTrain;

// public class DriveClimb extends PIDCommand {

//     public driveClimb(DriveTrain driveTrain) {
//         super(new PIDController(0.06, 0, 0),
        
//             () -> Robot.pos[1],
//             58.125,
//             (output) -> driveTrain.drive(output, 0),
//             driveTrain);

//             getController().enableContinuousInput(-180, 180);
//             getController().setTolerance(2, 0);

//     }

//     @Override
//     public void initialize() {

//     }

//     @Override
//     public boolean isFinished() {
//         return getController().atSetpoint();
//     }
// }
