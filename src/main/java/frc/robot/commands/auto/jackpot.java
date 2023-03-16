package frc.robot.commands.auto;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Robot;
import frc.robot.commands.drivetrain.driveStraight;

public class jackpot extends SequentialCommandGroup{
    public jackpot() {
        addCommands(
        new driveStraight(Robot.m_drive, 60.69),
        new armOut(),
        new intakeOut(),
        new armIn(),
        new driveStraight(Robot.m_drive, -60.69),
        );
    }
}
