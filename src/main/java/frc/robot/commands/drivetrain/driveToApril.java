// package frc.robot.commands.drivetrain;

// import edu.wpi.first.math.controller.PIDController;
// import edu.wpi.first.wpilibj2.command.PIDCommand;
// import frc.robot.subsystems.drivetrain;
// import frc.robot.Robot;

// public class driveToApril extends PIDCommand {
    
//     public driveToApril(drivetrain m_drive) {
//         // super(new PIDController(0.01, 0, 0),
        
//         //     () -> Robot.photon.getAprilDistance(),
//         //     0.5, //how far we want to be from april tag in meters
//         //     (output) -> m_drive.drive(output, 0),
//         //     m_drive);
        
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
