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

// public class setUp extends SequentialCommandGroup {
//     public setUp() {
//         addCommands(
//         // new driveStraight(Robot.m_drive, 60.69, Robot.m_drive.getAverageDistance()),
//         // new armOut(Robot.m_arm),
//         // new intakeOut(Robot.m_intake),
//         // new armIn(Robot.m_arm),
//         // new driveTurn(Robot.m_drive, 180, Robot.pos[0]),
//         // new pivotGoTo(Robot.m_pivot, 0.5),
//         // new armIn(Robot.m_arm),
//         // new armOut(Robot.m_arm));
//         new elevatorGoTo(Robot.m_elevator, Constants.elevatorMid),
//         new pivotGoTo(Robot.m_pivot, Constants.pivotMid),
//         new armIn(Robot.m_arm),
//         new intakeOut(Robot.m_intake),
//         new driveStraight(Robot.m_drive, 70, Robot.m_drive.getAverageDistance()),
//         new driveTurn(Robot.m_drive, 180, Robot.pos[0]),
//         new pivotGoTo(Robot.m_pivot, Constants.pivotUpper),
//         new intakeIn(Robot.m_intake),
//         new reset(),
//         new driveTurn(Robot.m_drive, 180, Robot.pos[0]),
//         new driveStraight(Robot.m_drive, 70, Robot.m_drive.getAverageDistance())

//         );
//     }
// }
