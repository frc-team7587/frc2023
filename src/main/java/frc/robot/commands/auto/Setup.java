// package frc.robot.commands.auto;

// import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
// import frc.robot.Robot;
// import frc.robot.commands.arm.armIn;
// import frc.robot.commands.arm.armOut;
// import frc.robot.commands.combos.reset;
// import frc.robot.commands.pivot.pivotGoTo;
// import frc.robot.commands.drivetrain.driveStraight;
// import frc.robot.commands.drivetrain.driveTurn;
// import frc.robot.commands.intake.intakeIn;
// import frc.robot.commands.intake.intakeOut;
// import frc.robot.Constants;
// import frc.robot.commands.elevator.*;

// public class Setup extends SequentialCommandGroup {
//     public Setup() {
//         addCommands(
//         // new driveStraight(Robot.m_drive, 60.69, Robot.m_drive.getAverageDistance()),
//         // new armOut(Robot.m_arm),
//         // new intakeOut(Robot.m_intake),
//         // new armIn(Robot.m_arm),
//         // new driveTurn(Robot.m_drive, 180, Robot.pos[0]),
//         // new pivotGoTo(Robot.m_pivot, 0.5),
//         // new armIn(Robot.m_arm),
//         // new armOut(Robot.m_arm));
//         new elevatorGoTo(Robot.elevator, Constants.elevatorMid),
//         new pivotGoTo(Robot.pivot, Constants.pivotMid),
//         new armIn(Robot.arm),
//         new intakeOut(Robot.intake),
//         new driveStraight(Robot.drive, 70, Robot.drive.getAverageDistance()),
//         new driveTurn(Robot.drive, 180, Robot.pos[0]),
//         new pivotGoTo(Robot.pivot, Constants.pivotUpper),
//         new intakeIn(Robot.intake),
//         new reset(),
//         new driveTurn(Robot.drive, 180, Robot.pos[0]),
//         new driveStraight(Robot.drive, 70, Robot.drive.getAverageDistance())

//         );
//     }
// }
