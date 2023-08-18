// package frc.robot.commands.drivetrain;

// import edu.wpi.first.math.controller.PIDController;
// import edu.wpi.first.wpilibj2.command.PIDCommand;
// import frc.robot.subsystems.DriveTrain;
// import frc.robot.Robot;

// public class DriveTurn extends PIDCommand {
    
//     public driveTurn(DriveTrain driveTrain, double angle, double current) {
//         super(new PIDController(0.01, 0, 0),
//             () -> Robot.pos[0],
//             current + angle,
//             (output) -> driveTrain.drive(0, output),
//             driveTrain);
        
//             getController().enableContinuousInput(-180, 180);
//             getController().setTolerance(1, 0);
//     }

//     @Override
//     public void initialize() {
    
//     }

//     @Override
//     public boolean isFinished() {
//         return getController().atSetpoint();
//     }
// }
