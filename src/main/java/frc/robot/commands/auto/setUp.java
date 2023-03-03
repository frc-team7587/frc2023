package frc.robot.commands.auto;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.commands.arm.pivotGoTo;
import frc.robot.commands.claw.clawIn;
import frc.robot.commands.claw.clawOut;
import frc.robot.commands.drivetrain.driveStraight;
import frc.robot.commands.drivetrain.driveTurn;

public class setUp extends CommandBase{
    public setUp() {
        new driveStraight(Robot.m_drive, -60.69);
        new driveTurn(Robot.m_drive, 180);
        new pivotGoTo(Robot.m_arm, 0.5);
        new clawIn(Robot.m_claw);
        new clawOut(Robot.m_claw);
    }
}
