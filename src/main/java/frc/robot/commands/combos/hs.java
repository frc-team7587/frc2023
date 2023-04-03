package frc.robot.commands.combos;

import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Robot;
import frc.robot.commands.pivot.pivotGoTo;
import frc.robot.commands.arm.armOut;
import frc.robot.commands.elevator.elevatorGoTo;
import frc.robot.Constants;

public class hs extends SequentialCommandGroup {


    public hs() {
        addCommands(
            Commands.parallel(new elevatorGoTo(Robot.m_elevator, Constants.elevatorHs),
            new pivotGoTo(Robot.m_pivot, Constants.pivotHs)),
            new armOut(Robot.m_arm)
        );
    }
}

