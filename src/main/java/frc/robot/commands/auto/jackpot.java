package frc.robot.commands.auto;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Robot;
import frc.robot.commands.arm.armIn;
import frc.robot.commands.arm.armOut;
import frc.robot.commands.drivetrain.driveStraight;
import frc.robot.commands.intake.IntakeOut;

public class jackpot extends SequentialCommandGroup{
    public jackpot() {
        addCommands(
        new driveStraight(Robot.m_drive, 60.69, Robot.m_drive.getAverageDistance()),
        new armOut(Robot.m_arm),
        new IntakeOut(Robot.m_intake),
        new armIn(Robot.m_arm),
        new driveStraight(Robot.m_drive, -60.69, Robot.m_drive.getAverageDistance())
        );
    }
}
