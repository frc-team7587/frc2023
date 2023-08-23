package frc.robot.commands.auto;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Robot;
import frc.robot.commands.intake.intakeGoTo;

public class PopAndLock extends SequentialCommandGroup{
    public PopAndLock() {
        addCommands(
        new intakeGoTo(Robot.intake, 0.5),
        new intakeGoTo(Robot.intake, 0));
    }
}
