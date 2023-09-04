package frc.robot.commands.auto;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Robot;
import frc.robot.commands.intake.IntakeGoTo;

public class PopAndLock extends SequentialCommandGroup{
    public PopAndLock() {
        addCommands(
        new IntakeGoTo(Robot.intake, 0.5),
        new IntakeGoTo(Robot.intake, 0));
    }
}
