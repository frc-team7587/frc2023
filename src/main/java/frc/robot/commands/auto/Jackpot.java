package frc.robot.commands.auto;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Robot;
import frc.robot.commands.arm.ArmIn;
import frc.robot.commands.arm.ArmOut;
import frc.robot.commands.drivetrain.DriveStraight;
import frc.robot.commands.intake.intakeOut;

public class Jackpot extends SequentialCommandGroup {
    public Jackpot() {
        addCommands(
        new DriveStraight(Robot.drive, 60.69, Robot.drive.getAverageDistance()),
        new ArmOut(Robot.arm),
        new intakeOut(Robot.intake),
        new ArmIn(Robot.arm),
        new DriveStraight(Robot.drive, -60.69, Robot.drive.getAverageDistance())
        );
    }
}
