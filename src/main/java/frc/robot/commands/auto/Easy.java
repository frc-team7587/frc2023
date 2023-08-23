package frc.robot.commands.auto;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Robot;
import frc.robot.commands.arm.ArmIn;
import frc.robot.commands.arm.ArmOut;
import frc.robot.commands.combos.AutoRotate;
import frc.robot.commands.combos.Home;
import frc.robot.commands.combos.Mid;
import frc.robot.commands.combos.Upper;
import frc.robot.commands.drivetrain.DriveStraight;
import frc.robot.commands.intake.intakeOut;
import frc.robot.subsystems.DriveTrain;
import frc.robot.commands.pivot.pivotDown;
import frc.robot.commands.pivot.pivotGoTo;
import frc.robot.commands.rgb.rainbow;
import frc.robot.commands.arm.ArmIn;
import frc.robot.commands.elevator.ElevatorGoTo;
import frc.robot.Constants;

public class Easy extends SequentialCommandGroup {
    public Easy() {
        addCommands(
            // new mid(),
            new Upper().withTimeout(1),
            new ArmOut(Robot.arm).withTimeout(0.65),
            new pivotDown(Robot.pivot).withTimeout(0.5),
            new intakeOut(Robot.intake).withTimeout(1),
            new Home().withTimeout(2),
            Commands.parallel(new DriveStraight(Robot.drive, -130, Robot.drive.getAverageDistance()), new rainbow(Robot.rgb)).withTimeout(5),
            new DriveStraight(Robot.drive, 10, Robot.drive.getAverageDistance()).withTimeout(1.75)
            // -70 for just going on board
        );
        // new armOut(Robot.m_arm),
        // new intakeOut(Robot.m_intake),
        // new armIn(Robot.m_arm),
        // new driveStraight(Robot.m_drive, -60.69,
        // Robot.m_drive.getAverageDistance()));
    }
}
