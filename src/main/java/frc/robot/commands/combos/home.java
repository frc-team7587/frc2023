package frc.robot.commands.combos;

import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Robot;
import frc.robot.commands.pivot.pivotGoTo;
import frc.robot.commands.arm.armIn;
import frc.robot.commands.elevator.elevatorGoTo;

public class home extends SequentialCommandGroup {


    public home() {
        addCommands(
            Commands.parallel(new pivotGoTo(Robot.m_pivot, 0),
            new elevatorGoTo(Robot.m_elevator, 0)),
            new armIn(Robot.m_arm)
        );
    }
}

