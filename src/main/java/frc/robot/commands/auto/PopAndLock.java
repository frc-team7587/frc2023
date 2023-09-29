package frc.robot.commands.auto;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Robot;
import frc.robot.commands.intake.intakeGoTo;

public class popAndLock extends SequentialCommandGroup{
    public popAndLock() {
        addCommands(
        new intakeGoTo(Robot.m_intake, 0.5),
        new intakeGoTo(Robot.m_intake, 0));
    }
}
