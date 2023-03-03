package frc.robot.commands.auto;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.commands.drivetrain.driveStraight;
import frc.robot.commands.drivetrain.driveTurn;

public class zoomies extends CommandBase{
    public zoomies() {
        new driveStraight(Robot.m_drive, -60.69);
        new driveTurn(Robot.m_drive, 270);
        new driveStraight(Robot.m_drive, 60.69);
        new driveTurn(Robot.m_drive, 90);
    }
}
