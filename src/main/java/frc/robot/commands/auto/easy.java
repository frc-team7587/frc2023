package frc.robot.commands.auto;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Robot;
import frc.robot.commands.arm.armIn;
import frc.robot.commands.arm.armOut;
import frc.robot.commands.combos.mid;
import frc.robot.commands.drivetrain.driveStraight;
import frc.robot.commands.intake.intakeOut;
import frc.robot.subsystems.drivetrain;
import frc.robot.commands.pivot.pivotGoTo;
import frc.robot.commands.arm.armIn;
import frc.robot.commands.elevator.elevatorGoTo;
import frc.robot.Constants;

public class easy extends SequentialCommandGroup {
    public easy() {
        addCommands(
                // new driveStraight(Robot.m_drive, -10, Robot.m_drive.getAverageDistance()),
                Commands.parallel(new elevatorGoTo(Robot.m_elevator, Constants.elevatorMid),
                new pivotGoTo(Robot.m_pivot, Constants.pivotMid)),
                new armIn(Robot.m_arm),
                new intakeOut(Robot.m_intake),
                new driveStraight(Robot.m_drive, -70, Robot.m_drive.getAverageDistance()));
        // new armOut(Robot.m_arm),
        // new intakeOut(Robot.m_intake),
        // new armIn(Robot.m_arm),
        // new driveStraight(Robot.m_drive, -60.69,
        // Robot.m_drive.getAverageDistance()));
    }
}
