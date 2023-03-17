package frc.robot.commands.auto;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Robot;
import frc.robot.commands.arm.armIn;
import frc.robot.commands.arm.armOut;
import frc.robot.commands.drivetrain.driveStraight;
import frc.robot.commands.intake.intakeOut;

public class jackpot extends SequentialCommandGroup{
    public jackpot() {
        addCommands(
        new driveStraight(Robot.m_drive, 60.69),
        new armOut(Robot.m_arm),
        new intakeOut(Robot.m_intake),
        new armIn(Robot.m_arm),
        new driveStraight(Robot.m_drive, -60.69)
        );
    }
}
