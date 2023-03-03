package frc.robot.commands.auto;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.commands.drivetrain.driveStraight;

public class easy extends CommandBase {
    public easy() {
        new driveStraight(Robot.m_drive, 60.69);
        //make a delay
        new driveStraight(Robot.m_drive, -60.69);
    }
}
