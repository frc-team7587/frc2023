package frc.robot.commands.auto;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.commands.arm.telescopeGoTo;

public class popAndLock extends CommandBase{
    public popAndLock() {
        new telescopeGoTo(Robot.m_arm, 0.5);
        new telescopeGoTo(Robot.m_arm, 0);
    }
}
