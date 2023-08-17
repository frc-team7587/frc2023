package frc.robot.commands.auto;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Robot;
import frc.robot.commands.arm.armIn;
import frc.robot.commands.arm.armOut;
import frc.robot.commands.combos.autoRot;
import frc.robot.commands.combos.home;
import frc.robot.commands.combos.mid;
import frc.robot.commands.combos.upper;
import frc.robot.commands.drivetrain.driveStraight;
import frc.robot.commands.intake.IntakeOut;
import frc.robot.subsystems.drivetrain;
import frc.robot.commands.pivot.PivotDown;
import frc.robot.commands.pivot.PivotGoTo;
import frc.robot.commands.rgb.Rainbow;
import frc.robot.commands.arm.armIn;
import frc.robot.commands.elevator.elevatorGoTo;
import frc.robot.Constants;

public class easy extends SequentialCommandGroup {
    public easy() {
        addCommands(

                // new mid(),
                new upper().withTimeout(1),
                new armOut(Robot.m_arm).withTimeout(0.65),
                new PivotDown(Robot.m_pivot).withTimeout(0.5),
                new IntakeOut(Robot.m_intake).withTimeout(1),
                new home().withTimeout(2),
                Commands.parallel(new driveStraight(Robot.m_drive, -130, Robot.m_drive.getAverageDistance()), new Rainbow(Robot.m_rgb)).withTimeout(5),
                new driveStraight(Robot.m_drive, 10, Robot.m_drive.getAverageDistance()).withTimeout(1.75)

                //-70 for just going on board

        );
        // new armOut(Robot.m_arm),
        // new intakeOut(Robot.m_intake),
        // new armIn(Robot.m_arm),
        // new driveStraight(Robot.m_drive, -60.69,
        // Robot.m_drive.getAverageDistance()));
    }
}
