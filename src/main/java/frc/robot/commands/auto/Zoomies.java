// package frc.robot.commands.auto;

// import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
// import frc.robot.Robot;
// import frc.robot.commands.drivetrain.driveStraight;
// import frc.robot.commands.drivetrain.driveTurn;

// public class Zoomies extends SequentialCommandGroup{
//     public Zoomies() {
//         addCommands(
//             new driveStraight(Robot.m_drive, -60.69, Robot.m_drive.getAverageDistance()),
//             new driveTurn(Robot.m_drive, -90, Robot.pos[0]),
//             new driveStraight(Robot.m_drive, 60.69, Robot.m_drive.getAverageDistance()),
//             new driveTurn(Robot.m_drive, 90, Robot.pos[0]));
//     }
// }
